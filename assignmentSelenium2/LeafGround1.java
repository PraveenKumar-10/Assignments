package assignmentSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.id("j_idt88:name")).sendKeys("Praveen");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(" ,India");
		boolean textBoxDisable = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		if(textBoxDisable == false) {
			System.out.println("disabled");
		}
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		String retrivedText = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(retrivedText);
		WebElement email = driver.findElement(By.id("j_idt88:j_idt99"));
		email.sendKeys("Testleaf007@gmail.com");		
		email.sendKeys(Keys.TAB + " I am Praveen kumar from chennai");
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		String error = driver.findElement(By.className("ui-message-error-detail")).getText();
		if(error.contains("Age is mandatory")) {
			System.out.println("Error is showing");
		}
		WebElement box10 = driver.findElement(By.id("j_idt106:j_idt113"));
		Point originallocn = box10.getLocation();
		driver.findElement(By.id("j_idt106:float-input")).click();
		Point changeLocn = box10.getLocation();
		if(!originallocn.equals(changeLocn)) {
			System.out.println("position changed");
		}
		
		WebElement box11 = driver.findElement(By.id("j_idt106:auto-complete_input"));
		box11.sendKeys("Praveeen");
		driver.findElement(By.xpath("//li[@data-item-value='praveen2']")).click();
		
		driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("10/05/2001");
		String date = driver.findElement(By.linkText("10")).getText();
		if("10/5/2001".contains(date)) {
			System.out.println("date is same");
		}
		
		WebElement box13 = driver.findElement(By.id("j_idt106:j_idt118_input"));
		box13.sendKeys("7");
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-s']")).click();
		String value = box13.getText();
		if(value.equals(box13)) {
			System.out.println("no change");
		}else {
			System.out.println("value changed");
		}
		
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		boolean keyboard = driver.findElement(By.xpath("//div[contains(@class,'shadow keypad-popup')]")).isDisplayed();
		System.out.println(keyboard);
		if (keyboard == true) {
			System.out.println("keyboard is displayed");
		} else {
			System.out.println("keyboard is not displayed");
		}
		
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
