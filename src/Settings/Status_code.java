package Settings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Status_code {

	
WebDriver driver;
	
	public Status_code(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath="//*[text()='Settings']")
	WebElement settings;
	
	@FindBy(xpath="//*[text()='Status Code']")
	WebElement status;
	
	@FindBy(xpath="//input[@placeholder='Search']")//264
	WebElement search;
	
	@FindBy(xpath="//i[@class='fa fa-pencil']")
	WebElement c1;
	
	@FindBy(xpath="//input[@id='statusDesc__id']")//Not a counter
	WebElement description;

	@FindBy(xpath="//div[@class='css-16pqwjk-indicatorContainer Select__indicator Select__dropdown-indicator']")
	WebElement dropdown;
	
	@FindBy(css="#react-select-2-option-1")
	WebElement option1;

	@FindBy(css="#react-select-3-option-0")
	WebElement option2;
	
	@FindBy(xpath="//div[normalize-space()='Update']")
	WebElement update;
	
	@FindBy(xpath="//div[contains(text(),'Yes')]")
	WebElement yes;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success;
	
	public void Search(String num1) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(settings)).click();
		status.click();
		Thread.sleep(3000);
		search.sendKeys(num1);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
	}
	
	public void Edit1(String str1) throws InterruptedException
	{
		
		c1.click();
		description.clear();
		description.sendKeys(str1);
		dropdown.click();
		option1.click();
		Thread.sleep(2000);
		update.click();
		yes.click();
	}
	public void Edit2(String str1,String str2) throws InterruptedException
	{
		Thread.sleep(3000);
		settings.click();
		status.click();
		Thread.sleep(3000);
		search.clear();
		search.sendKeys(str1);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		c1.click();
		description.clear();
		description.sendKeys(str2);
		dropdown.click();
		option2.click();
		update.click();
		yes.click();
		Thread.sleep(3000);
		System.out.println("Status Code:" +success.getText());
		Thread.sleep(3000);
	}
	

}
