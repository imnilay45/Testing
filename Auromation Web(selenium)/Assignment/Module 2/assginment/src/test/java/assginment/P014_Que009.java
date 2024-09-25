package assginment;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Connection.driverConnection;

@RunWith(Parameterized.class)
public class P014_Que009 {
//Que09.W.a. junit program to use parameterized demo with multiple 	parameter of Facebook login in junit.
	String email;
	String pass;
	
	public P014_Que009(String email, String pass) {
		
		this.email = email;
		this.pass = pass;
	}

	static WebDriver driver = null;
	
	@Before
	public  void openbrowser() {
	    String url = "https://www.facebook.com/";
	    driver = driverConnection.getDriver(url);
	}
	@Test
	public void LoginTest() throws InterruptedException {
		
	    WebElement emailEle = driver.findElement(By.name("email"));
	    emailEle.clear();
	    emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.clear();
		passEle.sendKeys(pass);
		Thread.sleep(2000);
	}
	@Parameters
	public static List<Object[]> data() {
		Object [][] obj = new Object[4][2];
		obj[0][0] = "Incorrect@gmail.com";
		obj[0][1] = "incorrect123";
		
		obj[1][0] = "Incorrect@gmail.com";
		obj[1][1] = "correct123";
		
		obj[2][0] = "correct@gmail.com";
		obj[2][1] = "incorrect123";
		
		obj[3][0] = "correct@gmail.com";
		obj[3][1] = "correct123";
		
	return Arrays.asList(obj); 		
	}
}
