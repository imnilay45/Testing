package Automation_testing_framework;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Connection.driverConnection;

public class P001 {

	  WebDriver driver = null;
	  
	  @BeforeMethod
	  public void Openbrowser() {
		  String url = "https://secure1.inmotionhosting.com/index/login";
		  driver = driverConnection.getDriver(url);
		  
	  }
	  @Test(dataProvider = "Login_data")
	  public void LoginTest(String email, String pass) throws InterruptedException {
		  System.out.println(email +" "+ pass );
		  
		  WebElement username = driver.findElement(By.id("username"));
		  username.clear();
		  username.sendKeys(email);
		  
		  WebElement password = driver.findElement(By.id("password"));
		  password.clear();
		  password.sendKeys(pass);
		  
		  WebElement iframe = driver.findElement(By.xpath("//div[@id='recaptcha']/div/div/div/iframe"));
		  driver.switchTo().frame(iframe);
		  Thread.sleep(2000);
		  
	      driver.findElement(By.id("recaptcha-anchor")).click();
	      Thread.sleep(2000);
	      
	      String currentWindow = driver.getWindowHandle();
			driver.switchTo().window(currentWindow);
			Thread.sleep(2000);
	      
	      driver.findElement(By.id("login-submit")).click();
	      Thread.sleep(1000);
	      
	      TakesScreenshot ss = (TakesScreenshot) driver;
	      File source = ss.getScreenshotAs(OutputType.FILE);
	      File path = new File("D:\\Screenshot\\"+source.getName()+".png");
	      
	      try {
			FileUtils.copyFile(source, path);
			System.out.println("ss taken");
		} catch (Exception e) {
			// TODO: handle exception
		}
	      
	      
	  }
	      
		
	  
	 @ DataProvider(name = "Login_data")
	  public Object[][] data(){
		
		  ExcelReader  ex = new ExcelReader("C:\\Users\\nilaybhadiyadra\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx", "Login");
		  
		  int row = ex.rowcount();
		  System.out.println("rows : "+row);
		  
		  int col = ex.colcount();
		  System.out.println("columns : " + col);
		  
		  Object o [][]= new Object[row][col];
		  
		  for (int i = 0 ; i<row;i++) {
			  for(int j = 0 ; j<col;j++) {
				  String data = ex.getdata(i, j);
				  o [i][j] = data;
			  }
		  }
		return o;
	  
	  }
}
