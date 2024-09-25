package assginment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Connection.driverConnection;

public class P009_Que004 {
//Que4.W.A.J.script to register your self in Gmail.
	
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/test/radio.html";
		WebDriver driver = driverConnection.getDriver(url);
		
		List<WebElement> radio = driver.findElements(By.name("webform"));
		 radio.get(2).click();
		 
	   WebElement	 checkbox1 = driver.findElement(By.xpath("//input[@type=\"checkbox\"][@value = 'checkbox1']"));
	   checkbox1.click();
	   
	   WebElement	 checkbox2 = driver.findElement(By.xpath("//input[@type=\"checkbox\"][@value = 'checkbox2']"));
	   checkbox2.click();

	   Thread.sleep(2000);
	   driver.close();
	
	   
	
	
	
	
	        
	
	
	
	}
}
