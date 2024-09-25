package assginment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Connection.driverConnection;

public class P005_onlytesting_site {
public static void main(String[] args) throws InterruptedException {
	String url = "https://only-testing-blog.blogspot.com/";
	WebDriver driver = driverConnection.getDriver(url);
	
	//1.Relationship
	driver.findElement(By.name("gparent1")).sendKeys("A1");
	driver.findElement(By.name("parent1")).sendKeys("B1");
	driver.findElement(By.name("child1")).sendKeys("c1");
	
	Thread.sleep(1000);
	
	driver.findElement(By.name("gparent2")).sendKeys("A2");
	driver.findElement(By.name("parent2")).sendKeys("B2");
	driver.findElement(By.name("child2")).sendKeys("c2");
//---------------------------------------------------------------------------------//
	
	
	//2.Tooltip
	driver.findElement(By.linkText("Tooltip")).click();
	
	driver.findElement(By.xpath("//*[@id=\"tooltip-1\"]")).sendKeys("Ab");
	driver.findElement(By.id("sname")).sendKeys("cd");
	driver.findElement(By.id("yaddress")).sendKeys("xyz");
	
	driver.findElement(By.partialLinkText("Older Post")).click();
//---------------------------------------------------------------------------------//
    
	//3.iframe1
	
	//Switch to ifrmae
	WebElement iframe = driver.findElement(By.id("frame1"));
	driver.switchTo().frame(iframe);
	
	// switch to curren window
	String currnetwindow = driver.getWindowHandle();
	driver.switchTo().window(currnetwindow);
	Thread.sleep(2000);
	
	//Switch to ifrmae
	WebElement iframe1 = driver.findElement(By.id("frame2"));
	driver.switchTo().frame(iframe1);
	
   // switch to curren window
	String currnetwindow1= driver.getWindowHandle();
	driver.switchTo().window(currnetwindow1);
	Thread.sleep(2000);
	
	driver.findElement(By.name("Town")).sendKeys("Z1");
	
	driver.findElement(By.name("Country")).sendKeys("c1");
	
	driver.findElement(By.partialLinkText("Older Post")).click();
//---------------------------------------------------------------------------------//
	
	//4.Table With Checkbox
	driver.findElement(By.xpath("//div[@id='Blog1']/div/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[1]/input")).click();
	driver.findElement(By.xpath("//div[@id='Blog1']/div/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr[2]/td[2]/input")).click();

	driver.findElement(By.partialLinkText("Older Post")).click();
//---------------------------------------------------------------------------------//
	
	//5.Selectable
	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]")).click();
	

	String myDate = "14";
	String myMonth ="September";
	String myYear = "2024";
	
	driver.findElement(By.id("datepicker")).click();
	
	WebElement CurrentYear = driver.findElement(By.className("ui-datepicker-year"));
	String CurrentY = CurrentYear.getText();
	
	int y1 = Integer.parseInt(myYear);
	int y2 = Integer.parseInt(CurrentY);
	
	 while(!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
		  if(y1>y2) {
			  driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
		  }
		  else {
			  driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span")).click();
		  }
	 }
	
		  while(!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
			  if(y1>y2) {
				  driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
			  }
			  else {
				  driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span")).click();
			  }
		  }
	
	List<WebElement> dates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
	  for(WebElement date:dates) {
		  if(myDate.equals(date.getText())) {
		  date.click();
            }	  
  }
    WebElement btn = driver.findElement(By.xpath("//*[@id=\"post-body-7297556448793668582\"]/div[1]/button"));
     
    Actions actions = new Actions(driver);
    actions.doubleClick(btn).build().perform();
    Alert alert = driver.switchTo().alert();
    Thread.sleep(2000);
    alert.accept();
   
	driver.findElement(By.partialLinkText("Older Post")).click();
//---------------------------------------------------------------------------------//
      
    //6.Drag and Drop
    WebElement img = driver.findElement(By.xpath("//div[@id='dragdiv']/p"));
    WebElement to  = driver.findElement(By.id("dropdiv"));
     
    actions.clickAndHold(img).moveToElement(to).release().build().perform();
    Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Older Post")).click();
//---------------------------------------------------------------------------------//
    
	//7.Temp
	driver.findElement(By.name("fname")).sendKeys("ab");
	driver.findElement(By.name("lname")).sendKeys("cd");
	driver.findElement(By.name("sname")).sendKeys("ef");
   
    driver.findElement(By.xpath("//div[@id='main']/div/div/div/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]/input")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/div/div/div/div/div/div[2]/div[1]/table/tbody/tr[2]/td[1]/input")).click();
    Thread.sleep(2000);
   
    driver.findElement(By.partialLinkText("Older Post")).click();
//---------------------------------------------------------------------------------//
 
    //8.Alert
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.alertIsPresent());
    driver.switchTo().alert();
    Thread.sleep(2000);
    alert.accept();
 
    driver.findElement(By.name("fname")).sendKeys("ab");
	driver.findElement(By.name("lname")).sendKeys("cd");
	
	driver.findElement(By.id("submitButton")).click();
	
    driver.findElement(By.partialLinkText("Older Post")).click();
//---------------------------------------------------------------------------------//
    //9.Form
    driver.findElement(By.name("FirstName")).sendKeys("a");
    driver.findElement(By.name("LastName")).sendKeys("b");
	driver.findElement(By.name("EmailID")).sendKeys("a@12");
	driver.findElement(By.name("MobNo")).sendKeys("1232");
	driver.findElement(By.name("Company")).sendKeys("c2");
	driver.findElement(By.xpath("//*[@id=\"post-body-8228718889842861683\"]/div[1]/form/input[6]")).click();
	driver.switchTo().alert();
	Thread.sleep(2000);
	alert.accept();
	 driver.findElement(By.partialLinkText("Older Post")).click();
//---------------------------------------------------------------------------------//
	 //10.LogIn
	 driver.findElement(By.name("userid")).sendKeys("a");
	 driver.findElement(By.name("pswrd")).sendKeys("a123654");
	 driver.findElement(By.name("fname")).sendKeys("ab");
	 driver.findElement(By.name("lname")).sendKeys("cd");
		
	 driver.findElement(By.xpath("//form[@name = 'login']/input[3]")).click();
	 driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		 driver.findElement(By.partialLinkText("Older Post")).click();
//---------------------------------------------------------------------------------//
    //11.Multiply
	driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[1]")).click();
	Thread.sleep(1000);
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[4]")).click();
    Thread.sleep(1000);
	driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[5]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[13]")).click();
	Thread.sleep(2000);
	 driver.findElement(By.partialLinkText("Older Post")).click();
//---------------------------------------------------------------------------------//
	 
	//12.substraction
	driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[5]")).click();
	Thread.sleep(1000);
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[4]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[13]")).click();
    Thread.sleep(2000);
    driver.findElement(By.partialLinkText("Older Post")).click();
//---------------------------------------------------------------------------------//
 
    //13.addition
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[4]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[7]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[13]")).click(); 
    Thread.sleep(2000);
    driver.findElement(By.partialLinkText("Older Post")).click();
 //---------------------------------------------------------------------------------//
    
    //14.Calc
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[3]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[4]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[3]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[8]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//form[@name = 'Calc']/table/tbody/tr[2]/td/input[15]")).click();
    Thread.sleep(2000);
    driver.findElement(By.partialLinkText("Older Post")).click();
    
}
}
