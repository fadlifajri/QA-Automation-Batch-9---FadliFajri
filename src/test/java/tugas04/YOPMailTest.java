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
		/* Master Email = supersonicducksquadron01@yopmail.com
		 * Test Email = supersonicducksquadron02@yopmail.com  */
		driver.get("https://yopmail.com/en/");
		driver.findElement(By.id("login")).sendKeys("supersonicducksquadron02@yopmail.com");
		driver.findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();
		
		
		String actualtext = driver.findElement(By.xpath("//div[@class='bname']")).getText();
		String expectedtext = "supersonicducksquadron02@yopmail.com";
				
		Assert.assertEquals(actualtext, expectedtext);
		
		// Click and Assert Iframe
		
		driver.switchTo().frame("ifinbox");
		driver.findElement(By.xpath("//span[@class='lmf']")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("ifmail");
		String carActual = driver.findElement(By.xpath("//div[normalize-space()='Tester']")).getText();	
		String carExpected = "Tester";	
		Assert.assertEquals(carActual, carExpected);
		
		
		
		
		
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}


}
