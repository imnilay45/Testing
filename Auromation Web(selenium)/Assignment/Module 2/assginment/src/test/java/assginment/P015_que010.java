package assginment;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Connection.driverConnection;
public class P015_que010 {
	@Test
	public void Login() throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = driverConnection.getDriver(url);	
		
		 driver.findElement(By.name("email")).sendKeys("Neel");
		 driver.findElement(By.name("pass")).sendKeys("Neel@123");
		   
		   Thread.sleep(2000);
	}
		
}

