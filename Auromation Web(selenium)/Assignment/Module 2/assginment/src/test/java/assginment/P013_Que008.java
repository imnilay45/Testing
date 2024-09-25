package assginment;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Connection.driverConnection;

public class P013_Que008 {
//Que08. W.a. junit program to perform test with webdriver to login process of facebook
	
	static WebDriver driver = null;
	
	@BeforeClass
	public static void OpenBrowser() {
		String url = "https://www.facebook.com/";
		driver = driverConnection.getDriver(url);	
	}
	
	@Test
	public void Logintest() throws InterruptedException {
		 driver.findElement(By.name("email")).sendKeys("Neel");
		 driver.findElement(By.name("pass")).sendKeys("Neel@123");
		   
		   Thread.sleep(2000);
	}
	
	 @AfterClass
	 public static void closebrowser() {
		 driver.close();
	 }
	
}
