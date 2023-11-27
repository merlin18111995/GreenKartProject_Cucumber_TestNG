package stepDefenition;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.CheckOutPage;
import utils.TestContext;

public class CheckoutPage_StepDef {
	
	TestContext testContext;
	CheckOutPage checkOutPage;
	
	public CheckoutPage_StepDef(TestContext testContext) {
		this.testContext=testContext;
		this.checkOutPage=testContext.pageObjectManager.getCheckOutPage();
	}
	
	@Then("Validate all the fields in checkout page and proceed to checkout")
	public void validate_all_the_fields_in_checkout_page() {
		
		Assert.assertEquals(checkOutPage.getProductName(), testContext.exp_productName);
		int act_quantity=Integer.parseInt(checkOutPage.getQuantity());
		Assert.assertEquals(act_quantity, testContext.exp_prod_Quantity);
		Assert.assertEquals(checkOutPage.applyButtonIsDisplayed(), true);
		Assert.assertEquals(checkOutPage.placeOrderButtonIsDisplayed(), true);
		System.out.println(checkOutPage.getProductName());

		checkOutPage.click_placeOrderButton();
	}

}
