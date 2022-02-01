package com.crm.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImpClass implements ITestListener {
	
	public void OnTestFailure(ITestResult result) {
		String testname =result.getMethod().getMethodName();
		System.out.println(testname+ "+=========Execute & iam Listening====");
		EventFiringWebDriver  eDriver=new EventFiringWebDriver(BaseClassAnnotation.sDriver);
	    File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
	    try {
	    	FileUtils.copyFile(srcFile,new File("./screenshot/"+testname+".png"));
	    } catch(IOException e) {
	    	
	    			
	    }
		
	}

}
