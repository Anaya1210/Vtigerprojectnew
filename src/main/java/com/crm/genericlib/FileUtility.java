package com.crm.genericlib;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	/**
	 * it is used to read the data from commondata.properties file based on key which you pass as an argument
	 * @param key
	 * @throws throwable
	 */
	
	public String readDataFromPropertyFile(String key)  throws Throwable{
	 FileInputStream fis=new FileInputStream (".\\src\\test\\resources\\commondata.property");
	 Properties pobj=new Properties();
	 pobj.load(fis);
	 String value= pobj.getProperty(key);
	 return value;
	}

	
	

}
	