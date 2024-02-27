package Withdraw_Money;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithdrawMerchant {

	WebDriver driver;
	
	public WithdrawMerchant(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Services")
	WebElement service1 ;
	
	@FindBy(xpath="//*[text()='Withdraw Money']")
	WebElement withdraw1;
	
	@FindBy(xpath="//div[@class='css-1hwfws3 Select__value-container Select__value-container--has-value']")
	WebElement c11;
	
	@FindBy(xpath="//*[text()='Merchant']")
	WebElement c21;
	
	@FindBy(xpath="//*[text()='Select...']")
	WebElement c31;
	
	@FindBy(xpath="//*[text()='Mobile Number']")
	WebElement c41;
	
	@FindBy(css="#mobileNum__id")
	WebElement mobileno1;
	

	@FindBy(xpath="//input[@id='amount__id']")
	WebElement amount1;
	
	@FindBy(xpath="//div[contains(text(),'Search')]")
	WebElement search1;
	
	@FindBy(xpath="//*[text()='Select...']")
	WebElement c51;
	
	@FindBy(xpath="//*[text()='Main Wallet']")
	WebElement c61;
	
	@FindBy(xpath="//div[contains(text(),'Proceed')]")
	WebElement proceed;
	
	@FindBy(xpath="//div[contains(text(),'Yes')]")
	WebElement yes;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success;
	
	@FindBy(xpath="//textarea[@id='remarks__id']")
	WebElement element;
	
	public void Withdrawmer(String number1,String number2) throws InterruptedException
	{
		service1.click();
		withdraw1.click();
		c11.click();
		c21.click();
		c31.click();
		c41.click();
		mobileno1.sendKeys(number1);
		search1.click();
		amount1.sendKeys(number2);
		c51.click();
		c61.click();
		Thread.sleep(2000);
	}
	
	public void Scroll() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		proceed.click();
		Thread.sleep(3000);
		yes.click();
		Thread.sleep(3000);
		System.out.println("Money Withdraw from Merchant:" +success.getText());
	}
	
	

}
