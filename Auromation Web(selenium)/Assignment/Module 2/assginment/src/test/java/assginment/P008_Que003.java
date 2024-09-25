package assginment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Connection.driverConnection;

public class P008_Que003 {
//Que03.W.A.J. script to use different methods to manage the windows-alerts and pop ups. 
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/alerts";
		WebDriver driver = driverConnection.getDriver(url);
	
		
//		//1
//		WebElement btn = driver.findElement(By.id("alertButton"));
//		btn.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
		
//		//2
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement btn = driver.findElement(By.id("timerAlertButton"));
//		btn.click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
//		
//		
//		//3
//		WebElement btn = driver.findElement(By.id("confirmButton"));
//		btn.click();
//		Alert alert = driver.switchTo().alert();
//        Thread.sleep(2000);
//        alert.dismiss();
//        
        //4
        WebElement btn = driver.findElement(By.id("promtButton"));
    	btn.click();
    	Alert alert = driver.switchTo().alert();  	
    	alert.sendKeys("nil");
    	Thread.sleep(2000);
    	alert.accept();
		
	}
	
	
}
