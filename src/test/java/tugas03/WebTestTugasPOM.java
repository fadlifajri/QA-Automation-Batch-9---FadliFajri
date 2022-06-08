package tugas03;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTestTugasPOM extends BaseWebTestTugasPOM {

	BasePageTugasPOM basePage = new BasePageTugasPOM(driver, explicitWait);
	LoginPageTugasPOM loginPage = new LoginPageTugasPOM(driver, explicitWait);
	HomePageTugasPOM homePage = new HomePageTugasPOM(driver, explicitWait);
	
	
	
	@Test
		
	//Login to SauceDemo
	
	public void sauceDemoLogin() {
	String username = "standard_user";
	String password = "secret_sauce";
	
	loginPage.loginWeb(username, password);
	
	String expectedAfterLogin = driver.get().getCurrentUrl();
	String actualAfterLogin = "https://www.saucedemo.com/inventory.html";
	
	Assert.assertTrue(actualAfterLogin.equals(expectedAfterLogin));
	
	// Adding Products to Cart
	
	homePage.addObject1();
	
	String expectedResult = "1";
	String actualResult = driver.get().findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
	
	Assert.assertEquals(actualResult, expectedResult);
	
	// Proceed to Cart Page
	
	loginPage.clickAndWait(By.xpath("//span[@class='shopping_cart_badge']"));
	String expectedItem = "Sauce Labs Fleece Jacket";
	String actualItem = homePage.getText(By.xpath("//div[@class='inventory_item_name']"));
			
	
	Assert.assertEquals(actualItem, expectedItem);
	
	// Proceed to Checkout
	
	loginPage.clickAndWait(By.id("checkout"));
	basePage.setText(By.id("first-name"), "Fadli");
	basePage.setText(By.id("last-name"), "Fajri");
	basePage.setText(By.id("postal-code"), "123456");
	homePage.clickAndWait(By.name("continue"));
	
	Assert.assertEquals(homePage.getText(By.className("inventory_item_name")), expectedItem);
	
	// Finish
	
	loginPage.clickAndWait(By.id("finish"));
	
	Assert.assertTrue(basePage.successNotification(By.className("pony_express")), "Pony Express");
	
	
	}
	
	
	
	
}
