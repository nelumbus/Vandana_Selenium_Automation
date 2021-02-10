package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			driver.manage().window().maximize();
			driver.findElement(By.name("cusid")).sendKeys("aerrdh");
			driver.findElement(By.name("submit")).click();
			
			// Switching to Alert  		
	        		
	      //  Alert alertA = driver.switchTo().alert();
	        // Capturing alert message.    
	       // String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	       // System.out.println(alertMessage);	
	       // Thread.sleep(5000);
	        		
	        // Accepting alert		
	        //alertA.accept();
			
	        
	        
	     // Switching to Alert       
	        driver.switchTo().alert().accept();
	          		
	         
	          // Capturing alert message.    
	          String alertMessage= driver.switchTo().alert().getText();		
	          		
	          // Displaying alert message		
	          System.out.println(alertMessage);	
	          Thread.sleep(5000);
	          		
	         	
	          driver.switchTo().alert().dismiss();

	driver.close();
		
	}
	

}
