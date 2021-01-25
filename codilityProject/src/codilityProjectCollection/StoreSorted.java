package codilityProjectCollection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StoreSorted {
	public static void SortIt(int[]a,int n) {
		
		Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		String s=Arrays.toString(a);
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println("user has entered the duplicate numbers,PLEASE CHECkS");
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter size of the elements");
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
        
        int[]array=new int[size];
        System.out.println("please enter desired elements");
        for(int i=0;i<size;i++) {
        	array[i]=scan.nextInt();
        }
            
        SortIt(array,size);
        }

}
