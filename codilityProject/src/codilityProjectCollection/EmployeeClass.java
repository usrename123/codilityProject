package codilityProjectCollection;

public class EmployeeClass {
	String EmpId;
	String FirstName;
	String LastName;
	String Email;
	 EmployeeClass(String empId,String fname,String Lname,String  email) {
		 this.EmpId=empId;
		 this.FirstName=fname;
		 this.LastName=Lname;
		 this.Email=email;
	 }
	 EmployeeClass(String empId){
		 this.EmpId=empId;
	 }
	  public String toString(){
	        return "[" + EmpId + "," + FirstName + "," + LastName + "," + Email +  "]";
	    }
}
