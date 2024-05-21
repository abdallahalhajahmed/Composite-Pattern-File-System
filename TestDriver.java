package file2419103;

import Reflection.Directory;

public class TestDriver {

    public static void main(String[] args) {
        
        // Test one
//        File courseworkpdf = new File("courseworkpdf",1);
//        File courseworkzip = new File("coursework zip file",2);
//                
//        Directory coursework = new Directory("coursework");
//        coursework.add(courseworkpdf);
//        coursework.add(courseworkzip);
//
//        Directory unittests = new Directory("unit tests");
//        File test1 = new File("unit test 1",56);
//        unittests.add(test1);
//
//        coursework.add(unittests);
//        coursework.remove(courseworkzip);
//        System.out.println(coursework.display("+-"));
//        
//        System.out.println( coursework.search("unit test 1").getName() );    
        
        //Test two
    	
        // Create directories
        Directory root = new Directory("root");
        Directory music = new Directory("music");
        Directory pictures = new Directory("pictures");
        Directory personal = new Directory("personal");
        Directory misc = new Directory("misc");
        

        // Create files
        File settings = new File("Settings", 10);
        File ringtone = new File("ringtone", 120);
        File familyHoliday = new File("family-holiday", 201);
        File portrait = new File("portrait", 134);
        File wallpaper = new File("wallpaper", 421);

        // Construct the directory structure
        root.add(settings); // adding a file
        root.add(music); // adding  a directory
        root.add(pictures); // adding a directory

        music.add(ringtone);
        
        pictures.add(personal);
        pictures.add(misc);
        personal.add(familyHoliday);
        personal.add(portrait);
        personal.add(misc);

        misc.add(wallpaper);
        
        // Display the directory structure
        System.out.println(root.display("\t"));
        System.out.println(root.search("Sscasaettings"));
    }
}
