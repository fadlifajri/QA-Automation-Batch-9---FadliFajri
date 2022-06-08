package tugas03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageTugasPOM extends BasePageTugasPOM {

	By username = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.id("login-button");
	By incorrectCombination = By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]");

	public LoginPageTugasPOM(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	public void loginWeb(String user, String pass) {
		setText(username, user);
		setText(password, pass);
		clickAndWait(loginBtn);
	}

	public void inputUsername(String user) {
		setText(username, user);
	}

	public void inputPassword(String pass) {
		setText(password, pass);
	}

	public void clickLoginButton() {
		clickAndWait(loginBtn);
	}
	
	
	

}
