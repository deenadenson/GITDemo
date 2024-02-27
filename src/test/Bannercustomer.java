package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bannercustomer {
	
WebDriver driver;
	
	public Bannercustomer(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//i[@class='fa fa fa-credit-card-alt menu-icon'])[2]")
	WebElement banner1;
	
	@FindBy(linkText="Banner")
	WebElement banner2;
	
	@FindBy(xpath="//div[@class='css-151xaom-placeholder Select__placeholder']")
	WebElement c11;
	
	@FindBy(xpath="//div[@class='css-dpec0i-option Select__option Select__option--is-focused']")
	WebElement c21;
	
	@FindBy(xpath="(//i[@class='fa fa fa-credit-card-alt menu-icon'])[2]")
	WebElement c31;
	
	@FindBy(xpath="//div[contains(text(),'Regular')]")
	WebElement c41;
	
	@FindBy(css="#react-select-3-option-2")
	WebElement feature;
	
	@FindBy(xpath="//input[@id='contentFileName__id']")
	WebElement content1;
	
	@FindBy(xpath="//input[@id='contentFileName2__id']")
	WebElement content2;
	
	@FindBy(xpath="//div[normalize-space()='Upload']")
	WebElement upload;
	
			
	public void bannercus()
	{
		banner1.click();
		banner2.click();
		c11.click();
		c21.click();
		c31.click();
		
		
	}
	public void fileupload()
	{
		String filepath= ("C:\\Users\\deena.denson\\Documents\\Demo\\datapack.jpg");
		driver.findElement(By.cssSelector("input[type='file']")).sendKeys(filepath);
	}
	
	public void data()
	{
		
		
		
	}
	
	public void scroll() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Add New')]"));
		jse.executeScript("arguments[0].scrollIntoView();", element);
		driver.findElement(By.xpath("//div[contains(text(),'Add New')]")).click();
		
	}



}
