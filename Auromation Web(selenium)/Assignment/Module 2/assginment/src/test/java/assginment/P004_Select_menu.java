package assginment;

import java.time.Duration;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Connection.driverConnection;

public class P004_Select_menu {
public static void main(String[] args) throws InterruptedException {
	String url = "https://demoqa.com/select-menu";
	WebDriver driver = driverConnection.getDriver(url);
	
	WebElement value = driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]/div[1]"));
	value.click();
	Thread.sleep(1000);	
	
	Actions actions = new Actions(driver);
	actions.click(value)
	       .keyDown(Keys.ARROW_DOWN)
	       .keyDown(Keys.ENTER)
	       .build().perform();
	
	Thread.sleep(1000);
	
	WebElement title = driver.findElement(By.id("selectOne"));
	
	actions.click(title)
	       .keyDown(Keys.ARROW_DOWN)
	       .keyDown(Keys.ENTER)
	       .build()
	       .perform();
	
	Thread.sleep(1000);
	
   WebElement oldstylemenu = driver.findElement(By.id("oldSelectMenu"));
   Select color = new Select(oldstylemenu);
   color.selectByIndex(1);
   
   Thread.sleep(1000);
   
   WebElement multiselect = driver.findElement(By.xpath("//div[7][@class= 'row']/div/div/div/div[1]"));
   actions.click(multiselect)
          
          .keyDown(Keys.ENTER)
          .pause(Duration.ofSeconds(2))
          .keyDown(Keys.ARROW_DOWN)
          .keyDown(Keys.ENTER)
          .pause(Duration.ofSeconds(2))
          .keyDown(Keys.ARROW_DOWN)
          .keyDown(Keys.ENTER)
          .build().perform();
   
   WebElement cars = driver.findElement(By.id("cars"));
   Select car = new Select(cars);
   car.selectByValue("audi");
   
   
   
		   
   
	
	
	
	       
}
}