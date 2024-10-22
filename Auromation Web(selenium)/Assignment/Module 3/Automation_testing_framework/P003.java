package Automation_testing_framework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.driverConnection;

public class P003 {
	//Webdriver programe with Junit

	WebDriver driver = null;

    @BeforeClass
    public void Openbrowser() {
		  String url = "https://secure1.inmotionhosting.com/index/login";
		  driver = driverConnection.getDriver(url);
		  
	  }

    @Test
    public void Login() throws InterruptedException {

		String url = "https://secure1.inmotionhosting.com/index/login";
		WebDriver driver = driverConnection.getDriver(url);

		  WebElement username = driver.findElement(By.id("username"));
		  username.sendKeys("rahul.sanghvi.mca@gmail.com");
		  
		  WebElement password = driver.findElement(By.id("password"));
		  password.sendKeys("rahul12345");
		  
		  WebElement iframe = driver.findElement(By.xpath("//div[@id='recaptcha']/div/div/div/iframe"));
		  driver.switchTo().frame(iframe);
		  Thread.sleep(2000);
		  
	      driver.findElement(By.id("recaptcha-anchor")).click();
	      Thread.sleep(2000);
	      
	      String currentWindow = driver.getWindowHandle();
			driver.switchTo().window(currentWindow);
			Thread.sleep(2000);
	      
	      driver.findElement(By.id("login-submit")).click();
	      Thread.sleep(1000);
    }
	      

    @AfterClass
    public void closebrowser() {
        driver.quit();
    
}
}
