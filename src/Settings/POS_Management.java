package Settings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POS_Management {
	
WebDriver driver;
	
	public POS_Management(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[text()='Settings']")
	WebElement settings;
	
	@FindBy(xpath="//*[text()='POS Management']")
	WebElement pos;
	
	@FindBy(xpath="//span[@id='data_72529_info_button']")
	WebElement info;
	
	
	public void Pos_info() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(settings)).click();
		settings.click();
		Thread.sleep(2000);
		pos.click();
		info.click();
	}

}
