package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {
	
	Properties p;
	
	public Config_Reader() throws IOException {
		File f = new File("src/main/java/com/property/value.properties");
		FileInputStream i= new FileInputStream(f);
		p = new Properties();
		p.load(i);
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
		
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
		
	}

}
