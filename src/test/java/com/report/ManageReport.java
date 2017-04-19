package com.report;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;

import com.relevantcodes.extentreports.ExtentReports;

public class ManageReport {
	
	public String timeStamp=null;
	//diretory path of report
	public String dirPath = System.getProperty("user.dir")+"\\reports"+"\\screenshorts";
	public String reportFileName = System.getProperty("user.dir")+"\\reports"+"\\report.html";
	
	public ExtentReports eReport;
	
	

	public void createReportDirectory(){
		boolean isFile = false;
		File file = new File(dirPath);
		if(!file.exists()){
			isFile =  file.mkdirs();
			isFile = true;
		}
		if(isFile)
			System.out.println("created Directory: "+dirPath);
		else
			System.out.println("DirectoryAvailable:"+ dirPath);
	}
	
	public void cleanReport() throws IOException{
		boolean isFile = false;
		String delDir = System.getProperty("user.dir")+"\\reports";
		File f1 = new File(delDir);
		if(f1.exists()){
			FileUtils.deleteDirectory(f1);
		}
	}
	
//	public static void main(String a[]){
//		ManageReport m = new ManageReport();
//		System.out.println(m.dirPath);
//		System.out.println(m.reportFileName);
//	}


}
