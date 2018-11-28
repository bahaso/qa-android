package testCase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebAppTest {
	
	public static AndroidDriver driver;
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appPackage", "com.bahaso");
		cap.setCapability("appActivity", "com.bahaso.SplashScreen");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
		cap.setCapability("noSign", "true");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
		//cap.setCapability("unlockType","pattern");
		//cap.setCapability("unlockKey", "1235789");
		cap.setCapability("device", "selendroid");
		TouchAction touch = new TouchAction(driver);
		
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.bahaso:id/input_email_username\")").sendKeys("system@bahaso.com");
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.bahaso:id/input_password\")").sendKeys("systembahaso");
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.bahaso:id/buttonGeneralLogin\")").click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.b[1]")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.b[2]")).click();
									 //hierarchy/androidwidget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TextView[1]
		//driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TextView[1]")).click();
		//driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.TextView[1]")).click();
	//driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.ImageView[1]")).click();
		 //driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]")).click();
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]")).click();
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Logout\"))").click();
	//driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"android:id/button1\")").click();
		 //driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.Button[2]")).click();

		
		Thread.sleep(3000);
		
		
			
		
		
		
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}

}
