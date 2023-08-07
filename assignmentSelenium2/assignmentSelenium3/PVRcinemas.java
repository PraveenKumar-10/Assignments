package week4day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRcinemas {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//load the url 
		driver.get("https://www.pvrcinemas.com/");
		//Maximize the browser
		driver.manage().window().maximize();
		//add the Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click on movie library
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Thread.sleep(3000);
		//select the city 
		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		Select citydd = new Select(city);
		citydd.selectByVisibleText("Chennai");
		//select the Genre as Animation
		WebElement genre = driver.findElement(By.xpath("//select[@name='genre']"));
		Select genredd = new Select(genre);
		genredd.selectByVisibleText("ANIMATION");
		//Select the Language
		WebElement language = driver.findElement(By.xpath("//select[@name='lang']"));
		Select languagedd = new Select(language);
		languagedd.selectByVisibleText("ENGLISH");
		//Click on Apply
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		//07) Click on first resulting animation movie
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		//08) Click proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		//09) Enter the all fields  Cinema , Name, date, Preferred show time, no of seats, food and beverages,Email and Mobile
		WebElement cinema = driver.findElement(By.xpath("//select[@name='cinemaName']"));
		Select cinemadd = new Select(cinema);
		cinemadd.selectByVisibleText("PVR Velachery Chennai");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Neymar");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("neymar10@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9566824877");
		WebElement food = driver.findElement(By.xpath("//select[@name='food']"));
		Select fooddd = new Select(food);
		fooddd.selectByVisibleText("Yes");
		WebElement showTime = driver.findElement(By.xpath("//select[@name='timings']"));
		Select showTimedd = new Select(showTime);
		showTimedd.selectByVisibleText("03:00 PM - 06:00 PM");
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@class='ng-pristine ng-valid ng-touched']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='day-unit ng-star-inserted'])[8]")).click();
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("Nil");
		//10) Click on copy to self 
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		//11) Click on  Send Request
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		//12) Click cancel 
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		//13) Close the OTP dialog
		driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();
		//14) Verify the ttile of the page
		String title1 = "Movie Library";
		String title2 = driver.getTitle();
		if(title1.equals(title2)) {
			System.out.println("Matched");
		}else {
			System.out.println("Mismatch");
		}

	}

}
