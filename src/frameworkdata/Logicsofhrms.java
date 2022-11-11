package frameworkdata;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

;

public class Logicsofhrms extends Dataofhrms 

{
	
public void openApplication() {
	System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	System.out.println("app opened");
	Log.info("app opened");
	
}
	
public void login()
{
	driver.findElement(By.name(usernametxt)).sendKeys(usename);
	driver.findElement(By.name(passwordtxt)).sendKeys(password);
	driver.findElement(By.name(loginbtn)).click();
	System.out.println("login completed");
	Log.info("login completed");
}
public void enterintoframes() {
	driver.switchTo().frame(frame);
	System.out.println("entered in to frame");
	Log.info("entered in to frame");
}
	
public void exitfromframes()
{
	driver.switchTo().defaultContent();
	System.out.println("exited fromframes");
}
public void adddetails() 
{
	
	driver.findElement(By.xpath(addbtn)).click();
	driver.findElement(By.name(firstname)).sendKeys(frstname);
	driver.findElement(By.name(lastname)).sendKeys(lstname);
	driver.findElement(By.id(save)).click();
	System.out.println("details added");
	
}
public void logout() {
	
	driver.findElement(By.linkText(logout)).click();
	System.out.println("logout completed");
	
}
	public void close()
	{
		driver.quit();
		System.out.println("exited from app");
	}
	public void  selectempbyname() {
driver.findElement(By.xpath(empname)).click();
	}
	
public void newname() {
driver.findElement(By.name(edit_btn)).click();
driver.findElement(By.name(firstname)).clear();
driver.findElement(By.name(firstname)).sendKeys(frstname1);
driver.findElement(By.name(lastname)).clear();
driver.findElement(By.name(lastname)).sendKeys(lstname1);
driver.findElement(By.xpath(Save_btn)).click();
System.out.println("frst name and last name newely added");
}
	

public void title() 
{
	if (driver.getTitle().equals(title)) 
	{
	
		System.out.println("title matched");
	}
	else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
	}
	}public Logicsofhrms() {
		// TODO Auto-generated constructor stub
	} 
	

	public void searchbydropdown() 
{
Select st= new Select(driver.findElement(By.name(selectby)));
st.selectByIndex(1);
System.out.println("empid searched");
}
public void searchfor() {
	driver.findElement(By.name(searchfor)).sendKeys(searchforvalue);
	System.out.println("data entered in searchby box");
}

public void search() {
	driver.findElement(By.xpath(search_btn)).click();
	System.out.println("emp data searched");
}

public void selectcheckbox() {
	driver.findElement(By.xpath(checkbox)).click();
	System.out.println("emp data seleted");
}

public void  delete() {
	driver.findElement(By.xpath(delete_btn)).click();
	System.out.println("emp data deleted");
}

  
































}
