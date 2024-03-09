package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genricUtility.readExcel;
import genricUtility.readProperty;


public class readExel1 {
	@DataProvider 
	public Object[][] data() {
		readExcel read = new readExcel();
		Object [][] data = read.ReadMultipleData("Sheet1");
		return data;
	}
	
	@Test (dataProvider = "data")
	public void login(String UserName, String Password) throws Throwable {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		readProperty properties = new readProperty();
		String url = properties.fetchProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		String username = properties.fetchProperty("username");
		String password = properties.fetchProperty("password");
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Reporter.log("login successful",true);
		
		Thread.sleep(3000);
		}

}
