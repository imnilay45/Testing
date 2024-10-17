package Assessment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P003 {
	public static void main(String[] args) {
		
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getDriver(url);
		
		//1.
		WebElement heading = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//thead/tr/th[1]/span"));
		String Structure = heading.getText();
		System.out.println(Structure);
		
		System.out.println("-----------------------");
		
		for(int i=1;i<=4;i++) {
			WebElement data1 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/th/span"));
			String Structures = data1.getText();
			System.out.println(Structures);
			
			if(i==4) {
				System.out.println("There are four strctures");
			   }
			}
	  	 System.out.println();
		 System.out.println("-------------------------");
		 
		 
		 WebElement BurjKhalifa = driver.findElement(By.xpath("//table[@class= 'tsc_table_s13']/tbody/tr[1]/td[3]/span"));
		 String Height1 = BurjKhalifa.getText();
		 System.out.println(Height1);
		 
		 WebElement ClockTowerHotel = driver.findElement(By.xpath("//table[@class= 'tsc_table_s13']/tbody/tr[2]/td[3]/span"));
		 String Height2 = ClockTowerHotel.getText();
		 System.out.println(Height2);
		 
		 WebElement Taipei101 = driver.findElement(By.xpath("//table[@class= 'tsc_table_s13']/tbody/tr[3]/td[3]/span"));
		 String Height3 = Taipei101.getText();
		 System.out.println(Height3);
		 
		 WebElement FinancialCenter= driver.findElement(By.xpath("//table[@class= 'tsc_table_s13']/tbody/tr[4]/td[3]/span"));
		 String Height4 = FinancialCenter.getText();
		 System.out.println(Height4);
	
	
		
		 
		
		
		
		
		
		
		
		
	
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	
	  } 	
	}
	

