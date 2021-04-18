package ScreenPages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class homepage {
AppiumDriver<MobileElement> driver;
	
	
	public homepage(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
	}
	
	public void permission() {
		WebDriverWait wait = new WebDriverWait(driver,  10);
		
		MobileElement permission = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
		permission.click();
		//MobileElement user = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc='Good Evening, Roshan']")));
		//assertEquals(user.getAttribute("contentDescription"), "Good Evening, Roshan");
	}
	
	public void getstarted() {
		//WebDriverWait wait = new WebDriverWait(driver,  10);
		MobileElement user = (MobileElement) driver.findElementByXPath("//android.widget.ImageView[@content-desc='Wealth\r\n" + 
				"Wealth\r\n" + 
				"Tab 1 of 3']");
		assertEquals(user.getAttribute("contentDescription"), "Get Started");
		user.click();
	}
}
