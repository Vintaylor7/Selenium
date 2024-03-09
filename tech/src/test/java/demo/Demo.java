package demo;

import baseclass.Baseclass;
import genricUtility.readProperty;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Demo extends Baseclass{
	@Test
	public void addAddress(){
		//navigating to add address in my profile
		driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
		driver.findElement(By.xpath("//button[text()='Add Address']")).click();
		
		//fetching required data
		readProperty properties = new readProperty();
		String name = properties.fetchProperty("name");
		String house = properties.fetchProperty("house");
		String street = properties.fetchProperty("street");
		String landmark = properties.fetchProperty("landmark");
		String pincode = properties.fetchProperty("pincode");
		String phonenum = properties.fetchProperty("phonenum");
		
		//navigating and sending data
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='House/Office Info']")).sendKeys(house);
		driver.findElement(By.xpath("//input[@id='Street Info']")).sendKeys(street);
		driver.findElement(By.xpath("//input[@id='Landmark']")).sendKeys(landmark);
		
		
		
		// drop down handles
		driver.findElement(By.xpath("//option[@id='India']")).click();
		driver.findElement(By.xpath("//option[@id='Karnataka']")).click();
		driver.findElement(By.xpath("//option[@id='Bengaluru']")).click();
		
		driver.findElement(By.xpath("//input[@id='Pincode']")).sendKeys(pincode);
		System.out.println(pincode);
		driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys(phonenum);
		
		//add address
		driver.findElement(By.xpath("//button[text()='Add Address']")).click();
		Reporter.log("Address added succesfully",true);
		
	}
}
