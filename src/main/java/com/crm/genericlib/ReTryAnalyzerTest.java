package com.crm.genericlib;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryAnalyzerTest implements IRetryAnalyzer{

	public boolean retry(ITestResult result) {
		int counter=0;
		int retry=4;
		if(counter<retry) {
			counter++;
			return true;
			
		}
		
		return false;
	}

}
