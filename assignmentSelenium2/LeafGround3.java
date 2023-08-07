package assignmentSelenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Box1 - Tool
		WebElement tool = driver.findElement(By.xpath("//select[@style='overflow-wrap: break-word; height: 150%;']"));
		Select tooldd = new Select(tool);
		tooldd.selectByIndex(1);

		// Box2 - Country
		WebElement country = driver.findElement(By.id("j_idt87:country_label"));
		country.click();
		Thread.sleep(2000);
		WebElement countrydd = driver.findElement(By.xpath("//li[@data-label='India']"));
		
		countrydd.click();
		Thread.sleep(2000);

		// Box3 - City
		WebElement city = driver.findElement(By.id("j_idt87:city_label"));
		city.click();
		Thread.sleep(2000);
		WebElement citydd = driver.findElement(By.xpath("//li[@data-label='Chennai']"));
		citydd.click();

		// Box4 - Course
		WebElement course = driver.findElement(By.id("j_idt87:auto-complete_input"));
		course.sendKeys("Playwright");
		driver.findElement(By.xpath("//span[@id='j_idt87:auto-complete_panel']//li[4]")).click();
		Thread.sleep(2000);

		// Box5 - Language
		WebElement language = driver.findElement(By.id("j_idt87:lang_label"));
		language.click();
		Thread.sleep(2000);
		WebElement languagedd = driver.findElement(By.xpath("//li[@data-label='Hindi']"));
		languagedd.click();
		Thread.sleep(2000);

		// Box6 - OddLanguage
		WebElement OddLanguage = driver.findElement(By.id("j_idt87:value_label"));
		OddLanguage.click();
		Thread.sleep(2000);
		WebElement OddLanguagedd = driver.findElement(By.id("j_idt87:value_3"));
		OddLanguagedd.click();

		driver.close();

	}

}
