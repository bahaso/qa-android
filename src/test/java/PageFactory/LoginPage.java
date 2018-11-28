package PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
    private AndroidDriver<AndroidElement> driver;
    
    public LoginPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    //@AndroidFindBy(className = "UIAKeyboard")
    //private AndroidElement keyboard;
    @AndroidFindBy(id = "com.bahaso:id/input_email_username")
    private AndroidElement nameElement;
    @AndroidFindBy(id = "com.bahaso:id/input_password")
    private AndroidElement passwordElement;
    @AndroidFindBy(id = "com.bahaso:id/buttonGeneralLogin")
    private AndroidElement loginElement;
    
    public boolean isDisplayed() {
        return loginElement.isDisplayed();
    }
    
    public void typeName(String name) {
        nameElement.sendKeys(name);
    }
    
    public void typePassword(String password) {
        passwordElement.sendKeys(password);
    }
    
    public void clickLogin() {
        loginElement.click();
    }
    
    //public void hideKeyboardIfVisible() {
       // if (keyboard != null) {
            //driver.pressKeyCode(AndroidKeyCode.KEYCODE_ESCAPE);
       // }
   // }
    
    public void login (String name, String password) {
        //hideKeyboardIfVisible();
        typeName(name);
        typePassword(password);
        clickLogin();
    }
}