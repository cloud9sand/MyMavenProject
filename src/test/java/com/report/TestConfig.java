package com.report;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestConfig extends ManageReport{
	
	public static ExtentReports eReport;
	public static ExtentTest eTest;
	public WebDriver driver;
	public static String dateStr;
	
	@AfterMethod
	public void afterMethod(ITestResult result){
		if(result.getStatus() == ITestResult.FAILURE){
			String screenshotPath = CaptureScreenshot.get(result.getName(), driver, dateStr);
			eTest.log(LogStatus.INFO, "snapshot below: "+eTest.addScreenCapture(screenshotPath));
			eTest.log(LogStatus.FAIL, result.getThrowable());
		}if(result.getStatus()==ITestResult.SKIP){
			eTest.log(LogStatus.SKIP, "Test Skipped  "+ result.getThrowable());
		}else{
			eTest.log(LogStatus.PASS, "Test Passed");
		}
		
		eReport.endTest(eTest);
		eReport.flush();
	}
	
	@BeforeSuite
	public void beforeSuite() throws IOException{
		driver = new FirefoxDriver();
		driver.get("http://google.com");
		cleanReport();
		createReportDirectory();
		SimpleDateFormat df = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		dateStr = df.format(new Date());
		final String filePath = System.getProperty("user.dir")+"\\reports\\TestReport.html";
		eReport = ExtentReportManager.getReporter(filePath);
	}
	
	@AfterSuite
	public void afterSuite(){
		eReport.close();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
