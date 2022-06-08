package tugas04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YOPMailTest {

	WebDriver driver = null;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void yopMail() {

		// Login
		driver.get("https://yopmail.com/en/");
		driver.findElement(By.id("login")).sendKeys("automationtest");
		driver.findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();
		
		
		String actualtext = "automationtest@yopmail.com";
		String expectedtext = "automationtest@yopmail.com";
		
		Assert.assertEquals(actualtext, expectedtext);
		
		// Click and Assert Iframe
		
		driver.switchTo().frame("ifinbox");
		driver.findElement(By.cssSelector("div[id='e_ZwVjAwNmZQDjAQN1ZQNjZGVlZQDjZj=='] button[class='lm']")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("ifmail");
		String carActual = driver.findElement(By.xpath("//span[normalize-space()='for your Mitsubishi']")).getText();	
		String carExpected = "for your Mitsubishi";	
		Assert.assertEquals(carActual, carExpected);
		
		
		
		
		
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}


}
