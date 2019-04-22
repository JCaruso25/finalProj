import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sjw
 */
public class PersistantArrayListDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> myList = new PersistantArrayList<>();
        System.out.println("Populating list...");
        String [] pop = {"a", "b", "c", "d", "e", "f"};
        for (String s : pop) {
			myList.add(s);
		}
		System.out.println("Number of items (should be 6): " + myList.size());
		System.out.println("Location of \"c\" (should be 2): " + myList.indexOf("c"));
		System.out.println("Location of \"z\" (should be -1): " + myList.indexOf("z"));
		System.out.println("Contains \"a\" (should be true): " + myList.contains("a"));
		System.out.println("Set position 1 to have value \"z\" (should return \"b\"): " + myList.set(1, "z"));
		System.out.println("Check contents of list: ");
		for (String s : myList) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Check contents of toArray (should be identical to previous line): ");
		for (Object s : myList.toArray()) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Remove value in position 2 (sohuld be \"c\"): " + myList.remove(2));
		System.out.println("Checking location of \"d\" (should be 2): " + myList.lastIndexOf("d"));
		System.out.println("Adding more values...");
		myList.add("d");
		myList.add("e");
		myList.add(2, "q");
		myList.add("a");
		System.out.println("Check contents of list: ");
		for (String s : myList) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Getting value in position 2 (should be \"q\"): " + myList.get(2));
		System.out.println("Checking first location of \"d\" (should be 3): " + myList.indexOf("d"));
		System.out.println("Checking last location of \"d\" (should be 6): " + myList.lastIndexOf("d"));
		System.out.println("Checking first location of \"a\" (should be 0): " + myList.indexOf("a"));
		System.out.println("Checking last location of \"a\" (should be 8): " + myList.lastIndexOf("a"));
		System.out.println("attempting to add enough to resize...");
		for (int i = 0; i < 5; i++) {
			for (String s : pop) {
				myList.add(s);
			}
		}
		System.out.println("Displaying contents of list...");
		for (String s : myList) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Attempting to remove \"z\" (should return true): " + myList.remove("z"));
		System.out.println("Displaying contents of list...");
		for (String s : myList) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Saving to a file");
		myList.saveList("test.txt");
    }
    
}