package week4day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//load the url 
		driver.get("https://www.abhibus.com");
		//maximize the browser
		driver.manage().window().maximize();
		//add the implicityWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//04) Type "Chennai" in the FROM text box
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
		//05) Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		//06) Type "Bangalore" in the TO text box
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		//07) Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		//08) Select tomorrow's date in the Date field
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("(//a[text()='6'])[1]")).click();
		//09) Click Search Buses
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		//09) Print the name of the first resulting bus (use .getText())
		String busName = driver.findElement(By.xpath("(//h2[@title='Yolo Bus'])[1]")).getText();
		System.out.println(busName);
	//	10) Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.xpath("(//input[@name='Bustypes'])[4]")).click();
		//click on search
		driver.findElement(By.xpath("//a[text()='Modify Search']")).click();
	//	11) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		String busSeat = driver.findElement(By.xpath("(//p[text()='22 Seats Available'])[1]")).getText();
		System.out.println(busSeat);
	//	12) Click SelectSeat
		driver.findElement(By.xpath("(//span[text()='Select Seat'])[1]")).click();
		Thread.sleep(3000);
	//	13) Choose any one Available seat
		driver.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[2]")).click();
	//	14) Print Seats Selected ,Total Fare
		String seatsSelected = driver.findElement(By.xpath("//span[text()='DU6']")).getText();
		String totalFare = driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
		System.out.println("seats Selected :" + seatsSelected + "&" + "Total Fare :" + totalFare);
	//	15) Select Boarding Point  and Dropping Point
		WebElement boarding = driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));
		Select boardingdd = new Select(boarding);
		boardingdd.selectByVisibleText("velachery-22:23");
		WebElement dropping = driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));
		Select droppingdd = new Select(dropping);
		droppingdd.selectByVisibleText("Silk Board-05:09");
	//	16) Get the Title of the page(use .getTitle())
		String title = driver.getTitle();
		System.out.println(title);
	//	17) Close the browser
		driver.close();

	}

}
