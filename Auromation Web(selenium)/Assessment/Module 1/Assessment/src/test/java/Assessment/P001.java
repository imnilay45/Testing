package Assessment;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import connection.DriverConnection;

public class P001 {
public static void main(String[] args) throws InterruptedException {
	
	String url = "https://demoqa.com/automation-practice-form";
    WebDriver driver = DriverConnection.getDriver(url);
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)", "");
	
	driver.findElement(By.id("firstName")).sendKeys("abc");
	driver.findElement(By.id("lastName")).sendKeys("xyz");
	driver.findElement(By.id("userEmail")).sendKeys("abc12@gmail.com");

    driver.findElement(By.xpath("//div[@id='genterWrapper']/div/div[1]")).click();
	driver.findElement(By.id("userNumber")).sendKeys("1234567890");
	
	
	driver.findElement(By.id("dateOfBirthInput")).click();
	
	WebElement month = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
	Select months = new Select(month);
	months.selectByIndex(8);
	
	WebElement year = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
	Select years = new Select(year);
	years.selectByVisibleText("2024");
	
	
	
	driver.findElement(By.xpath("//div[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[1]")).click();

	WebElement subject = driver.findElement(By.id("subjectsContainer"));
	
	Actions actions = new Actions(driver);
	        actions.click(subject)
	               .sendKeys("s")
	               .pause(Duration.ofSeconds(2))
	               .keyDown(Keys.ARROW_DOWN)
	               .keyDown(Keys.ENTER)
	               .build().perform();
	        
	        JavascriptExecutor js1 = (JavascriptExecutor)driver;
	        WebElement checkbox =  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
	        Thread.sleep(2000);
	        js1.executeScript("arguments[0].scrollIntoView();", checkbox);
	        Thread.sleep(2000);
	        checkbox.click();  
	        
	      WebElement btn = driver.findElement(By.id("uploadPicture"));
	      btn.sendKeys("D:\\img\\Screenshot 2024-09-28 171039.png");
	      
	      driver.findElement(By.id("currentAddress")).sendKeys("A'bad");
	      
	    WebElement state = driver.findElement(By.id("state"));
	    
	    actions.click(state)
	           .pause(Duration.ofSeconds(2))
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ENTER)
	           .build()
	           .perform();
	           
WebElement city = driver.findElement(By.id("city"));
	    
	    actions.click(city)
	           .pause(Duration.ofSeconds(2))
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ENTER)
	           .build().perform();
	    
	    
	    driver.findElement(By.id("submit")).click();
	 
	    TakesScreenshot ss = (TakesScreenshot)driver;
	    
	    File source = ss.getScreenshotAs(OutputType.FILE);
	    File destfile = new File("D:\\Screenshot\\"+source.getName()+".png");
	    
	    try {
		      FileUtils.copyFile(source, destfile);
	    	
	    	
		} catch (Exception e) {
			e.printStackTrace();
		}
	    

	      
	      
	               
	 
	        
	
}
}
