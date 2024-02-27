package Settlement_System_Wallets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Offline_Settlement {
	
WebDriver driver;
	
	public Offline_Settlement(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(linkText="Services")
	WebElement service ;
	
	@FindBy(linkText="Offline Settlement")
	WebElement settle;
	
	public void Settle() throws InterruptedException
	{
		service.click();
		settle.click();
		Thread.sleep(3000);
		
	}

}
