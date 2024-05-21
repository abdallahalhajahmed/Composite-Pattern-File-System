package file2419103;

import Reflection.Component;

public class File implements Component {
	private String name;
	private int size;
	private int count = 0; // Variable to keep track of file count
	// Constructor to set the properties of the file
	public File(String name, int size) {
		this.name = name;
		this.size = size;
		count++;
	}
	
	// A getter method to get the name
	public String getName() {
		return this.name;
	}
	
	// A getter method to get the size
	public int getSize() {
		return this.size;
	}
	
	// A getter method to get the count
	public int getCount() {
		return count;
	}
	
     //	A display method that implements Component.display.
	 // It is used for a nice display of the filename and size.
	public String display(String prefix) {
		return String.format("%s (%d)\n", this.name, this.size);
	}

	// A search method that implements Component.search.
	// It returns null here because files can not add or remove files.
	public Component search(String name) {
		return null; 
	}
	
}
