package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceModify {
	
	WebDriver driver;
	
	public ServiceModify(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Settings")
	WebElement settings;
	
	@FindBy(linkText="Service")
	WebElement service;
	
	@FindBy(xpath="//input[@placeholder='Search']")//Add crowdfund
	WebElement search;
	
	@FindBy(xpath="//div[@class='checkBoxRadio_main rc-mandatory']//span[@class='checkmark']")
	WebElement radiobtn1;
	
	@FindBy(xpath="//div[contains(@class,'btn-md float-right')]")
	WebElement modify;

	
	@FindBy(xpath="(//span[contains(@class,'checkmark')])[3]")
	WebElement cdrno;
	
	@FindBy(xpath="(//span[contains(@class,'checkmark')])[2]")
	WebElement cdryes;
	
	@FindBy(xpath="(//span[contains(@class,'checkmark')])[5]")
	WebElement smsno;
	
	@FindBy(xpath="(//span[contains(@class,'checkmark')])[4]")
	WebElement smsyes;
	
	public void servicemod(String num1) throws InterruptedException
	{
		Thread.sleep(3000);
		settings.click();
		service.click();
		Thread.sleep(3000);
		search.sendKeys(num1);
		
	}
	
	public void modify() throws InterruptedException
	{
		
		radiobtn1.click();
		modify.click();
		cdrno.click();
		Thread.sleep(3000);
		cdryes.click();
		Thread.sleep(3000);
		smsno.click();
		Thread.sleep(3000);
		smsyes.click();
		
	}
	public void scroll()
	{	
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		jse.executeScript("arguments[0].scrollIntoView();", element);
		driver.findElement(By.xpath("//div[contains(text(),'Save')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'btn-md-lg float-right margin-left')][normalize-space()='Yes']")).click();
		
	}

}
