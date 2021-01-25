package codilityProjectCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class studentsInArrayList {
	public static ArrayList<studentsInformantion>alist=new ArrayList<studentsInformantion>();
	public static void main(String[] args) {
		// creating object of the studentInformation class
		studentsInformantion Stu1= new studentsInformantion("Reema",2851,50);
		studentsInformantion Stu2= new studentsInformantion("Zareen",2365,80);
		studentsInformantion Stu3= new studentsInformantion("Tena",3672,90);
		studentsInformantion Stu4= new studentsInformantion("Ashima",2871,60);
		studentsInformantion Stu5= new studentsInformantion("Kanika",3900,75);

		
		alist.add(Stu1);
		alist.add(Stu2);
		alist.add(Stu3);
		alist.add(Stu4);
		alist.add(Stu5);
		//create an object for the Iteratorinterface for retrriving the values from the alist
		Iterator iterator=alist.iterator();
		while(iterator.hasNext()) {
			studentsInformantion SInfo=(studentsInformantion)iterator.next();
			System.out.println(SInfo.refno +" "+ SInfo.name+" "+ SInfo.marks);
		
			int list=SInfo.marks;
			System.out.println(list);
			if(SInfo.marks<=50) {
				System.out.println(SInfo.name+" awarded as ThirdPosition");
			}
			if(SInfo.marks==75) {
				System.out.println(SInfo.name+" awarded as SecondPosition");
			}
			if(SInfo.marks>=90) {
				System.out.println(SInfo.name+" awarded as FirstPositison");
			}
		}


	}
}



