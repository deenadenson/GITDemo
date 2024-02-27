package Settlement_System_Wallets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class System_Wallets {
	
WebDriver driver;
	
	public System_Wallets(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="(//i[@class='fa fa fa-credit-card-alt menu-icon'])[1]")
	WebElement c11;
	
	@FindBy(xpath="(//li[@class='list-group-item'])[23]")
	WebElement c21;
	
	
	@FindBy(xpath="(//li[@class='list-group-item'])[24]")
	WebElement c31;
	
	@FindBy(xpath="(//li[@class='list-group-item'])[25]")
	WebElement c41;
	
	@FindBy(xpath="//*[text()='System Airtime Stock']")
	WebElement stock;
	
	
	public void Syswallet() throws InterruptedException
	{
	
		c11.click();
		Thread.sleep(3000);
		c21.click();
		Thread.sleep(3000);
		c31.click();
		Thread.sleep(3000);
		c41.click();
		
		
	}
	public void Scroll() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", stock);
		
	}
}
