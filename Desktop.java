package week3.day2;

public class Desktop implements Hardware, Software {
	
	public void desktopModels() {
		System.out.println("Desktop Model");
	}

	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		
		obj.hardwareResources();
		obj.softwareResources();
		obj.desktopModels();

	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software Resources");
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware Resources");
	}

}
