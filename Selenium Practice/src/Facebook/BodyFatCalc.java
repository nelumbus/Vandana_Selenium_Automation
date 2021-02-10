package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BodyFatCalc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
         driver.findElement(By.partialLinkText("Body Fat Calculator")).click();
Thread.sleep(10000);
        // Click on Age
        //driver.findElement(By.xpath("//*[@id=\"calinputtable\"]/form")).click();
		 //click on radio button
         driver.findElement(By.id("csex2")).click();

         System.out.println("The Output of the IsSelected " +driver.findElement(By.id("csex2")).isSelected());
         System.out.println("The Output of the IsEnabled " +driver.findElement(By.id("csex2")).isEnabled());
         System.out.println("The Output of the IsDisplayed " +driver.findElement(By.id("csex2")).isDisplayed());
 

	}

}
