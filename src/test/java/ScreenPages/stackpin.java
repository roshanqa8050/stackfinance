package ScreenPages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class stackpin {
AppiumDriver<MobileElement> driver;
	
	
	public stackpin(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
	}

	
	public void enter_validpin() throws InterruptedException {
		
		MobileElement pin = (MobileElement) driver.findElementByClassName("android.widget.EditText");
		pin.sendKeys("900872");
		
	}
		
	public void enter_invalidpin() {
		MobileElement pin = (MobileElement) driver.findElementByClassName("android.widget.EditText");
		pin.sendKeys("900892");
		WebDriverWait wait = new WebDriverWait(driver,  10);
		MobileElement invalidpin = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Retry']")));
		assertEquals(invalidpin.getAttribute("contentDescription"), "Retry");
		System.out.println(invalidpin.getAttribute("contentDescription"));
	}
}
