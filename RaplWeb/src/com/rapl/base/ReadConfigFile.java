package com.rapl.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	
	public Properties properties;
	
	public void readConfig() {
		try {
			properties = new Properties();
			FileInputStream filestream = new FileInputStream(System.getProperty("user.dir")+"/Config/Config.properties");
			properties.load(filestream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}