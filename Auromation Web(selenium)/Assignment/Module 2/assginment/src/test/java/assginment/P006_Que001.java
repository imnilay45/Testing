package assginment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.driverConnection;


public class P006_Que001 {
//Que01. W.A.J.Script for Locating links by linkText() and partialLinkText().
	
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = driverConnection.getDriver(url);
		
		//1.By LinkText
	//	driver.findElement(By.linkText("Create new account")).click();
		
	
	List<WebElement> links =driver.findElements(By.partialLinkText("Create"));
	links.get(0).click();
//	for(WebElement e:links) {
//		System.out.println(e.getText());
//	}
	}
}
