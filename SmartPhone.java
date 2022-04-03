package week3.day2;

public class SmartPhone extends Android {
	
	public void connectWhatsApp(String connect) {
		System.out.println(connect);
	}
	
	public void takeVideo() {
		System.out.println("test");
		
	}

	public static void main(String[] args) {
		
		SmartPhone mobiles = new SmartPhone();
		mobiles.connectWhatsApp("Watsapp connect");
		mobiles.makeCall("Jay");
		mobiles.saveContact("Jay ", 98);
		mobiles.sendMsg("Hi");
		mobiles.takeVideo();

	}

}
