package assginment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Connection.driverConnection;

public class P003_OrangeHRM_site {
public static void main(String[] args) throws InterruptedException{
	
	
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver = driverConnection.getDriver(url);
	Thread.sleep(2000);
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123"); 
	driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/button")).click();
	
}
}
