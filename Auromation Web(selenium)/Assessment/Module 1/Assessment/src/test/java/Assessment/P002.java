package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import connection.DriverConnection;

public class P002 {
public static void main(String[] args) throws InterruptedException {
	String url = "https://demoqa.com/webtables ";
	WebDriver driver = DriverConnection.getDriver(url);
	
	
	//1.Task01. Click on edit button
	driver.findElement(By.xpath("//div[@class ='row']/div/div/div/div/div/div[1]/div/div/div/span[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("submit")).click();
	
	
	
	
	//2.Tasl=k.02. Click on delete button.
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class ='row']/div/div/div/div/div/div[1]/div/div/div/span[2]")).click();
	
	
}
}
