package assginment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.driverConnection;

public class P012_que007 {
//Que07.W.A.J. Script How to handled Alert in selenium 
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demo.guru99.com/test/delete_customer.php";
		WebDriver driver = driverConnection.getDriver(url);
		
	 driver.findElement(By.name("cusid")).sendKeys("012");
	 driver.findElement(By.name("submit")).click();
		
		 
	    Alert alert = driver.switchTo().alert();
	    Thread.sleep(2000);
	    alert.accept();
	   
		
	}
}
