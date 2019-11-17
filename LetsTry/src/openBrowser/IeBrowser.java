package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowser {
	public static WebDriver driver;
	
	/*website and password
	 * http://leaftaps.com/opentaps/control/main
	 * Login as user -> DemoSalesManager & password crmsfa
	 */
	
	public static void ieBrowser(){
		System.setProperty("webdriver.ie.driver", "E:\\Refresh Selenium\\Driver\\Updated Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
	}
	
	
	
	public static void main(String[] args) {
		ieBrowser();
	}

}
