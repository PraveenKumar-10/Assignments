package assignmentweek2day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int firstNum = 0,secNum = 1,sum = 0;
		int range = 11;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 0; i < range; i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
			
		}
		
		
	}

}
