package BannerUpload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
WebDriver driver;
	
	public Login(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	
	}

	@FindBy(xpath="//input[@maxlength='40']")
	WebElement username ;
	
	@FindBy(id="pwd_custom_ip")
	WebElement password;
	
	@FindBy(css="button[type='submit']")
	WebElement button;
	
	public void LoginApplication(String usern,String paswrd) throws InterruptedException
	{
		Thread.sleep(2000);
		username.sendKeys(usern);
		password.sendKeys(paswrd);
		button.click();
		Thread.sleep(3000);
		
	}
	

}
