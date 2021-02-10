package Overstock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.overstock.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"ostk-search-combobox\"]/input")).sendKeys("bookcase" +Keys.ENTER);
		
		
		//driver.findElement(By.xpath("//*[@id=\"headerSearchContainer\"]/form/button/svg/path")).sendKeys(Keys.RETURN);
		
		//click on step bookcase
		//driver.findElement(By.xpath("//*[@id=\"sn-wrapper\"]/main/div/div[2]/div[2]/div[1]/div/div/a[1]")).click();

		//driver.findElement(By.ByTagName("document.querySelector(\"#\\\\31  > div:nth-child(1) > a > div\")")).click();
		//select the image of first item from list
		driver.findElement(By.xpath("//img[@class = 'productCardFrontImage'][1]")).click();
		
		Thread.sleep(1000);
		//Select drp= new Select(driver.findElement(By.xpath("//*[@id=\"_1v8PXey\"]/section/div[5]/select")));
		//drp.selectByVisibleText("Home");
		
//		drp.selectByIndex(2);



}}
