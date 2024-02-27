package Recharge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Recharge_Delete {
	
WebDriver driver;
	
	public Recharge_Delete(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//*[text()='Settings']")
	WebElement settings;
	
	@FindBy(xpath="//*[text()='Recharge Packs']")
	WebElement recharge;
	
	@FindBy(xpath="//i[@class='fa fa-trash']")
	WebElement delete;
	
	@FindBy(xpath="//i[@class='fa fa-filter']")
	WebElement select1;
	
	
	@FindBy(xpath="//input[@id='searchPackName__id']")
	WebElement searchpack;
	
	@FindBy(xpath="//div[normalize-space()='Search']")
	WebElement search;
	
	@FindBy(xpath="//div[normalize-space()='Delete']")
	WebElement remove;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success;
	

	public void Delete() throws InterruptedException {

		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		remove.click();
		Thread.sleep(3000);
		System.out.println("Deleted Recharge pack:" +success.getText());
		
	}
	public void Search(String str) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(settings)).click();
		settings.click();
		recharge.click();
		Thread.sleep(3000);
		select1.click();
		Thread.sleep(3000);
		searchpack.sendKeys(str);
		Thread.sleep(3000);
		search.click();

		
	}
	

}
