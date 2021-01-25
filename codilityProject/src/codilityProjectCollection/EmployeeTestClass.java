package codilityProjectCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeTestClass {
	static String s1=null;
	public static ArrayList<EmployeeClass>alist=new ArrayList<EmployeeClass>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add("111","Reema","lago","reema.lago@gmail.com");
		add("121","zena","mehra","zena.mehra@gmail.com");
		add("134","ravi","kumar","ravi.kumar@rediffmail.com");
		add("256","sohal","shah","sohal.shah@gmail.com");
		add("216","mac","walls","mac.walls@yahoo.com");
		add("256","smith","wills","smith.wills@gmail.com");
		Iterator iterator=alist.iterator();
		while(iterator.hasNext()) {
			EmployeeClass SInfo=(EmployeeClass)iterator.next();
			//System.out.print(SInfo.EmpId +", ");
			String s1=SInfo.EmpId;
	
		}

		 s1 = "111 121 134 256 216 256 ";
		    countWords(s1);
			
	 
		
		System.out.println();
        for(EmployeeClass p : alist)
            System.out.println(p);
        System.out.println();
	        System.out.println("List After Removing Object");
	
       remove(4);
        for(EmployeeClass p : alist)
            System.out.println(p);
	        System.out.println();
	        System.out.println("employee infromation at with id given has been removed");
	}
	

	public static void add(String EmpId,String FirstName,  String LastName,String Email ) {
		
	 EmployeeClass empinfo=new EmployeeClass(EmpId,FirstName,LastName,Email);
		alist.add(empinfo);
	
	
	}
	public static  void remove(int EmpId) {
		 for (int i = 0; i < alist.size(); i++){
             if(i ==EmpId){
                alist.remove(i);
             } 
         
             }
        	
		
         }
	public static void countWords(String s1) {
	    String[] s2 = s1.split(" ");
	    for (int i = 0; i < s2.length; i++) {
	        for (int j = i + 1; j < s2.length; j++) {
	            if (s2[i].equals(s2[j])) {
	                if (i != j) {
	                    s2[i] = "";
	                }
	            }
	        }
	    }
	    for (int i = 0; i < s2.length; i++) {
	        if (s2[i] != "") {
	           
	        }
	        System.out.print(s2[i] + " ");
	     }
		
		

		}
	
}

	

