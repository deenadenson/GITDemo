package Report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report_360 {
	
WebDriver driver;
	
	public Report_360(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Reports']")
	WebElement report;
	
	@FindBy(xpath="//a[normalize-space()='360° Event Report']")
	WebElement report1;
	
	@FindBy(xpath="//button[@class='btn btn-dataTable-sm-btn btn-block-c btn-sm']")
	WebElement c11;
	
	@FindBy(xpath="//input[@id='msisdn__id']")//sendkeys
	WebElement c21;
	
	@FindBy(xpath="//div[normalize-space()='Search']")
	WebElement c31;
	
	//Export
	@FindBy(xpath="//button[@class='dropdown-toggle btn btn-outline-dataTable-export-btn btn-block-c btn-sm']")
	WebElement export;
	
	@FindBy(xpath="(//button[normalize-space()='Excel'])[1]")
	WebElement excel;
	
	//notification
	@FindBy(xpath="(//div[@class='user-ico'])[1]")
	WebElement notify;
	
	@FindBy(xpath="//a[@class='btn btn-info btn-sm']")
	WebElement download;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success;
	
	
	public void View(String number1) throws InterruptedException 
	{
		report.click();
		report1.click();
		Thread.sleep(3000);
		c11.click();
		Thread.sleep(3000);
		c21.sendKeys(number1);
		Thread.sleep(3000);
		c31.click();
		
		
	}
	public void Export() throws InterruptedException
	{
		export.click();
		excel.click();
		Thread.sleep(5000);
		notify.click();
		System.out.println("Notification:" +success.getText());
		
	}
	
	public void Download() 
	{
		
		download.click();
		System.out.println("Successfully Downloaded");
	}
	

}
