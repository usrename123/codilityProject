package codilityProjectCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ownArrayList {


		
		
		
		 private static ArrayList<OwnStudentInfo> alist= new ArrayList<>();
		    public static void main(String[] args) {
		        add(1,"John", "Smith", "John1989@gmail.com", 20, 88,79, 59);
		        add(2,"Suzan", "Erickson", "Erickson_1990@gmailcom",19,91,72,85);
		        add(3,"Jack","Napoli","The_lawyer99yahoo.com",19,85,84,87);
		        add(4,"Erin", "Black","Erin.black@comcast.net",22,91,98,82 );
		        add(5,"Henry","Adam","adam1@gmail.com",25,85,84,79);

		        for(OwnStudentInfo p : alist)
		            System.out.println(p);
		        System.out.println();
		        System.out.println("List After Removing Object");
		        remove(4);
		        for(OwnStudentInfo p : alist)
		            System.out.println(p);
		        System.out.println();
		        System.out.println("student infromation at index 4 has been removed");

		     

		    }

		    public static void add(int S_ID,String fName,String lName,String email,int 
		    Age, int grade1, int grade2, int grade3){
		        //int[] Grades={grade1, grade2,grade3};
		        OwnStudentInfo newStudent= new OwnStudentInfo(S_ID, fName, lName, email, Age, grade1,grade2,grade3);
		        alist.add(newStudent);
		    }



		    public static void remove(int StudentID){
		          for (int i = 0; i < alist.size(); i++){
		              if(i == StudentID){
		                 alist.remove(i);
		              }
		       
		          }
		              }
		          
		    }


		    



