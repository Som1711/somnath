package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvoider {
	public static Properties pro;
	public static FileInputStream file;
    public ConfigDataProvoider()  {
	String path="C:\\Users\\Altaf\\eclipse-workspace\\Batch_11\\config\\config.properties";
	 try {
		file=new FileInputStream(path);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 pro=new Properties();
	try {
		pro.load(file);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public String getUrl1() {
	return pro.getProperty("");
	
}
}
