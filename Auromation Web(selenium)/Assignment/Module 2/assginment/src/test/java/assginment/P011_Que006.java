package assginment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Connection.driverConnection;


public class P011_Que006 {
//Que06.W.A.J.Script To use Mouse and Keyboard event using Action class.
	
	public static void main(String[] args) throws InterruptedException {
		//1.mouse hover.
		
		String url = "https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = driverConnection.getDriver(url);
		
		WebElement Home = driver.findElement(By.linkText("Home"));
		WebElement Flights = driver.findElement(By.linkText("Flights"));
		WebElement Hotels = driver.findElement(By.linkText("Hotels"));
		WebElement CarRentals = driver.findElement(By.linkText("Car Rentals"));
		WebElement Cruises = driver.findElement(By.linkText("Cruises"));
		WebElement Destinations = driver.findElement(By.linkText("Destinations"));
		WebElement Vacations = driver.findElement(By.linkText("Vacations"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Home).build().perform();
		Thread.sleep(2000);
				
		actions.moveToElement(Flights).build().perform();
		Thread.sleep(2000);
				
		actions.moveToElement(Hotels).build().perform();
		Thread.sleep(2000);
				
		actions.moveToElement(CarRentals).build().perform();
		Thread.sleep(2000);
			
		actions.moveToElement(Cruises).build().perform();
		Thread.sleep(2000);
				
		actions.moveToElement(Vacations).build().perform();
		Thread.sleep(2000);
	
	     Home.click();
	     
	     
	     //2.
	}
}
