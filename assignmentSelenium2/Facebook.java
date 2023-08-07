package assignmentSelenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		//Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://en-gb.facebook.com");
		//Maximize the window
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Neymar");
		//Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("JR");
		//Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9566824877");
		//Enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("0987654321");
		//Handle all the three drop downs
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select daydd = new Select(day);
		daydd.selectByIndex(9);
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select monthdd = new Select(month);
		monthdd.selectByIndex(4);
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select yeardd = new Select(year);
		yeardd.selectByVisibleText("2001");
		//Select the radio button "Male" 
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();

	}

}
