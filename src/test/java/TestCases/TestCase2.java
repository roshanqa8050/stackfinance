package TestCases;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import ScreenPages.onboarding;
import ScreenPages.welcomescreen;
public class TestCase2 {

	
	
AppiumDriver<MobileElement>driver;
	
	@BeforeTest
	public void launch_app() throws MalformedURLException {
    DesiredCapabilities  cap =  new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Xiaomi redmi Note 7");
		cap.setCapability("udid", "2149641f");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9.0");
		cap.setCapability("appPackage", "co.stackfinance.stackfinanceapp");
		cap.setCapability("appActivity", "co.stackfinance.stackfinanceapp.MainActivity");
		cap.setCapability("automationName", "UiAutomator1");
		cap.setCapability("printPageSourceOnFindFailure", "true");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		}
	
	
	@Test
	public void test_createacctbtn() throws InterruptedException {
		// verify when create account button is clicked , create account page bottom sheet should be displayed 
		// bottom sheet pop should consist of (continue with google/Email)
		onboarding click = new onboarding(driver);
		welcomescreen select = new welcomescreen(driver);
		click.skipbtn();
		select.createaccountbtn();
		Thread.sleep(10000);
	}
	    
		
	 @AfterTest
		public void close_App() {
			driver.quit();
			
		}
		
		
		
	}

