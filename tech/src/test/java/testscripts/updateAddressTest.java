package testscripts;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class updateAddressTest extends Baseclass {
	
	@Test(groups = "smoke")
	public void updateAddress(){
		//navigating to add address in my profile
		driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
		//update address
		driver.findElement(By.xpath("//*[name()='svg' and @id='editaddress_fl']")).click();
		driver.findElement(By.xpath("//*[name()='input' and @id='Name']")).sendKeys("Vintaylor");
		driver.findElement(By.xpath("//button[text()='Update Address']")).click();
		Reporter.log("address updated");
}
}