package codilityProjectCollection;

import java.util.Scanner;
import java.util.Vector;

public class VectorAddandRemove3 {

	public static void main(String[] args) {

		// Get the Strings
		String line = "tekarch";
		System.out.println("enter the object to be inserted");
		Scanner scan= new Scanner(System.in);
		String stringToBeInserted=scan.next();
		 System.out.println("please enter At which index");
		int index = scan.nextInt();

		Vector<Comparable> myVec = new Vector<Comparable>();

		// Convert the string to a char array and then just add each char to the vector
		char[] sChars = line.toCharArray();
		for (int i = 0; i < line.length(); i++) {
			myVec.add(sChars[i]);

		}
		for (int i = 0; i < 5; i++) {
			myVec.insertElementAt(stringToBeInserted, index);
		}

		System.out.println(myVec.toString());
		System.out.println();

		for (int i = 0; i < 5; i++) {
			myVec.removeElementAt(6);
		}
		System.out.println(myVec.toString());
		

	}
}
