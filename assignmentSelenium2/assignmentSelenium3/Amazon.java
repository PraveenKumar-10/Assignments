package week4day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		//01) Launch the browser
		ChromeDriver driver = new ChromeDriver();
	     //02) Load the url
		driver.get("https://www.amazon.in/");
		//maxmize the browser
		driver.manage().window().maximize();
	    //add  implicitlyWait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    //03) Type "Bags" in the Search box
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
	    //04) Choose the 	 item in the result (bags for boys)
	    driver.findElement(By.xpath("//div[@aria-label='bags for mens']")).click();
	    //05) Print the total number of results (like 50000)
	    String noOfResults = driver.findElement(By.xpath("//span[text()='1-16 of over 80,000 results for']")).getText();
	    System.out.println(noOfResults);
	    //06) Select the first 2 brands in the left menu
	    //   (like American Tourister, Generic)
	    driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
	    Thread.sleep(3000);
	    //07) Choose New Arrivals (Sort)
	    driver.findElement(By.xpath("//span[@id='a-autoid-2-announce']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	    //08) Print the first resulting bag info (name, discounted price)
	    String name = driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4'])[1]")).getText();
	    System.out.println(name);
	    
	    //09) Get the page title and close the browser(driver.close())	
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
	}

}
