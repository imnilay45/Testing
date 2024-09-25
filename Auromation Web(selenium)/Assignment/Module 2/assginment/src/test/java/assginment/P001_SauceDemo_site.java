package assginment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Connection.driverConnection;

public class P001_SauceDemo_site {
public static void main(String[] args) {
	String url = "https://www.saucedemo.com/";
	WebDriver driver = driverConnection.getDriver(url);
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	
}
}
