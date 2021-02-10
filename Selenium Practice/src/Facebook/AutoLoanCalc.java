package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoLoanCalc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Launch website
		driver.navigate().to("http://www.calculator.net/");
		// Maximize the browser
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Financial Calculators")).click();
		driver.findElement(By.partialLinkText("Auto Loan Calculator")).click();
		/*
driver.findElement(By.xpath("//*[@id=\"hl1\"]/li[3]/a")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.xpath("//*[@id='content']/table[2]/tbody/tr/td/div[4]/a")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
*/
driver.findElement(By.name("cloanamount")).clear();
driver.findElement(By.name("cloanamount")).sendKeys("25000");
	
driver.findElement(By.name("cloanterm")).clear();
driver.findElement(By.name("cloanterm")).sendKeys("60");
	
driver.findElement(By.name("cloanterm")).clear();
driver.findElement(By.name("cloanterm")).sendKeys("4.5");

driver.findElement(By.name("cdownpayment")).clear();
driver.findElement(By.name("cdownpayment")).sendKeys("5000");
	
driver.findElement(By.name("ctradeinvalue")).clear();
driver.findElement(By.name("ctradeinvalue")).sendKeys("0");
	
//driver.findElement(By.name("cstate")).clear();
//driver.findElement(By.name("cstate")).sendKeys("Iowa");

Select drp= new Select(driver.findElement(By.name("cstate")));
//drp.selectByVisibleText("Iowa");

//drp.selectByValue("ND");

drp.selectByIndex(4);

driver.findElement(By.name("ctitlereg")).clear();
driver.findElement(By.name("ctitlereg")).sendKeys("7");
	
driver.findElement(By.name("cttrinloan")).clear();
driver.findElement(By.name("cttrinloan")).sendKeys("10");
/*	
driver.findElement(By.name("cloanterm")).clear();
driver.findElement(By.name("cloanterm")).sendKeys("1000");
*/
//*[@id="content"]/table/tbody/tr/td[2]/h2
Thread.sleep(2000);

//Click Calculate Button
driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr/td[1]/table/tbody/tr[10]/td/input[3]")).click();

//Close the Browser.//*[@id="calinputtable"]/tbody/tr[10]/td/input[3]
driver.close();
	
	}

}
