package Recharge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Recharge_create {
	
WebDriver driver;
	
	public Recharge_create(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[text()='Settings']")
	WebElement settings;
	
	@FindBy(xpath="//*[text()='Recharge Packs']")
	WebElement recharge;
	
	@FindBy(xpath="//div[contains(@class,'btn-md float-left margin-right')]")
	WebElement c11;
	
	@FindBy(xpath="//input[@id='packId__id']")//sendkeys
	WebElement packid;
	
	@FindBy(xpath="//input[@id='packName__id']")
	WebElement packname;
	
	@FindBy(xpath="//div[@class='css-1hwfws3 Select__value-container']")
	WebElement select;
	
	@FindBy(xpath="//div[@id='react-select-2-option-0']")
	WebElement option;
	
	@FindBy(xpath="//input[@id='amount__id']")
	WebElement amount;
	
	@FindBy(xpath="//textarea[@id='remarks__id']")
	WebElement remark;
	
	@FindBy(xpath="//div[contains(@class,'btn-lg float-right margin-left')][normalize-space()='Create']")
	WebElement create;
	
	@FindBy(xpath="//div[contains(text(),'Yes')]")
	WebElement yes;
	
	@FindBy(xpath="//i[@class='fa fa-filter']")
	WebElement select1;
	
	@FindBy(xpath="//input[@id='searchPackName__id']")
	WebElement searchpack;
	
	@FindBy(xpath="//div[normalize-space()='Search']")
	WebElement search;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success;

	public void Create(String str1,String str2,String str3,String str4) throws InterruptedException {

		settings.click();
		recharge.click();
		Thread.sleep(3000);
		c11.click();
		Thread.sleep(3000);
		packid.sendKeys(str1);
		packname.sendKeys(str2);
		select.click();
		option.click();
		amount.sendKeys(str3);
		remark.sendKeys(str4);
		create.click();
		yes.click();
		Thread.sleep(3000);
		System.out.println("Created new Recharge pack:" +success.getText());
		Thread.sleep(3000);
	}
	public void Search(String str) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(settings)).click();
	//	settings.click();
		recharge.click();
		Thread.sleep(3000);
		select1.click();
		Thread.sleep(3000);
		searchpack.sendKeys(str);
		Thread.sleep(3000);
		search.click();

		
	}
	
	

	
	

}
