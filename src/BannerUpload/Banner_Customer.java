package BannerUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Banner_Customer {
	
	WebDriver driver;
	
	public Banner_Customer(WebDriver driver) 
	{						//constructor
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Settings']")
	WebElement banner1;
	
	@FindBy(xpath="//*[text()='Banner Upload']")
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
	
	@FindBy(xpath="//div[contains(text(),'Yes')]")
	WebElement confirm;
	
	@FindBy(css="input[type='file']")
	WebElement fileupload;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success;
	
	@FindBy(xpath="//div[contains(text(),'Add New')]")
	WebElement element;
	
	public void Banner_cust()
	{
		banner1.click();
		banner2.click();
		c11.click();
		c21.click();
		c31.click();
		
		
	}
	public void ScrollDown() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		Thread.sleep(3000);
	}
	public void Fileupload()
	{
		String filepath= ("C:\\Users\\deena.denson\\Documents\\Demo\\datapack.jpg");
		fileupload.sendKeys(filepath);
	
	}
	public void Upload(String data1,String data2) throws InterruptedException
	{
		Thread.sleep(2000);
		c41.click();
		feature.click();
		content1.sendKeys(data1);
		content2.sendKeys(data2);
		Thread.sleep(2000);
		upload.click();
		Thread.sleep(3000);
		confirm.click();
		Thread.sleep(3000);
		System.out.println("Banner Uploaded to Customer:" +success.getText());
		
		
	}
	
	

}
