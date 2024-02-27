package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddmoneyCustomer {
	
	
	WebDriver driver;
	
	public AddmoneyCustomer(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Services")
	WebElement service ;
	
	@FindBy(linkText="Add Money")
	WebElement addmoney;
	
	@FindBy(xpath="//div[@class='css-1hwfws3 Select__value-container Select__value-container--has-value']")
	WebElement c1;
	
	@FindBy(xpath="//*[text()='Customer']")
	WebElement c2;
	
	@FindBy(xpath="//*[text()='Select...']")
	WebElement c3;
	
	@FindBy(xpath="//*[text()='Mobile Number']")
	WebElement c4;
	
	@FindBy(css="#mobileNum__id")
	WebElement mobileno;

	@FindBy(xpath="//div[contains(text(),'Search')]")
	WebElement search;
	
	@FindBy(xpath="//input[@id='amount__id']")
	WebElement amount;
	
	@FindBy(xpath="//*[text()='Select...']")
	WebElement c5;
	
	@FindBy(xpath="//*[text()='Main Wallet']")
	WebElement c6;
	
	
	
			
	
	public void addcustomer(String number1,String number2 )
	{
		service.click();
		addmoney.click();
		c1.click();
		c2.click();
		c3.click();
		c4.click();
		mobileno.sendKeys(number1);
		search.click();
		amount.sendKeys(number2);
		c5.click();
		c6.click();
		
	}
	
	public void scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//textarea[@id='remarks__id']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.findElement(By.xpath("//div[contains(text(),'Proceed')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Yes')]")).click();
		//System.out.println("updated:" +driver.findElement(By.xpath("//div[contains(text(),'Yes')]")).getText());
		
	}

	
}
