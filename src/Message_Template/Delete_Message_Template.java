package Message_Template;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_Message_Template {
	
	WebDriver driver;
	
	public Delete_Message_Template(WebDriver driver) 
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
	
	@FindBy(xpath="//div[contains(@class,'btn-md float-right margin-left')]")
	WebElement modify;

	
	@FindBy(xpath="(//div[contains(@class,'btn-lg float-right margin-left')][normalize-space()='Delete'])[1]")
	WebElement smsdelete;
	
	@FindBy(xpath="//div[contains(text(),'Yes')]")
	WebElement yes;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search1;
	
	@FindBy(xpath="//span[normalize-space()='1110']")
	WebElement c2;
	
	@FindBy(xpath="//div[contains(@class,'btn-md float-right margin-left')]")
	WebElement c3;
	
	@FindBy(xpath="//span[normalize-space()='Parent SMS Template']")
	WebElement template;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success;


	@FindBy(xpath="//div[normalize-space()='Delete']")
	WebElement delete;
	
	
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
		
		c1.click();
		modify.click();
		Thread.sleep(3000);
		
	}
	public void Scroll()
	{	
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView();", template);
		template.click();
		
	}
	public void Smsdelete() throws InterruptedException
	
	{
		Thread.sleep(3000);
		smsdelete.click();
		yes.click();
		Thread.sleep(3000);
		System.out.println(success.getText());
		
	}
	
	public void Delete(String num2) throws InterruptedException
	
	{
		Thread.sleep(3000);
		search1.clear();
		search1.sendKeys(num2);
		c2.click();
		c3.click();
		Thread.sleep(3000);
		
	}
	public void Scroll1() throws InterruptedException
	{	
		
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].scrollIntoView();", delete);
		delete.click();
		yes.click();
		Thread.sleep(3000);
		System.out.println("Deletion of Message Template:" +success.getText());
		
	}
	
	

}
