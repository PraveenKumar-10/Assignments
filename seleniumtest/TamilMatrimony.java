package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {

	public static void main(String[] args) throws InterruptedException {
	
	//	Step 1: To open ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	//	Step 2: Load the Application Url as 'https://www.tamilmatrimony.in/'
		driver.get("https://www.tamilmatrimony.in/");
		//add implicitywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	Step 3: Maximize the Browser
		driver.manage().window().maximize();
	//	Step 4: Select the Matrimony profile for YourSelf
		WebElement profile = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
		Select profiledd = new Select(profile);
		profiledd.selectByVisibleText("Myself");
	//	Step 5: Enter Name
		driver.findElement(By.id("NAME")).sendKeys("Neymar Jr");
	//	Step 6: Click on Gender
		driver.findElement(By.id("gendermale")).click();
	//	Step 7: Select your Date of Birth
		WebElement date = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select datedd = new Select(date);
		datedd.selectByVisibleText("10");
		WebElement month = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select monthdd = new Select(month);
		monthdd.selectByVisibleText("May");
		WebElement year = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
		Select yeardd = new Select(year);
		yeardd.selectByVisibleText("2001");
	//	Step 8: Select your Religion
		WebElement religion = driver.findElement(By.id("RELIGION"));
		Select regligiondd = new Select(religion);
		regligiondd.selectByVisibleText("Hindu");
	//	Step 10: Select your Mother Tongue
		WebElement tongue = driver.findElement(By.id("MOTHERTONGUE"));
		Select tonguedd = new Select(tongue);
		tonguedd.selectByVisibleText("Tamil");
	//	Step 11: Select your country
		WebElement country = driver.findElement(By.id("COUNTRY"));
		Select countrydd = new Select(country);
		countrydd.selectByVisibleText("India");
	//	Step 12: Enter your MobileNumber
		WebElement countrycode = driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
		Select countrycodedd = new Select(countrycode);
		countrycodedd.selectByVisibleText("+91");
		driver.findElement(By.id("MOBILENO")).sendKeys("8248779566");
	//	Step 13: Enter your E-mail ID
		driver.findElement(By.id("EMAIL")).sendKeys("neymar10@gmail.com");
	//	Step 14: Close the Browser
		driver.close();

	}

}
