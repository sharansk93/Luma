package com.property;

import java.io.IOException;

public class Config_Helper {
	
	private Config_Helper() {
		
	}
	
	public static Config_Reader getinstanceCR() throws IOException {
		Config_Reader cr= new Config_Reader();
		return cr;
	}

}
