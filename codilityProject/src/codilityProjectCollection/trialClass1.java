package codilityProjectCollection;

public class trialClass1 {
	
		/*
		 * WAP where 5 students have name ,marks and refno and aslo awrad them with 1st,2nd,3rd according to their rank.
		 */
		private String Name; 
		 private int Refno;
		 private int Marks;
		 
		public  trialClass1(String name,int refno,int marks) {
			 this.Name=name;
			 this.Refno=refno;
			 this.Marks=marks;
			 
		}
			  public String getName(){
			        return Name;
			    }
			    public void setName(String Name){
			        this.Name=Name;
			    }
			    public int getrefNo(){
			        return Refno;
			    }
			    public void Refno(int Refno){
			        this.Refno=Refno;
			    }
			    public int getMarks(){
			        return Marks;
			    }
			    public void setMarks(int Marks){
			        this.Marks=Marks;
			    }
			    public String toString(){
			        return "[" + Name + "," + Refno + "," + Marks + "," +  "]";
			    }
			 
		 }


