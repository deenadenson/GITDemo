package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageTemplate {
	
WebDriver driver;
	
	public MessageTemplate(WebDriver driver) 
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
	

	
	public void message(String num1) throws InterruptedException
	{
		Thread.sleep(3000);
		settings.click();
		message.click();
		Thread.sleep(3000);
		search.sendKeys(num1);
		
	}
	
	public void sms(String num2) throws InterruptedException
	{
		
		c1.click();
		create.click();
		Thread.sleep(3000);
		sms.click();
		fcm.click();
		sms1.sendKeys(num2);
		
	}
	public void scroll()
	{
		//Down FCM
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='FCM Template']"));
		jse.executeScript("arguments[0].scrollIntoView();", element);
		driver.findElement(By.xpath("//span[normalize-space()='FCM Template']")).click();
		
	}
	public void fcmmessage(String string2,String string3) throws InterruptedException
	
	{
		Thread.sleep(3000);
		fcm1.sendKeys(string2);
		fcm2.sendKeys(string3);
		fcm3.click();
		yes.click();
		
		
	}
	
	



}
