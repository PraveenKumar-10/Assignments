package assignmentweek1day1;

public class Car {
	
	public void door() {
		System.out.println("Open the Car door");
	} 
	
	public void window() {
		System.out.println("Close all windows ");
	}
	
	public void ac() {
		System.out.println("Switch on the AC");
	}
	
	public void clutch() {
		System.out.println("Press the Clutch and start the car");
	}
	
	public void handbrake() {
		System.out.println("Release the handbrake");
	}
	
	public void gear() {
		System.out.println("Push the gear from neutral to first gear");
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.door();
		myCar.window();
		myCar.ac();
		myCar.clutch();
		myCar.handbrake();
		myCar.gear();
	}

}
