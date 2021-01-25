package codilityProjectCollection;

import java.util.ArrayList;




public class TrialTestClass {
	private static ArrayList<trialClass1> mylist = new ArrayList<>();

	public static void main(String[] args) {
		
				add("Reema", 2851, 50);
				add("Zareen", 2365, 80);
				add("Tena", 3672, 90);
				add("Ashima", 2871, 60);
				add("Kanika", 3900, 75);
				System.out.println("----------------");
				 for(trialClass1 p : mylist)
			            System.out.println(p);
				 
			


			}

	public static void add(String name, int refno, int marks) {

		trialClass1 stinfo = new trialClass1(name, refno, marks);
		mylist.add(stinfo);
		if(stinfo.getMarks()==50) {
			System.out.println(stinfo.getName()+" stands Third");
		}else if(stinfo.getMarks()==75) {
			System.out.println(stinfo.getName()+" stands second");
		}else if(stinfo.getMarks()==90) {
			System.out.println(stinfo.getName()+" stands First");
			
		}
		
	}
}
