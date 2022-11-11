package hrmsprograms;

import org.testng.annotations.Test;

import frameworkdata.Logicsofhrms;
@Test
public class Tc04 {
{
		Logicsofhrms bhaskar=new Logicsofhrms();
		bhaskar.openApplication();
		bhaskar.title();
		bhaskar.login();
		bhaskar.enterintoframes();
		bhaskar.searchbydropdown();
		bhaskar.searchfor();
		bhaskar.search();
		bhaskar.selectcheckbox();
		bhaskar.delete();
		bhaskar.exitfromframes();
		bhaskar.logout();
		bhaskar.close();	
		
	}

}
