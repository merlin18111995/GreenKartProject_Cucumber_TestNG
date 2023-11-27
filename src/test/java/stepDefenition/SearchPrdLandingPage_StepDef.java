package stepDefenition;

import org.testng.Assert;
import io.cucumber.java.en.*;
import pageObjects.LandingPage;
import utils.TestContext;

public class SearchPrdLandingPage_StepDef {
	
	TestContext testContext;
	LandingPage landingpage;
	
	public SearchPrdLandingPage_StepDef(TestContext testContext) {
		this.testContext=testContext;
		this.landingpage=testContext.pageObjectManager.getLandingPage();
	}
	
	
	@Given("User is on GreenKart Landing page")
	public void user_is_on_green_kart_landing_page() throws InterruptedException {
		Thread.sleep(2000);
		 
	     Assert.assertEquals(landingpage.getTitle(), "GreenKart - veg and fruits kart");
	    
	}

	@When("^user search with (.+) and search result displayed$")
	public void user_search_with_shortname(String prodName) throws InterruptedException {
		testContext.exp_productName=prodName;
		landingpage.searchProduct(prodName);
	   Thread.sleep(3000);
	   testContext.prdName_landingPage=(landingpage.getProductName().split("-"))[0].trim(); 
	   Assert.assertEquals(testContext.prdName_landingPage,testContext.exp_productName );
	   
	  
	}
	
	@When("user search for a product {string} and search result displayed")
	public void user_search_product(String prodName) throws InterruptedException {
		testContext.exp_productName=prodName;
		landingpage.searchProduct(prodName);
	   Thread.sleep(3000);
	   testContext.prdName_landingPage=(landingpage.getProductName().split("-"))[0].trim(); 
	   Assert.assertEquals(testContext.prdName_landingPage,testContext.exp_productName );
	}
	
	@When ("user navigate to Offers page")
	public void navigtetoOfferpage() {
		 landingpage.click_TopDealLink();
	}
	
	@Then("add {string} products to cart")
	public void add_products_to_cart(String quantity) throws InterruptedException {
		Integer size=Integer.parseInt(quantity);
		testContext.exp_prod_Quantity=size;
		landingpage.clickIncrementOption(testContext.exp_prod_Quantity);
		Thread.sleep(2000);
	}
	@Then("Go to Cart and proceed to checkout")
	public void go_to_cart_and_proceed_to_checkout() throws InterruptedException {
		landingpage.clickAddToCart();
		Thread.sleep(2000);
		landingpage.clickCart();
		landingpage.clickCheckOut();
		Thread.sleep(2000);

	}
	
}
