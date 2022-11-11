package hrmsprograms;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import frameworkdata.Logicsofhrms;
@Test
public class Tc003 {
	{
		DOMConfigurator.configure("log4j.xml");
		Logicsofhrms bhaskar =new Logicsofhrms();
		bhaskar.openApplication();
		bhaskar.login();
		bhaskar.enterintoframes();
		bhaskar.selectempbyname();
	    bhaskar.newname();
        bhaskar.exitfromframes();
		bhaskar.logout();
		bhaskar.close();
		
		
	}

}
