package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	By search=By.cssSelector("input.search-keyword");
	By prd_Name=By.cssSelector("h4.product-name");
	By topDeals_link=By.linkText("Top Deals");
	By increment=By.cssSelector("a.increment");
	By decrement=By.xpath("//a[text()='–']");
	@FindBy(xpath="//button[text()='ADD TO CART']")
	WebElement addToCart;
	@FindBy(xpath="//a[@class='cart-icon']//img")
	WebElement Cart;
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	WebElement checkout;
	
	
	public String getTitle() {
		String title=driver.getTitle();
		return title;
	}
	public void searchProduct(String prodName) {
		driver.findElement(search).sendKeys(prodName);
	}
	
	public String getProductName() {
		String prdName_landingPage=driver.findElement(prd_Name).getText();
		return prdName_landingPage;
	}
	
	public void click_TopDealLink() {
		driver.findElement(topDeals_link).click();
	}
	
	public void clickIncrementOption(Integer prodSize) {
		int i=prodSize-1;
		while(i>0) {
		driver.findElement(increment).click();
		i--;
		}
	}
	public void clickDecrementOption() {
		
	}
	public void clickAddToCart() {
		addToCart.click();
	}
	public void clickCart() {
		Cart.click();
	}
	
	public void clickCheckOut() {
		checkout.click();
	}
}
