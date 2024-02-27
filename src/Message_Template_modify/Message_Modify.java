package Message_Template_modify;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Message_Modify {
	
WebDriver driver;
	
	public Message_Modify(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Settings")
	WebElement settings;
	
	@FindBy(linkText="Message Template")
	WebElement message;
	
	@FindBy(xpath="//input[@placeholder='Search']")//1110
	WebElement search;
	
	@FindBy(xpath="//span[normalize-space()='1111']")
	WebElement search_code;
	
	@FindBy(xpath="//div[contains(@class,'btn-md float-right margin-left')]")
	WebElement modify;

	
	//@FindBy(xpath="(//div[contains(@class,'btn-lg float-right margin-left')][normalize-space()='Delete'])[1]")
	//WebElement smsdelete;
	
	@FindBy(xpath="//div[contains(text(),'Yes')]")
	WebElement yes;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search1;
	
	@FindBy(xpath="//textarea[@id='smsMsgTemplate__id']")//sms
	WebElement sms1;
	
	//@FindBy(xpath="//span[normalize-space()='1110']")
	//WebElement c2;
	
	//@FindBy(xpath="//div[contains(@class,'btn-md float-right margin-left')]")
	//WebElement c3;
	
	@FindBy(xpath="(//span[contains(text(),'FCM Template')])[3]")
	WebElement fcm_template;
	
	@FindBy(xpath="//span[normalize-space()='FCM Template']")
	WebElement fcm;
	
	@FindBy(xpath="//textarea[@id='fcmMsgTemplate__id']")//fcm
	WebElement fcm2;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success;


	@FindBy(xpath="//div[normalize-space()='Update']")
	WebElement update;
	

	@FindBy(xpath="//div[@class='side-nav-menu-in scrollbar row']")
	WebElement scroll;
	
	public void Message(String num1) throws InterruptedException
	{
		Thread.sleep(3000);
		settings.click();
		message.click();
		Thread.sleep(3000);
		search.sendKeys(num1);
		
	}
	
	public void Modify() throws InterruptedException
	{
		
		search_code.click();
		modify.click();
		Thread.sleep(3000);
		
	}
	public void Sms_Modify(String str)
	{
		sms1.click();
		sms1.clear();
		sms1.sendKeys(str);
	}
	
	
	public void Scroll()
	{	
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView();", fcm_template);
		fcm_template.click();
	}
	public void Fcm_Modify(String str2) throws InterruptedException
	
	{
		fcm2.click();
		fcm2.clear();
		fcm2.sendKeys(str2);
		Thread.sleep(3000);
		update.click();
		yes.click();
		Thread.sleep(3000);
		System.out.println(success.getText());
		Thread.sleep(5000);
		
	}
	
	public void Scroll1() throws InterruptedException
	{	
		Thread.sleep(2000);
		scroll.click();
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView();", fcm);
		fcm.click();
	}
	
}
