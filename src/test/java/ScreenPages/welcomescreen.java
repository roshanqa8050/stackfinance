package ScreenPages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class welcomescreen {
AppiumDriver<MobileElement> driver;
	
	
	public welcomescreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
	}
	
	public void createaccountbtn() {
		MobileElement createaccount = (MobileElement) driver.findElement(By.xpath("//android.view.View[@content-desc='Create an Account']"));
		createaccount.click();
		WebDriverWait wait = new WebDriverWait(driver,  10);
		MobileElement createact = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc='Create an Account']")));
		System.out.println(createact.getAttribute("contentDescription"));
		MobileElement continuewithgoogle = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Continue with Google']"));
	
		assertEquals(continuewithgoogle.getAttribute("contentDescription"), "Continue with Google");
		MobileElement continuewithEmail = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Continue with Email']"));
		assertEquals(continuewithEmail.getAttribute("contentDescription"), "Continue with Email");
	}
	
    public void loginbtn() {
		WebDriverWait wait = new WebDriverWait(driver,  10);
		MobileElement login = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc='Login']")));
		login.click();
		assertEquals(login.getAttribute("contentDescription"), "Login");
		System.out.println(login.getAttribute("contentDescription"));
	}
}
