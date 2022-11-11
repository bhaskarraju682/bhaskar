package hrmsprograms;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

//login logout
import frameworkdata.Logicsofhrms;
@Test
public class Tc01 {
	{
		DOMConfigurator.configure("log4j.xml");
		Logicsofhrms bhaskar= new Logicsofhrms();
		bhaskar.openApplication();
		bhaskar.login();
		bhaskar.logout();
		bhaskar.close();
	}

}
