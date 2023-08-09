package assignment4;

public class Employee {

	public void getEmployeeInfo(int id) {
		System.out.println("Employee ID:"+id);
	}
	public void getEmployeeInfo(int id, String name) {
		System.out.println("Employee ID:"+id+" & "+"Name:" + name);
	}
	public void getEmployeeInfo(String email, long mobileNo) {
		System.out.println("Email:" + email +" & "+ "Mobile Number:" + mobileNo);
	}
	
	public static void main(String[] args) {
		Employee call = new Employee();
		call.getEmployeeInfo(10006);
		call.getEmployeeInfo(10006, "Neymar JR");
		call.getEmployeeInfo("neymar10@gmail.com", 9566236990L);
	}

}
