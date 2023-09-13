package seleniumweekTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications","start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.tatacliq.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Thread.sleep(3000);
		WebElement brand = driver.findElement(By.xpath("(//div[@class='DesktopHeader__arrow'])[2]"));
		Actions builder = new Actions(driver);
			
		builder.moveToElement(brand).perform();
		
		WebElement watch = driver.findElement(By.xpath("//div[@class='DesktopHeader__brandLeftDetails']/div[5]"));
		
		builder.moveToElement(watch).perform();
		
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		WebElement sort = driver.findElement(By.xpath("//select[@label='Popularity']"));
		
		Select sortdd = new Select(sort);
		sortdd.selectByVisibleText("New Arrivals");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='CheckBox__base'])[1]")).click();
		
		
		
		driver.close();
		
		/*
		1.Lanuch the browser and Handle the Notification
		2.Maximize the window and add wait
		3.Load the Url(https://www.tatacliq.com/)
		4.MouseHover on Brands
		5.click Watches & Accessories
		6.Choose the first option from the Brand dispaly
		7.Select sort by-New Arrivals
		8.Click Men check box
		9.Print all price of watches(take only numbers)
		10.Print the watch price
		11.click the second loaded result
		12.Handle the window and Print the price of the watch
		13.Compare two price and print Both price are equal
		14.Click Add to Bag
		15.Check the bag count
		16.Click the cart bag
		17.Take snapshot of result 
		18.Close the open window
		19.Close the browser
	 */
		
	
	}

}
