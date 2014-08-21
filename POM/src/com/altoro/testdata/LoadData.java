package com.altoro.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadData {
	
	static Properties propData=new Properties();
	static Properties propObject=new Properties();
	
	public static void loadPropertyFiles() {
		
		try {
			propData.load(new FileInputStream("TestData.properties"));
			propObject.load(new FileInputStream("ObjectRepository.properties"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public static String getTestData(String property) {
		return propData.getProperty(property);
	}
	
	public static String getObject(String property) {
		return propObject.getProperty(property);
	}

}
