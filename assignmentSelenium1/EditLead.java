package assignmentSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
			//launch the chrome browser
			ChromeDriver driver = new ChromeDriver();
			//load the application url
			driver.get("http://leaftaps.com/opentaps/control/login");
			//maximum the browser
			driver.manage().window().maximize();
			//enter the user name as demosalesmanager
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			//enter the password as crmsfa
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			//click on login button
			driver.findElement(By.className("decorativeSubmit")).click();
			//click on crm/sfa
			driver.findElement(By.linkText("CRM/SFA")).click();
			//click on lead
			driver.findElement(By.linkText("Leads")).click();
			//click on create lead
			driver.findElement(By.linkText("Create Lead")).click();
			//enter the company name as TestLeaf
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			//enter the first name as messi
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Messi");
			//enter the last name as L
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("L");
			//enter the firstname(local) as Messi
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Messi");
			//Enter Department Field as QA
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
			//Enter Description Field as nothing
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Nothing");
			//Enter your email in the E-mail address
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("messi10@gmail.com");
			//locate the state/province dropdrown
			WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select statedd = new Select(state);
			//Select State/Province as NewYork Using Visible Text
			statedd.selectByVisibleText("New York");
			//Click on Create Button
			driver.findElement(By.name("submitButton")).click();	
			//Click on edit button
			driver.findElement(By.linkText("Edit")).click();
			//Clear the Description Field using .clear()
			driver.findElement(By.id("updateLeadForm_description")).clear();
			//Fill ImportantNote Field with Any text
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Nothing important");
			//Click on update button
			driver.findElement(By.name("submitButton")).click();
			//Get the Title of Resulting Page
			String title = driver.getTitle();
			System.out.println(title);
		

	}

}
