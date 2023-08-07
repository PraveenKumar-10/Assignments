package assignmentSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACME {

	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Load url "https://acme-test.uipath.com/login"
		driver.get("https://acme-test.uipath.com/login");
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		//Enter Password as "leaf@12"
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		//Click login button
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//Get the title of the page and print
		String title = driver.getTitle();
		System.out.println(title);
		//Click on Log Out
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		//Close the browser (use -driver.close())
		driver.close();

	}

}
