package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.utility.Constant;

public class Prop {

	//public static String fis = Constant.file;
	public static FileInputStream fist;
	public static Properties pro;
	public static String data;
 public static String readdata(String fis) throws IOException {
	 FileInputStream fist = new FileInputStream(new File("E:\\Amita_system\\backup\\Softwares\\health.properties"));
    	// fist = new FileInputStream(file);
    	 pro = new Properties();
    	 pro.load(fist);
    	 data = pro.getProperty(fis);
		 return data;
     }
     
}
