package com.kh.map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropLoadObject {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			//prop.load(new FileInputStream("config.txt"));
			prop.loadFromXML(new FileInputStream("config.xml"));
						
			System.out.println(prop);
			System.out.println(prop.getProperty("소유자"));
		
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
