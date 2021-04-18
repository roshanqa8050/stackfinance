package TestCases;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ScreenPages.login;
import ScreenPages.onboarding;
import ScreenPages.welcomescreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestCase6 {
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
	public void test_logininvalid() throws InterruptedException {
		// verify when users login with invalid id and valid password, err should be displayed
		
		onboarding click = new onboarding(driver);
		welcomescreen select = new welcomescreen(driver);
		login enter = new login(driver);
		
		click.skipbtn();
		select.loginbtn();
		enter.login_invalidemail();;
		enter.login_validpass();
		enter.login_proceedbtn();
		
	}
	    @AfterTest
		public void close_App() {
			driver.quit();
			
		}

}
