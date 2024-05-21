package file2419103;

import java.util.ArrayList;

import file2419103.Component;

public class Directory implements Component {
	// The following ArrayList will store the leaves
	private ArrayList<Component> directoryFiles;
	private String name;
	private static int variableLevel = 0; // A static variable to track prefix repetition and prevent doubling
	public Directory(String name) {
		directoryFiles = new ArrayList<Component>();
		this.name = name;
	}
	// A method for getting the name of the directory
	public String getName() {
		return this.name;
	}
	// A method for getting the size of the files within the diretory
	public int getSize() {
		int totalSize = 0; 
		for(Component a : directoryFiles) {
			totalSize += a.getSize(); // Only files count toward the size
		}
		return totalSize;
	}
	
	// A method for getting the count of the files within the directory
	public int getCount() {
		int fileCount = 0;
		for(Component a : directoryFiles) {
			fileCount += a.getCount(); // Only files count toward the count
		}
		return fileCount;
	}
	
	// Add and remove methods
	public void add(Component a) {
		directoryFiles.add(a);
	}
	
	public void remove(Component a) {
		directoryFiles.remove(a);
	}
	
    // A display method that also implements Component.display.
	// It provides a nice display of directory & file contents with good formatting.  
	public String display(String prefix) {
		variableLevel++; // Increment level
		String totalString = String.format("%s: (count=%d, size=%d)\n", this.name, getCount(), getSize());
		for(Component a: directoryFiles) {
			String temporaryString = "";
			for(int i = 0; i < variableLevel; i++) {
				temporaryString += prefix; // The amount of prefix repetitions is predicated on what level is.
			}
			temporaryString += a.display(prefix);
			totalString += temporaryString;
		}
		variableLevel--; // Decrement level
		return totalString;	// This returns a properly formatted display of the contents without doubling the prefix and with proper hierarchy. 
	}
			
	// A search method that also implements Component.search.
	// It can be used to search for a file name and returns its directory name.
	public Component search(String name) {
		Component reference = null; 
	    for (Component a : directoryFiles) { 
	    	reference = a.search(name);
	    	// Return a component if it is found.
	        if(reference != null) {
	        	return reference; 
	        } else if(a.getName().equals(name)) {
	        	return this;
	        }
	    }
	    return reference; // If no match is found, return null.
	}
	
}

