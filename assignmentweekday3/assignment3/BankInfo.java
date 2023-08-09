package assignment3;

public class BankInfo {

	public void saving() {
		System.out.println("Account No: XXXXXX6755 Balance: Rs.1200.00 in Saving Account");
	}
	public void fixed() {
		System.out.println("Account No: XXXXXX6755 Balance: Rs.1000.00 in Fixed Deposit Account");
	}
	public void deposit() {
		System.out.println("Account No: XXXXXX6755 Credited for Rs 200 in Current Deposit Account");
	}
	
	public static void main(String[] args) {
		BankInfo obj = new BankInfo();
		obj.saving();
		obj.fixed();
		obj.deposit();

	}

}
