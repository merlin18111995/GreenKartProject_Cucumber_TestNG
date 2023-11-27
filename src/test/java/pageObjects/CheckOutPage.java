package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	WebDriver driver;
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//table[@id='productCartTables']//descendant::p[@class='product-name']")
	WebElement productName;
	@FindBy(xpath="//table[@id='productCartTables']//descendant::p[@class='quantity']")
	WebElement quantity;
	@FindBy(xpath="//table[@id='productCartTables']//descendant::p[@class='amount'][1]")
	WebElement price;
	@FindBy(xpath="//table[@id='productCartTables']//descendant::p[@class='amount'][2]")
	WebElement totalprice;
	@FindBy(css = "button[class='promoBtn']")
	WebElement applyButton;
	@FindBy(xpath="//button[text()='Place Order']")
	WebElement placeOrderButton;
	
	public String getProductName() {
		String prodName=productName.getText().split("-")[0].trim();
		return prodName;
	}
	
	public String getQuantity() {
		String quant=quantity.getText();
		return quant;
	}
	
	public String getPrice() {
		String prodPrice=price.getText();
		return prodPrice;
	}
	
	public String getTotalPrice() {
		String totPrice=totalprice.getText();
		return totPrice;
	}
	
	public boolean applyButtonIsDisplayed() {
		boolean status=applyButton.isDisplayed();
		return status;
	}
	public boolean placeOrderButtonIsDisplayed() {
		boolean status=placeOrderButton.isDisplayed();
		return status;
	}
	
	public void click_placeOrderButton() {
		placeOrderButton.click();
		
	}
	
	
	
	
}
