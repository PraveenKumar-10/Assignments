package assignmentSelenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		//launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		//load the application url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximum the browser
		driver.manage().window().maximize();
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
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
		//Enter first name
		driver.findElement(By.xpath("(//input[@class=' x-form-text x-form-field'])[25]")).sendKeys("Neymar");
		//Click Find leads button
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		//Click on first resulting lead
		driver.findElement(By.xpath("//a[text()='10583']")).click();
		//Verify title of the page
		String title1 = "View Lead | opentaps CRM";
		String title2 = driver.getTitle();
		if(title1.equals(title2)) {
			System.out.println("matched");
		}else {
			System.out.println("not matched");
		}
		//Click Edit
		driver.findElement(By.linkText("Edit")).click();
		//Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf");
		//Click Update
		driver.findElement(By.name("submitButton")).click();
		//Confirm the changed name appears
		String a = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(a);
		//Close the browser (Do not log out)
		driver.close();

	}

}
