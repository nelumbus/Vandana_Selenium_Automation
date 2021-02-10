package Overstock;
			import java.util.concurrent.TimeUnit;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.chrome.ChromeDriver;
			public class AmazoneReal {
				
			

				public static void main(String[] args) {
					
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

				  String baseUrl = "https://www.amazon.com/";
			        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel ...";
			        String actualTitle = "Amazon.com: Online Shopping for Electronics, Apparel ...";

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
			       
			        driver.close();

	}

			}
