package assignmentSelenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		//launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		//load the application url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximum the browser
		driver.manage().window().maximize();
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the user name as demosalesmanager
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		//enter the password as crmsfa
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//click on login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//click on crm/sfa
		driver.findElement(By.xpath("//a[contains(text(),' CRM/SFA')]")).click();
		//click on lead
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		//Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Click on Email
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		//Enter Email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("Messi");
		//Click find leads button
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		//Capture name of First Resulting lead
		String a = driver.findElement(By.xpath("(//a[text()='Messi'])[1]")).getText();
		System.out.println(a);
		//Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='10571']")).click();
		//Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		//Verify the title as 'Duplicate Lead'
		String title1 = "Duplicate Lead | opentaps CRM";
		String title2 = driver.getTitle();
		if(title1.equals(title2)) {
			System.out.println("matched");
		}else {
			System.out.println("Not matched");
		}
		//Click Create Lead
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//Confirm the duplicated lead name is same as captured name
		String b = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		if(a.equals(b)) {
			System.out.println("Same");
		}else {
			System.out.println("Not Samw");
		}
		//Close the browser (Do not log out)
		driver.close();
		
	}

}
