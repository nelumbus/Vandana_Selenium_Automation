package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		  String baseUrl = "https://www.calculator.net/";
	        String expectedTitle = "Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science";
	        String actualTitle = "";

	        // launch chrome	  and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle))
	        {
	            System.out.println("Test Passed!");
	        } 
	        else 
	        {
	            System.out.println("Test Failed");
	        }
	       
	        Thread.sleep(10000);
	        
	        //close chrome driver
	        
	        driver.close();
	      
		
			
			

	}

}
