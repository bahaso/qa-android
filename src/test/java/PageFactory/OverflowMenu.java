package PageFactory;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OverflowMenu {
	
	 private AndroidDriver<AndroidElement> driver;
	    
	    public OverflowMenu(AndroidDriver<AndroidElement> driver) {
	        this.driver = driver;
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }
	    
	    @AndroidFindBy(id = "com.bahaso:id/menu_overflow")
	    private AndroidElement overflowElement;
	    
	    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]\r\n")
	    private AndroidElement settingButton;

}
