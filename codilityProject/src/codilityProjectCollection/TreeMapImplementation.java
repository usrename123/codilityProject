package codilityProjectCollection;


	
		// TODO Auto-generated method stub
		// Java code to show creation, insertion, 
		// searching, and traversal in a TreeMap 

		import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*; 

		public class TreeMapImplementation { 

			static TreeMap<String, Integer> tree_map = new TreeMap<String, Integer>();

			// Insert values in the TreeMap
			static void insert() {
			 
				tree_map.put("smith",111); 
				tree_map.put("john", 212); 
				tree_map.put("Remma", 313); 
				tree_map.put("Ronit", 414); 
				tree_map.put("Ankita", 515); 

			} 
            //search a key in TreeMap 
			static void search(String key) 
			{ 

				System.out.println("\nIs key \""+ key + "\" present? "+ tree_map.containsKey(key)); 
			} 

			static void search(int value) 
			{ 

			System.out.println("\nIs key \""+ value + "\" present? "+ tree_map.containsKey(value)); 
			} 

			// Function to display the elements in TreeMap 
			static void display() 
			{ 
				// Displaying the TreeMap 
				System.out.println("\nDisplaying the TreeMap:"); 

				System.out.println("TreeMap: " + tree_map); 
			} 

			// Function to traverse TreeMap 
			static void traverse() 
			{ 
				for (Entry<String, Integer> e : tree_map.entrySet()) 
					System.out.println(e.getKey() + " " + e.getValue()); 
			} 

			// Driver code 
			public static void main(String[] args) { 
 

				// Inserting values in the TreeMap 
				insert(); 

				// Search key "50" in the TreeMap 
				search("Ankita"); 

				// Search value "Geeks" in the TreeMap 
				search("Rashitha"); 

				// Display the elements in TreeMap 
				display(); 

				// Traverse the TreeMap 
				traverse(); 
			} 
		


	}


