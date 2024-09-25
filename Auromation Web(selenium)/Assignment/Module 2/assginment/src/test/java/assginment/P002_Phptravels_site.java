package assginment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Connection.driverConnection;

public class P002_Phptravels_site {
public static void main(String[] args) throws InterruptedException {
	
	String url = "https://phptravels.com/demo/";
	WebDriver driver = driverConnection.getDriver(url);
	
    driver.findElement(By.name("first_name")).sendKeys("abc");
	
	driver.findElement(By.name("last_name")).sendKeys("xyz");
	
	WebElement SelectCountry = driver.findElement(By.id("country_id"));
	Thread.sleep(2000);
	SelectCountry.click();
	Select Country = new Select(SelectCountry);
	Country.selectByValue("99");
	
	 driver.findElement(By.name("whatsapp")).sendKeys("123456");
	 
	 driver.findElement(By.name("business_name")).sendKeys("xyz");
	 
	 driver.findElement(By.name("email")).sendKeys("xyz");
	 
	 WebElement btn = driver.findElement(By.id("demo"));
	 btn.click();
	 Alert alert = driver.switchTo().alert();
	 Thread.sleep(2000);
	 alert.accept();
	 
	 WebElement captcha = driver.findElement(By.id("numb1"));
	 String num1 = captcha.getText();
	
     WebElement captcha1 = driver.findElement(By.id("numb2"));
	 String num2 = captcha1.getText();
	

	 String  result = (num1+num2);

	
	   driver.findElement(By.id("number")).sendKeys(result);
	
	

	 
	 
	
	
	

	

  }	
}

