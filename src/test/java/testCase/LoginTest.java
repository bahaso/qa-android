package testCase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import PageFactory.LoginPage;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class LoginTest {
    private final static String APP_PACKAGE_NAME = "com.bahaso";
    private final static String APP_ACTIVITY_NAME = "com.bahaso.SplashScreen";
    private final static String PASSWORD = "systembahaso";
	public static AndroidDriver driver;
	
    public static void main(String[] args) throws Exception {
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
        
        LoginPage loginPage = new LoginPage(driver);
        if (!loginPage.isDisplayed()) {
            return;
        }
        loginPage.login("system@bahaso.com", PASSWORD);
        
        System.out.println("Test completed successfully");
        // Close session
        driver.quit();
    }
}