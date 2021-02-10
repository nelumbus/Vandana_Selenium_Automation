package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/?gws_rd=ssl");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("a");
driver.findElement(By.name("btnK")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[2]/div/div[2]/input")).clear();
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[2]/div/div[2]/input")).sendKeys("b");
driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[2]/div/div[2]/input")).clear();
Thread.sleep(2000);


driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[2]/div/div[2]/input")).sendKeys("Vandana Singh");


	}

}
