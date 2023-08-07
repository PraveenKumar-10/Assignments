package assignmentSelenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		//Click on Phone
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		//Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture lead ID of First Resulting lead
		String id = driver.findElement(By.xpath("//a[text()='10189']")).getText();
		System.out.println(id);
		//Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='Jeevani']")).click();
		//Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		
		//Close the browser (Do not log out)
		driver.close();

	}

}
