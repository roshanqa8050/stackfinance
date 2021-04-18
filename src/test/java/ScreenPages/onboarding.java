package ScreenPages;




import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class onboarding {
	
AppiumDriver<MobileElement> driver;
	
	
	public onboarding(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
	}

			public void skipbtn() {
			//verify when skip button is clicked login/register page should be displayed 
				WebDriverWait wait = new WebDriverWait(driver,  10);
				wait.until(ExpectedConditions.presenceOfElementLocated(ByClassName.className("android.widget.Button"))).click();
				MobileElement createaccount = (MobileElement) driver.findElement(By.xpath("//android.view.View[@content-desc='Create an Account']"));
				assertEquals(createaccount.getAttribute("contentDescription"), "Create an Account");
				MobileElement login = (MobileElement) driver.findElement(By.xpath("//android.view.View[@content-desc='Login']"));
				assertEquals(login.getAttribute("contentDescription"), "Login");
				
			
			   }
			
			 
			
			
			
			
			
			}
			
		
	   
	    
	


