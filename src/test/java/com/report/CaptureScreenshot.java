package com.report;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	public static String get(String screenshotName, WebDriver driver, String dateStr){
		try{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File scrnst = ts.getScreenshotAs(OutputType.FILE);
			String scrnFile = System.getProperty("user.dir")+"\\reports\\screenshots\\"+screenshotName+dateStr+".png";
			File screnFile = new File(scrnFile);
			FileUtils.copyFile(scrnst, screnFile);
			System.out.println("screenshot captured:"+screenshotName);
			return scrnFile;
		}catch(Exception e){
			System.out.println("captured screenshot"+ e.getMessage());
			return e.getMessage();
		}
	}

}
