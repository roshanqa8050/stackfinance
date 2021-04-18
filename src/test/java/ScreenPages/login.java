package ScreenPages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class login {
AppiumDriver<MobileElement> driver;
	
	
	public login(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
	}
	
	public void login_validemail() {
		WebDriverWait wait = new WebDriverWait(driver,  10);
		MobileElement email = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@text='Email Address']")));
		email.sendKeys("roshan@knitter.co.in");
		
	}
	
	public void login_validpass() {
		MobileElement pass = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='Password']"));
		pass.sendKeys("Lgsoft12!");
		driver.navigate().back();
	}
		
		public void login_proceedbtn() {
			MobileElement proceed = (MobileElement) driver.findElement(By.xpath("//android.view.View[@content-desc='Proceed']"));
			proceed.click();
			
			//MobileElement invalidmail = (MobileElement) driver.findElement(By.xpath("//android.view.View[@content-desc='Check your email address']"));
			try
			{
				MobileElement invalidmail = (MobileElement) driver.findElement(By.xpath("//android.view.View[@content-desc='Check your email address']"));
				if(invalidmail.isDisplayed())
				{
					assertEquals(invalidmail.getAttribute("contentDescription"), "Check your email address");
					System.out.println(invalidmail.getAttribute("contentDescription"));
				}
			}
			catch (NoSuchElementException e) {
		        System.out.println("Login successful");
			}
			
			
			
			
			}
		
		public void login_invalidemail() {
			WebDriverWait wait = new WebDriverWait(driver,  10);
			MobileElement email = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@text='Email Address']")));
			email.sendKeys("roshanknitter.co.in");
			
			
		}
			public void login_invalidpass() {
				MobileElement pass = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='Password']"));
				pass.sendKeys("lgsoft12!");
				driver.navigate().back();
			}
		}
	
	
	

