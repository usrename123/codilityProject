package codilityProjectCollection;

public class OwnStudentInfo {
	  private int StudentID;
	    private String FirstName;
	    private String LastName;
	    private String Email;
	    private int age;
	    private int Grade1;
	    private int Grade2;
	    private int Grade3;
		private int grade1;
	    //Constructor
	    public OwnStudentInfo(int S_ID,String FName,String LName,String email,int Age, 
	    int grade1,int grade2,int grade3){
	        this.StudentID=S_ID;
	        this.FirstName=FName;
	        this.LastName=LName;
	        this.Email=email;
	        this.age=Age;
	        this.Grade1=grade1;
	        this.Grade2=grade2;
	        this.Grade3=grade3;
	    }
	    //Accessor Methods (get methods) 
	   
	    public int getStudentID(){
	        return StudentID;
	    }
	    public void setStudentID(int StudentID){
	        this.StudentID=StudentID;
	    }
	    public String getFirstName(){
	        return FirstName;
	    }
	    public void setFirstName(String FirstName){
	        this.FirstName=FirstName;
	    }
	    public String getLastName(){
	        return LastName;
	    }
	    public void setLastName(String LastName){
	        this.LastName=LastName;
	    }
	    public String getEmail(){
	        return Email;
	    }
	    public void setEmail(String Email){
	        this.Email=Email;
	    }

	    public int getAge(){
	        return age;
	    }
	    public void setAge(int age){
	        this.age=age;
	    }
	    public int getGrade1(){
	        return Grade1;
	    }
	    public void setGrade1(int Grade1){
	        this.Grade1=Grade1; 
	    }
	    public int getGrade2(){
	        return Grade2;
	    }
	    public void setGrade2(int Grade1){
	        this.Grade2=Grade2; 
	    }
	    public int getGrade3(){
	        return Grade3;
	    }
	    public void setGrade3(int Grade3){
	        this.Grade3=Grade3; 
	    }
	    public String toString(){
	        return "[" + FirstName + "," + LastName + "," + Email + "," + age + "," + Grade1 + "," + Grade2 + "," + Grade3 +  "]";
	    }

	    

	  
	    

	   
	   
	    
	   

	}


