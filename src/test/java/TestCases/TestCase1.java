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

public class TestCase1   {
	AppiumDriver<MobileElement>driver;
	
    @BeforeTest
	public void launch_app() throws MalformedURLException, InterruptedException {
    DesiredCapabilities  cap =  new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Xiaomi redmi Note 7");
		cap.setCapability("udid", "2149641f");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("appPackage", "co.stackfinance.stackfinanceapp");
		cap.setCapability("appActivity", "co.stackfinance.stackfinanceapp.MainActivity");
		cap.setCapability("automationName", "UiAutomator1");
		cap.setCapability("printPageSourceOnFindFailure", "true");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		Thread.sleep(10000);
		
		}
	
	@Test
	public void test_Skipbtn() throws InterruptedException {
		//verify when users clicks on skip button users should land on Login/SignUp page 
		onboarding click = new onboarding(driver);
		click.skipbtn();
		Thread.sleep(10000);
		
	}
		
	 @AfterTest
		public void close_App() {
			driver.quit();
			
		}
		
	   
		
	}


