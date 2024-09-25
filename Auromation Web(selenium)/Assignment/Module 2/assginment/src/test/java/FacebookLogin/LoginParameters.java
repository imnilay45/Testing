package FacebookLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Connection.driverConnection;


public class LoginParameters {
	
	@Test
    @Parameters({"email","password"})
	public void loginTest(String email,String password) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = driverConnection.getDriver(url);
		

	    WebElement emailEle = driver.findElement(By.name("email"));
	    emailEle.clear();
	    emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.clear();
		passEle.sendKeys(password);
		Thread.sleep(2000);
	}
}
