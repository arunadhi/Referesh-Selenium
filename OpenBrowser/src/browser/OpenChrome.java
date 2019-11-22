package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenChrome {
	
	public static WebDriver driver;
	public static void openIE(){
		
		System.setProperty("webdriver.ie.driver", "E:\\Refresh Selenium\\Driver\\Updated Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		
		
	}
	
	
	public static void main(String[] args) {
		openIE();
	}

}
