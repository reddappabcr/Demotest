package BaseClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	@Test
	  public void OpenBrowser() {
		  System.out.println("open browser");
	  }
	  
	/**  @BeforeMethod
	  public void Login() {
		  System.out.println("Login");
	  }
	  
	  @AfterMethod
	  public void LogOut() {
		  System.out.println("LogOut");
	  }
	  @AfterClass
	  public void CloseBrowser() {
		  System.out.println("close");
	  }  **/
}
