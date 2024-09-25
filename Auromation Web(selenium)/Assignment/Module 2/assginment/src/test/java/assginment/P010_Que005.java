package assginment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Connection.driverConnection;

public class P010_Que005 {
//Que5.W.A.J.Script To write a script for drop down.
	public static void main(String[] args) throws InterruptedException {
		String url = "http://demo.guru99.com/test/newtours/register.php ";
		WebDriver driver = driverConnection.getDriver(url);
		
		
		WebElement country = driver.findElement(By.name("country"));
		Select countries = new Select(country);
		countries.selectByIndex(3);
		
		Thread.sleep(2000);
		
		driver.close();
		
	} 
}
