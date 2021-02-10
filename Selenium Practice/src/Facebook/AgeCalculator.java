package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgeCalculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Launch website
		driver.navigate().to("http://www.calculator.net/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.partialLinkText("Age Calculator")).click();
		
		// Click on the month
		/*
		 * driver.findElement(By.xpath("//*[@id=\"today_Month_ID\"]")).click();
		 * driver.findElement(By.id("today_Month_ID")).sendKeys("Mar");
		 * 
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"today_Day_ID\"]")).click();
		 * driver.findElement(By.id("today_Day_ID")).sendKeys("28");
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"today_Year_ID\"]")).click();
		 * 
		 * driver.findElement(By.id("today_Year_ID")).clear(); Thread.sleep(3000);
		 * 
		 * driver.findElement(By.id("today_Year_ID")).sendKeys("1990");
		 */
		driver.findElement(By.xpath("//*[@id=\"today_ID_Link\"]/img")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[4]/span/span/table/tbody/tr[3]/td[4]")).click();
		
		
	}

}
