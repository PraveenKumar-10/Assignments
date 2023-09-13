package seleniumweekTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification","start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
		//load the URL https://www.makemytrip.com/
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(2000);
		//Close the Sweet Alert.
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//a[contains(@id,'webklipper-publisher')]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//li[text()='MyBiz Account']")).click();
		driver.findElement(By.name("username")).sendKeys("tdsv@gmail.com");
		driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		driver.findElement(By.xpath("//span[@class='mybizLoginClose']")).click();
		driver.findElement(By.xpath("//span[@data-cy='BizRequestCallBackForm_164']")).click();
		//Click on the website logo.
		driver.findElement(By.xpath("//img[@alt='Make My Trip']")).click();
		//Navigate to the "Holiday Packages" section.
		driver.findElement(By.xpath("(//span[@class='chNavText darkGreyText'])[4]")).click();
		//Input "Chennai" as the departure city.
		driver.findElement(By.id("fromCity")).click();
		WebElement fromCity = driver.findElement(By.xpath("//input[@placeholder='Enter City']"));
		fromCity.clear();
		fromCity.sendKeys("Chennai");
		//Select the first suggested city.
		driver.findElement(By.xpath("//span[@class='appendLeft8 blackText']")).click();
		//Specify "Goa" as the destination city.
		driver.findElement(By.id("toCity")).click();
		//Choose the first city suggestion.
		driver.findElement(By.xpath("(//div[@class='dest-city-container'])[1]")).click();
		//Pick a date from the calendar.
		driver.findElement(By.xpath("(//p[text()='23'])[2]")).click();
		//Adjust the number of adults to the maximum allowed.
		driver.findElement(By.xpath("//div[@data-testid='adult-increment-counter']")).click();
		//Click on the apply button.
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		//Click on the apply button
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		//Click on the search button.
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		//Skip an automated assistance prompt.
		driver.findElement(By.xpath("//button[text()='SKIP']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='close closeIcon']")).click();
		//Capture a screenshot of the first vacation package.
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./img/002.jpg");
		FileUtils.copyFile(screenshotAs, destination);
		//Print the current page title.
		System.out.println("Current Page Title : " + driver.getTitle());
		//Close the web browser.
		driver.close();
		
	}

}
