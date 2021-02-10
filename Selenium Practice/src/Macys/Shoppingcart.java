package Macys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shoppingcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Launch website
		
		driver.navigate().to("https://www.macys.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"showByDepartmentCaret\"]")).click();
		Thread.sleep(2000);
		
		Select drp= new Select(driver.findElement(By.xpath("//*[@id=\"facetsContainer\"]/ol/li[2]/h1/span")));
		//drp.selectByVisibleText("Home");
		
		drp.selectByIndex(7);

	}
	

}
