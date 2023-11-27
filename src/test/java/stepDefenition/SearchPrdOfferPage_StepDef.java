package stepDefenition;


import org.testng.Assert;
import io.cucumber.java.en.*;
import pageObjects.OfferPage;
import utils.TestContext;


public class SearchPrdOfferPage_StepDef {
	String prodName_offerPage;
	TestContext testContext;
	OfferPage offerpage;
	
		
	public SearchPrdOfferPage_StepDef(TestContext testContext) {
		this.testContext=testContext;
		this.offerpage=testContext.pageObjectManager.getOfferPage();
	}
	
	@Then("^user search same name (.+) in Offers page$")
	public void user_search_same_name_in_offers_page(String prodName) throws InterruptedException {
		
		
		testContext.genericutils.switchWindow();
		offerpage.searchProd(prodName);
		   
}
	
	@Then("validate if same name is displayed")
		public void validateprodName() throws InterruptedException {
		Thread.sleep(3000);
		String prdName_offerPage=offerpage.getProdName();
		Assert.assertEquals(testContext.prdName_landingPage, prdName_offerPage);
	}
	

}
