package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalorieCalc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
         driver.findElement(By.partialLinkText("Calorie Calculator")).click();
Thread.sleep(10000);
        // Click on Age
        //driver.findElement(By.xpath("//*[@id=\"calinputtable\"]/form")).click();
		 
         driver.findElement(By.id("csex2")).click();
// Click on radio button (Female) 
         System.out.println("The Output of the IsSelected " +driver.findElement(By.id("csex2")).isSelected());
         System.out.println("The Output of the IsEnabled " +driver.findElement(By.id("csex2")).isEnabled());
         System.out.println("The Output of the IsDisplayed " +driver.findElement(By.id("csex2")).isDisplayed());
 
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("cheightfeet")).clear();
		
		driver.findElement(By.name("cheightfeet")).sendKeys("6");
		
		driver.findElement(By.name("cheightinch")).clear();
		
         driver.findElement(By.id("cheightinch")).sendKeys("11");
         
         driver.findElement(By.name("cpound")).clear();
         driver.findElement(By.name("cpound")).sendKeys("166");
         //drop down activity
         
         Select drp= new Select(driver.findElement(By.name("cactivity")));
       drp.selectByVisibleText("Sedentary: little or no exercise");
       
       driver.findElement(By.xpath("//*[@id='content']/div[5]/table[4]/tbody/tr[3]/td[2]/input[2]")).click();

	}

}
