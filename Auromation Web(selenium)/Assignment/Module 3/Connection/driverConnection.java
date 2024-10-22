package Connection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverConnection {
public static WebDriver getDriver(String url) {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\nilaybhadiyadra\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	return driver;}
}
