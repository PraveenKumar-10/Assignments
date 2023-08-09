package assignment3;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Account No: XXXXXX6755 Credited for Rs 1000 in Current Deposit Account");
	}
	
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
	}

}
