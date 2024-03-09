package baseclass;
import genricUtility.*;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass {
	public WebDriver driver;
	
//	@Parameters("browser")
	@BeforeClass (alwaysRun = true)
	public void openBrowser() {
		
//		if (browser.equals("Chrome")) {
//			driver = new ChromeDriver();
//		}
//		else if(browser.equals("Edge")){
//			driver = new EdgeDriver();
//		}
//		else {
//			driver = new ChromeDriver();
//		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		readProperty properties = new readProperty();
		String url = properties.fetchProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Reporter.log("browser opened",true);
	}
	
		
	@BeforeMethod(alwaysRun = true)
	public void login() {
		readProperty properties = new readProperty();
		String username = properties.fetchProperty("username");
		String password = properties.fetchProperty("password");
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Reporter.log("login successful",true);
		}
		
	@AfterMethod(alwaysRun = true)
	public void logout() {
//			driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();
//			driver.findElement(By.xpath("//li[text()='Logout']")).click();
		}
	
	@AfterClass(alwaysRun = true)
	public void closerowser() {
		
//		Reporter.log("browser closed successfully",true);
		}
}
	
