package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	
	WebDriver driver;
	
	public Landingpage(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	
	}

	@FindBy(className="form-control")
	WebElement username ;
	
	@FindBy(id="pwd_custom_ip")
	WebElement password;
	
	@FindBy(css="button[type='submit']")
	WebElement button;
	
	public void loginApplication(String usern,String paswrd)
	{
		username.sendKeys(usern);
		password.sendKeys(paswrd);
		button.click();
		
	}
	
	
	
}
