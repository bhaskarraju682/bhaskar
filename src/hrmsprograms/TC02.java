package hrmsprograms;
import org.testng.annotations.Test;

//add the employee data
import frameworkdata.Logicsofhrms;

public class TC02{ 

 @Test
public void tc001() {
	Logicsofhrms bhaskar= new Logicsofhrms();
	bhaskar.openApplication();
	bhaskar.login();
	bhaskar.enterintoframes();
	bhaskar.adddetails();
	bhaskar.exitfromframes();
	bhaskar.logout();
	bhaskar.close();
	
}
}

