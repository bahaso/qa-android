package PageFactory;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UpgradeCoursePaymentMenu {
	
private AndroidDriver<AndroidElement> driver;
    
    public UpgradeCoursePaymentMenu(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    @AndroidFindBy(id = "com.bahaso:id/btn_pay_gold")
    private AndroidElement paywithGold;
    
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
    private AndroidElement expandIndomaret;
    
    @AndroidFindBy(id = "com.bahaso:id/buttonContent")
    private AndroidElement confirmIndomaret;
    
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.LinearLayout")
    private AndroidElement expandCC;

    @AndroidFindBy(id ="com.bahaso:id/buttonContent")
    private AndroidElement confirmCC;
    
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.LinearLayout")
    private AndroidElement expandBCA;
    
    @AndroidFindBy(id = "com.bahaso:id/textViewCategory")
    private AndroidElement expandBCA2;
    
    @AndroidFindBy(id = "com.bahaso:id/buttonContent")
    private AndroidElement confirmBCA;
    
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    private AndroidElement expandMandiri;
    
    @AndroidFindBy(id = "com.bahaso:id/linearLayoutCategoryContainer")
    private AndroidElement expandMandiri2;
    
    @AndroidFindBy(id = "com.bahaso:id/buttonContent")
    private AndroidElement confirmMandiri;
    
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
    private AndroidElement expandPermata;
    
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
    private AndroidElement expandPermata2;
    
    @AndroidFindBy(id = "com.bahaso:id/buttonContent")
    private AndroidElement confirmPermata;
    
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ExpandableListView/android.widget.LinearLayout[7]/android.widget.LinearLayout")
    private AndroidElement expandBersama;
    
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ExpandableListView/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout")
    private AndroidElement expandBersama_m_banking;
    
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.ExpandableListView/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout")
    private AndroidElement expandBersamaATM;
    
    @AndroidFindBy(id = "com.bahaso:id/buttonContent")
    private AndroidElement confirmBersama_m_banking;
    
    @AndroidFindBy(id = "com.bahaso:id/buttonContent")
    private AndroidElement confirmBersamaATM;
}
