package assginment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Connection.driverConnection;

public class P007_Que002 {
//Que02.W.A.J.Script for Selecting multiple items in a drop dropdown
public static void main(String[] args) {
	
	String url = "https://demoqa.com/select-menu";
	WebDriver driver = driverConnection.getDriver(url);
	
	
	WebElement colors = driver.findElement(By.xpath("//div[@class ='row'][2]/div/div"));
	
	Actions actions = new Actions(driver);
	
	actions.click(colors)
	       .keyDown(Keys.ENTER)
	       .pause(Duration.ofSeconds(2))
	       .keyDown(Keys.ARROW_DOWN)
	       .keyDown(Keys.ENTER)
	       .pause(Duration.ofSeconds(2))
	       .keyDown(Keys.ARROW_DOWN)
	       .keyDown(Keys.ENTER)
	       .pause(Duration.ofSeconds(2))
	       .keyDown(Keys.ARROW_DOWN)
	       .keyDown(Keys.ENTER)
	       .build().perform();
	       
	       
	
}
}
