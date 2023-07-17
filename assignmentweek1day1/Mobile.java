package assignmentweek1day1;

public class Mobile {

	public void documents() {
		System.out.println("To share documents");
	}
	public void call() {
		System.out.println("To Make a call");
	}
	public void camera() {
		System.out.println("To record video or  capturn image");
	}
	public void whatsapp() {
		System.out.println("To send a message");
	}
	public void youtube () {
		System.out.println("Watch videos");
	}
	public void games() {
		System.out.println("Play games");
	}
	
	public static void main(String[] args) {
		Mobile actions = new Mobile();
		actions.documents();
		actions.call();
		actions.camera();
		actions.whatsapp();
		actions.youtube();
		actions.games();
	}

}
