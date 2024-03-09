//package testscripts;
//
//
//
//import org.openqa.selenium.By;
//
//import org.testng.Reporter;
//import org.testng.annotations.Test;
//
//import baseclass.Baseclass;
//
//public class deleteAddressTest extends Baseclass{
//	
//	@Test(groups = "regression")
//	public void deleteAddress() {
//		//navigating to add address in my profile
//				driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();
//				driver.findElement(By.xpath("//li[text()='My Profile']")).click();
//				driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
//				
//		//deleting the address
//		
//		driver.findElement(By.xpath("//*[name()='path' and @d='M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zM19 4h-3.5l-1-1h-5l-1 1H5v2h14V4z']")).click();
//		
//		driver.findElement(By.xpath("//button[text()='Yes']")).click();
//		
//		//pop handles
//		
//		
//		driver.switchTo().alert().accept();
//		
//		Reporter.log("address deleted");
//	}
//
//}
