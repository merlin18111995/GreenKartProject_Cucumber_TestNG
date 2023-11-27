package utils;

import java.io.IOException;

import pageObjects.PageObjectManager;

public class TestContext {
	//this class is responsible for initializing all common things in other class's
	//public WebDriver driver;
	public String prdName_landingPage;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericutils;
	public String exp_productName;
	public Integer exp_prod_Quantity;
	
	public TestContext() throws IOException {
		testBase=new TestBase();
		pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
		genericutils=new GenericUtils(testBase.WebDriverManager());
		
	}
}
