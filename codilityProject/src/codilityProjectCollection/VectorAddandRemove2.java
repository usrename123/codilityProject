package codilityProjectCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorAddandRemove2 {

	// Mehtod to add element at position 
				public static void addElement( Character[] arr, Character element, int position) 
				{ 
					// Coverting array to ArrayList 
					List<Character> list = new ArrayList<>( 
						Arrays.asList(arr)); 
					
					// Adding the element at position 
					list.add(position - 1, element); 
					
					// Converting the list back to array 
					arr = list.toArray(arr); 

					// Printing the original array 
					System.out.println("Initial Array:\n"
									+ Arrays.toString(arr)); 

					// Printing the updated array 
	  System.out.println("\nArray with " + element + " inserted at position "+ position + ":\n"+ Arrays.toString(arr)); 
				} 
				
				// Drivers Method 
				public static void main(String[] args) 
				{ 
					// Sample array 
					Character[] arr = {'a','b','c'}; 
					
				
					// Element to be inserted 
					Character element = 'Z'; 
				
					// Position to insert 
					int position = 3; 
				
					// Calling the function to insert 
					addElement(arr, element, position); 
				} 
			

			 

}


