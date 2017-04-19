package com.mvn.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.report.TestConfig;

public class NewTestNg2 extends TestConfig{
	@Test
	  public void f() {
		eTest = eReport.startTest("f");
		System.out.println("******************************888");
		  Assert.assertTrue(false, "Expected True but false");
		  eTest.log(LogStatus.FAIL, "f in TestNg2");
	  }
	  @Test
	  public void f1() {
		  eTest = eReport.startTest("f");
		  Assert.assertTrue(true, "Expected True but false");
		  eTest.log(LogStatus.PASS, "f1 in TestNg2");	  }
}
