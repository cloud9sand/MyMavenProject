package com.mvn.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.report.TestConfig;

public class NewTestNg1 extends TestConfig{
	
  @Test
  public void f() {
	  eTest = eReport.startTest("f");
	  Assert.assertTrue(true, "Expected True but false");
	  
	  eTest.log(LogStatus.PASS, "Assertion passed in f - NewTestNg1");
  }
  @Test
  public void f1() {
	  eTest = eReport.startTest("f");
	  Assert.assertTrue(true, "Expected True but false");
	  eTest.log(LogStatus.PASS, "Assertion passed in f1 - NewTestNg2");
  }
  
}
