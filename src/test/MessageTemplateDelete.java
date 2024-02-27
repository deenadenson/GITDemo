package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageTemplateDelete {
	
	
WebDriver driver;
	
	public MessageTemplateDelete(WebDriver driver) 
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
	

	
	public void message(String num1) throws InterruptedException
	{
		Thread.sleep(3000);
		settings.click();
		message.click();
		Thread.sleep(3000);
		search.sendKeys(num1);
		
	}
	
	public void modify() throws InterruptedException
	{
		
		c1.click();
		modify.click();
		Thread.sleep(3000);
		
	}
	public void scroll()
	{	
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.xpath("//span[normalize-space()='Parent SMS Template']"));
		jse1.executeScript("arguments[0].scrollIntoView();", element1);
		driver.findElement(By.xpath("//span[normalize-space()='Parent SMS Template']")).click();
		
	}
	public void smsdelete() throws InterruptedException
	
	{
		Thread.sleep(3000);
		smsdelete.click();
		yes.click();
		
	}
	
	public void delete(String num2) throws InterruptedException
	
	{
		Thread.sleep(3000);
		search1.clear();
		search1.sendKeys(num2);
		c2.click();
		c3.click();
		Thread.sleep(3000);
		
	}
	public void scroll1()
	{	
		
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		WebElement element2 = driver.findElement(By.xpath("//div[normalize-space()='Delete']"));
		jse2.executeScript("arguments[0].scrollIntoView();", element2);
		driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Yes')]")).click();
		
	}
	
	
	

}
