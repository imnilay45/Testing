package connection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class driverconnection_edge {
public static WebDriver geDriver(String url) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\nilaybhadiyadra\\edgedriver_win64 (1)\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	return driver;
}
}
