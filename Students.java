package week3.day2;

public class Students {
	
	public void getStudentInfo(String Name, int ID) {
		System.out.println(Name+ID);
	}
	
	public void getStudentInfo(int phoneNum, String mail) {
		System.out.println(phoneNum+mail);
	}
	
	
	public static void main(String[] args) {
		
		Students obj = new Students();
		
		obj.getStudentInfo("Jay", 12345);
		obj.getStudentInfo(54321, "abc@gmail.com");

	}


}