package com.report;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportManager {
	public static ExtentReports eReport;
	
	public static ExtentReports getReporter(String filePath){
		if(eReport== null){
			eReport = new ExtentReports(filePath, false);
			
			eReport.addSystemInfo("Host Name", "Sandeep").addSystemInfo("Environment", "QA");
			
		}
		return eReport;
		
	}

}
