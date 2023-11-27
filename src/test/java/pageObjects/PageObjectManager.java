package pageObjects;

import org.openqa.selenium.WebDriver;


public class PageObjectManager {
	
	WebDriver driver;
	LandingPage lp;
	OfferPage op;
	CheckOutPage checkoutpage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LandingPage getLandingPage() {
		lp=new LandingPage(driver);
		return lp;
	}
	
	public OfferPage getOfferPage() {
		op=new OfferPage(driver);
		return op;
	}
	
	public CheckOutPage getCheckOutPage() {
		checkoutpage=new CheckOutPage(driver);
		return checkoutpage;
	}
	

}
