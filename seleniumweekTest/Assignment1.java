package seleniumweekTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//launch the browser and Handle the Notification
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications","start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
		//Load the URL(https://www.tatacliq.com/)
		driver.get("https://www.tatacliq.com/");
		//Maximize the window and add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Thread.sleep(3000);
		//MouseHover on Brands
		WebElement brand = driver.findElement(By.xpath("(//div[@class='DesktopHeader__arrow'])[2]"));
		Actions builder = new Actions(driver);	
		builder.moveToElement(brand).perform();
		//click Watches & Accessories
		WebElement watch = driver.findElement(By.xpath("//div[@class='DesktopHeader__brandLeftDetails']/div[5]"));
		builder.moveToElement(watch).perform();
		//Choose the first option from the Brand display
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		//Select sort by-New Arrivals
		WebElement sort = driver.findElement(By.xpath("//select[@label='Popularity']"));
		Select sortdd = new Select(sort);
		sortdd.selectByVisibleText("New Arrivals");
		Thread.sleep(2000);
		//Click Men check box
		driver.findElement(By.xpath("(//div[@class='CheckBox__base'])[1]")).click();
		//Print all price of watches(take only numbers)
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		for (int i = 0; i < price.size(); i++) {
			System.out.println(price.get(i).getText());
		}
		//Print the watch price
		String firstWatchPrice = driver.findElement(By.xpath("(//div[@class='ProductDescription__priceHolder']/h3)[1]")).getText();
		String firstWatch = ("MRP: " + firstWatchPrice); 
		System.out.println(firstWatch);
		//click the second loaded result
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[2]")).click();
		//12.Handle the window and Print the price of the watch
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		String secondWatch = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		System.out.println(secondWatch);
		//13.Compare two price and print Both price are equal
		if (firstWatch.equals(secondWatch)) {
			System.out.println("both price are equal");
		}else {
			System.out.println("Not equal");
		}
		//14.Click Add to Bag
		driver.findElement(By.xpath("(//div[@class='Button__base'])[3]")).click();
		//15.Check the bag count
		String bagCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println(bagCount);
		//16.Click the cart bag
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		//17.Take snapshot of result 
		Thread.sleep(3000);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./img/001.jpg");
		FileUtils.copyFile(screenshotAs, destination);
		//18.Close the open window
		driver.close();
		//19.Close the browser
		driver.quit();
		
			
	}

}
