package Add_Money;

import java.time.Duration;

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
	{
		
		this.driver = driver;//distinguish global and local variable driver
		PageFactory.initElements(driver,this);//intializing all elements
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
	
	@FindBy(xpath="//div[contains(text(),'Yes')]")
	WebElement yes;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success;
	
	@FindBy(xpath="//textarea[@id='remarks__id']")
	WebElement element;
	
	
	public void Addcustomer(String number1,String number2 ) throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		service.click();
		addmoney.click();
		c1.click();
		c2.click();
		c3.click();
		c4.click();
		wait.until(ExpectedConditions.visibilityOf(mobileno)).sendKeys(number1);
		search.click();
		wait.until(ExpectedConditions.visibilityOf(amount)).sendKeys(number2);
		c5.click();
		wait.until(ExpectedConditions.visibilityOf(c6)).click();
		Thread.sleep(2000);
		
		
	}
	
	public void Scroll() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Proceed')]"))).click();
		Thread.sleep(3000);
		yes.click();
		Thread.sleep(3000);
		System.out.println("Money Added to Customer:" +success.getText());
		Thread.sleep(5000);
	}

}
