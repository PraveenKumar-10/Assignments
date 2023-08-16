package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		//Step 1: To open the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
//		Step 2: Load the Application Url as 'https://www.facebook.com/'
		driver.get("https://www.facebook.com/");
		//add implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Step 3: Maximize the Browser
		driver.manage().window().maximize();
//		Step 4: Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//	Step 5: Enter first name	
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("PraveenKumar");
//		Step 6: Enter last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
//		Step 7: Enter your mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9566824877");
//		Step 8: Enter your password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("TDSVenom@10");
		//	Step 9: Select  date
		WebElement date = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select datedd = new Select(date);
		datedd.selectByVisibleText("10");
//		Step 10: Select month
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select monthdd = new Select(month);
		monthdd.selectByVisibleText("May");
//		Step 11: Select year
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select yeardd = new Select(year);
		yeardd.selectByVisibleText("2001");
//		Step 12: Click on your Gender
		driver.findElement(By.xpath("//input[@value='2']")).click();
//		Step 13: Close your Browser
		Thread.sleep(3000);
		driver.close();
	}

}
