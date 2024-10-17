package Assessment;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import connection.driverconnection_edge;

public class P004 {

	
	
	WebDriver driver = null;
	@BeforeMethod
	public void openBrowser() {
		
		String url = "http://www.demo.guru99.com/V4/ ";
		driver = driverconnection_edge.geDriver(url);	
	}
	
	@Test(dataProvider = "dp")
	public void LoginTest(String email,String pass,ITestContext context) throws InterruptedException {
		context.setAttribute("Driver",driver );
		System.out.println(email+" "+ pass);
		WebElement userId = driver.findElement(By.name("uid"));
		userId.clear();
		userId.sendKeys(email);
		
		WebElement Password = driver.findElement(By.name("password"));
		Password.clear();
		Password.sendKeys(pass);
		Thread.sleep(2000);
		
		driver.findElement(By.name("btnLogin")).click();
		 
		}
		
	
	
	@DataProvider(name = "dp")
	public static Object[][] data (){
	
		ExcelReader ex = new ExcelReader("C:\\Users\\nilaybhadiyadra\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx", "Log in");
		
		int row = ex.RowCount();
		System.out.println("rows = "+row);
		
		int col = ex.colCount();
		System.out.println("columns = "+col);
		
		Object o [][] = new Object [row-1][col];
		for(int i =1;i<row; i++) {
			for(int j =0;j<col;j++) {
				String data = ex.getdata(i, j);
				  o [i-1][j] = data;
			}
		}
	return o;
		
	}
	
	
}
