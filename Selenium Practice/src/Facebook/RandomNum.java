package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Launch website
		driver.navigate().to("http://www.calculator.net/");
		// Maximize the browser
		driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\'contentout\']/table/tbody/tr/td[3]/div[2]/a")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.xpath("//*[@id='content']/table[2]/tbody/tr/td/div[4]/a")).click();

driver.findElement(By.name("slower")).clear();
driver.findElement(By.name("slower")).sendKeys("10");
driver.findElement(By.name("supper")).clear();
driver.findElement(By.name("supper")).sendKeys("100");
driver.findElement(By.name("submit1")).click();
String result = driver.findElement(By.xpath("//*[@id=\'content\']/p[2]")).getText();
	//Print a Log In message to the screen
	System.out.println(" The Result is " + result);
	//Close the Browser.



	}

}
