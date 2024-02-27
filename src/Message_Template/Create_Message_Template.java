package Message_Template;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Message_Template {
	
WebDriver driver;
	
	public Create_Message_Template(WebDriver driver) 
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
	
	@FindBy(xpath="//span[normalize-space()='1110']")
	WebElement c1;
	
	@FindBy(xpath="//div[contains(@class,'btn-md float-left margin-right')]")
	WebElement create;
	//SMS
	@FindBy(xpath="//*[text()='SMS']")
	WebElement sms;
	
	@FindBy(xpath="//*[text()='FCM']")
	WebElement fcm;
	

	@FindBy(xpath="//textarea[@id='smsMsgTemplate__id']")//sms
	WebElement sms1;
	
	//FCM
	@FindBy(xpath="//input[@id='fcmSubject__id']")//fcm
	WebElement fcm1;
	
	@FindBy(xpath="//textarea[@id='fcmMsgTemplate__id']")//fcm
	WebElement fcm2;
	
	@FindBy(xpath="//div[normalize-space()='Create']")
	WebElement fcm3;
	
	@FindBy(xpath="//div[contains(text(),'Yes')]")
	WebElement yes;
	
	@FindBy(xpath="//span[normalize-space()='FCM Template']")
	WebElement template;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success;
	
	
	
	public void Message(String num1) throws InterruptedException
	{
		Thread.sleep(3000);
		settings.click();
		message.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(search)).sendKeys(num1);
		
	}
	
	public void Sms(String num2) throws InterruptedException
	{
		
		c1.click();
		create.click();
		Thread.sleep(3000);
		sms.click();
		fcm.click();
		sms1.sendKeys(num2);
		Thread.sleep(2000);
		System.out.println("SMS:" +sms1.getText());
		
	}
	public void Scroll()
	{
		//Down FCM
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", template);
		template.click();
		
	}
	public void Fcmmessage(String string2,String string3) throws InterruptedException
	
	{
		Thread.sleep(3000);
		fcm1.sendKeys(string2);
		fcm2.sendKeys(string3);
		fcm3.click();
		Thread.sleep(2000);
		yes.click();
		Thread.sleep(3000);
		System.out.println("Message Template:" +success.getText());
		
		
	}
	
	
	
	

}
