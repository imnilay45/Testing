package Assessment;

import java.io.File;
import java.rmi.UnexpectedException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class P004_Listner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test sucess");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		
		WebDriver driver = (WebDriver)result.getTestContext().getAttribute("Driver");
		
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			
		}
		
		try {
			TakesScreenshot ssScreenshot = (TakesScreenshot)driver;
			File source = ssScreenshot.getScreenshotAs(OutputType.FILE);
			
			File destFile = new File("D:\\Screenshot\\"+source.getName()+".png");
			
				FileUtils.copyFile(source, destFile);
				System.out.println("ss taken");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test ended");
	}
	
	
}
