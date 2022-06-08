package tugas03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageTugasPOM extends BasePageTugasPOM {
	
	public HomePageTugasPOM(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	
	public void addObject1() {
			By object1 = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
			clickAndWait(object1);
			
		}
	
	public void clickRemoveObject1() {
		By removeObject1 = By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']");
		clickAndWait(removeObject1);
	}
	


}
