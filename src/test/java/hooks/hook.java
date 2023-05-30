package hooks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.property.Config_Helper;
import com.utility.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hook extends Baseclass{
	public static WebDriver driver;
	
	@Before
	public void presetup() throws IOException{
		
//		System.out.println(Config_Helper.getinstanceCR().getBrowser());
		
	driver=BrowserLaunch(Config_Helper.getinstanceCR().getBrowser());
	driver.get(Config_Helper.getinstanceCR().getUrl());
//	
//	System.out.println(driver);
//	System.out.println(Config_Helper.getinstanceCR().getUrl());
	
		
	}
	
	@After
	public void close() {
//		driver.close();
	}


}
