package testCase;

import org.testng.annotations.Test;

import PageFactory.LoginPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	final String APP_PACKAGE_NAME = "com.bahaso";
	final String APP_ACTIVITY_NAME = "com.bahaso.SplashScreen";
	final String PASSWORD = "systembahaso";
	public static AndroidDriver driver;
	
	
  @Test
  public void f() {
	  LoginPage loginPage = new LoginPage(driver);
	  
      if (!loginPage.isDisplayed()) {
          return;
      }
      
      loginPage.login("system@bahaso.com", PASSWORD);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	// Prepare Appium session
		
      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability("deviceName", "ASUS");
      capabilities.setCapability("platformName","android");
      capabilities.setCapability("platformVersion", "8.0");
      capabilities.setCapability("noSign", "true");
      capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME);
      capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME);
      // Initialize driver
      driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
      driver.resetApp();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
