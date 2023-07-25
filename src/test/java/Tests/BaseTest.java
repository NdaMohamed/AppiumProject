package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import Pages.LoginPage;
import io.appium.java_client.AppiumDriver;

public class BaseTest {
	  public WebDriver driver;
	  LoginPage loginPage;
	    
	@BeforeTest
	public void Setup() throws InterruptedException
	{
	try {
		
		DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("deviceName", "RZ8RC1YVMDB");
        caps.setCapability("udid", "RZ8RC1YVMDB");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion","33");
        caps.setCapability("appPackage","com.swaglabsmobileapp");
        caps.setCapability("appActivity","com.swaglabsmobileapp.MainActivity");
        String urlst = "https://github.com/vdespa/introduction-to-postman-course/blob/main/simple-books-api.md"; 
			
        @SuppressWarnings("deprecation")
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver (url,caps);
		System.out.print("Application Started....");
		loginPage=new LoginPage(driver);	
		
		
		
        
 
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}

