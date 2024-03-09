package demo;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import baseclass.Baseclass;

import java.io.FileInputStream;

public class Advancereports extends Baseclass  {

	@Test
	public void  loginTest() {
		ExtentReports report = new ExtentReports("./Advancereports/logintest.html");
		ExtentTest test = report.startTest("loginteest");
		test.log(LogStatus.INFO,"Navigated to welcome screen");
		test.log(LogStatus.INFO,"Navigated to welcome screen");
		test.log(LogStatus.FAIL,"failed");
		report.endTest(test);
		report.flush();
	}
	
}