package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfflineSettlement {
	
	WebDriver driver;
	
	public OfflineSettlement(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(linkText="Services")
	WebElement service ;
	
	@FindBy(linkText="Offline Settlement")
	WebElement settle;
	
	public void settle()
	{
		service.click();
		settle.click();
		
		
	}
	
	
}
