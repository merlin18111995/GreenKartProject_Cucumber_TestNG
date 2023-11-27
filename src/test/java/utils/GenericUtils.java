package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	public void switchWindow() throws InterruptedException {
		//we can a condition like if current window is 
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		
		Thread.sleep(3000);
		
	}

}
