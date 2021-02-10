package Facebook;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe");
WebDriver Vandana = new ChromeDriver();
Vandana.get("https://www.facebook.com/");
Vandana.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
Vandana.manage().window().maximize();
Vandana.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("emailid");
Vandana.findElement(By.id("pass")).sendKeys("passid");
Vandana.findElement(By.name("login")).click();


	}

}