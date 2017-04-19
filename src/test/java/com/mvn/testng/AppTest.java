package com.mvn.testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.report.TestConfig;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestConfig
   
{
		//mvn --version
	//Create Maven project
	
		//mvn archetype:generate
		//  choose anumber : Enter
		// enter
		//groupId: com.mvn.testng
		//artifactId: MyMvnProject - (Project title)
		//vesrion: enter
	//convert into eclipse env
	    //mvn  eclipse:eclipse
		//added src files
	//validate
		//mvn validdate
	//compile
		//compile
	//package
	//run
		//mvn test
	//to generate report
	//mvn test site
	
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
    public void testApp()
    {
    	System.out.println("****************************8");
    	eTest = eReport.startTest("AppTest");
    	
       assertTrue(true);
       eTest.log(LogStatus.PASS, "Assertion pass");

       assertTrue(false);
       eTest.log(LogStatus.FAIL, "Assertion fail");
    }
}
