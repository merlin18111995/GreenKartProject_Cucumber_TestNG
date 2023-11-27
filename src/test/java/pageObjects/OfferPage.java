package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	WebDriver driver;
	
	public OfferPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By search=By.cssSelector("input[type='search']");
	By prodName=By.xpath("//table//tbody/descendant::td[1]");
	
	public void searchProd(String prodName) {
		driver.findElement(search).sendKeys(prodName);
	}
	
	public String getProdName() {
		String prdName_offerPage=driver.findElement(prodName).getText();
		return prdName_offerPage;
	}
	
	public String getCurrentURL() {
		String current_URL=driver.getCurrentUrl();
		return current_URL;
	}
	
	
}
