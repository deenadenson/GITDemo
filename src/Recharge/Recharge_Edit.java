package Recharge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Recharge_Edit {
	
WebDriver driver;
	
	public Recharge_Edit(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

			

	@FindBy(xpath="//*[text()='Settings']")
	WebElement settings;
	
	@FindBy(xpath="//*[text()='Recharge Packs']")
	WebElement recharge;
	
	@FindBy(xpath="//i[@class='fa fa-pencil']")
	WebElement c11;
	
	@FindBy(xpath="//i[@class='fa fa-filter']")
	WebElement select1;
	
	@FindBy(xpath="//input[@id='packName__id']")
	WebElement packname;
	
	@FindBy(xpath="//input[@id='packId__id']")
	WebElement packid;
	
	@FindBy(xpath="//input[@id='amount__id']")
	WebElement amount;
	
	@FindBy(xpath="//textarea[@id='remarks__id']")
	WebElement remark;
	
	
	@FindBy(xpath="//div[contains(text(),'Yes')]")
	WebElement yes;
	
	@FindBy(xpath="//input[@id='searchPackName__id']")
	WebElement searchpack;
	
	@FindBy(xpath="//div[normalize-space()='Search']")
	WebElement search;
	
	@FindBy(xpath="//div[normalize-space()='Update']")
	WebElement update;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success;
	

	public void Update(String str1,String str2,String str3,String str4) throws InterruptedException {

		Thread.sleep(3000);
		c11.click();
		packname.clear();
		packname.sendKeys(str1);
		amount.clear();
		amount.sendKeys(str2);
		remark.clear();
		remark.sendKeys(str3);
		packid.clear();
		packid.sendKeys(str4);
		Thread.sleep(3000);
		update.click();
		yes.click();
		Thread.sleep(3000);
		System.out.println("Updated Recharge pack:" +success.getText());
		Thread.sleep(3000);
	}
	public void Search(String str) throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOf(settings)).click();
		Thread.sleep(3000);
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
