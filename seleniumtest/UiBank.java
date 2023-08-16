package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {

	public static void main(String[] args) throws InterruptedException {
		
	//	Step 1: To open ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	//	Step 2: Load the Application Url as 'https://uibank.uipath.com/register-account'
		driver.get("https://uibank.uipath.com/register-account");
		//add implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	Step 3: Maximize the Browser
		driver.manage().window().maximize();
	//	Step 4: Enter your name
		driver.findElement(By.id("firstName")).sendKeys("Pravee");
	//	Step 5: Select your title
		WebElement title = driver.findElement(By.id("title"));
		Select titledd = new Select(title);
		titledd.selectByVisibleText("Mr");
	//	Step 6: Enter your Initial
		driver.findElement(By.name("middleName")).sendKeys("Kumar");
	//	Step 7: Enter your Last Name
		driver.findElement(By.id("lastName")).sendKeys("S");
	//	Step 8: Select Gender
		WebElement gender = driver.findElement(By.id("sex"));
		Select genderdd = new Select(gender);
		genderdd.selectByVisibleText("Male");
	//	Step 9: Select   Employment Status by using selectByVisibleText()
		WebElement employment = driver.findElement(By.id("employmentStatus"));
		Select employmentdd = new Select(employment);
		employmentdd.selectByVisibleText("Full-time");
	//	Step 10: Enter your name
		driver.findElement(By.id("username")).sendKeys("Praveen");
	//	Step 11: Enter your EmailAddress
		driver.findElement(By.id("email")).sendKeys("praveenkumar10@gmail.com");
	//	Step 12: Enter your Password
		driver.findElement(By.id("password")).sendKeys("TDSVenom@10");
	//	Step 13: Close your Browser
		driver.close();

	}

}
