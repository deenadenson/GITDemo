package CrowdFunding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Crowdfund {
	
	WebDriver driver;

	public Create_Crowdfund (WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(linkText="Services")
	WebElement service ;
	
	@FindBy(linkText="Crowd Funding")
	WebElement crowd_funding;
	
	@FindBy(xpath="//div[contains(@class,'btn-md float-left margin-right')]")
	WebElement create;
	
	@FindBy(id="name__id")
	WebElement name;
	
	@FindBy(id="description__id")
	WebElement description;
	
	@FindBy(xpath="//input[@id='startDate__id']")
	WebElement start_date;
	
	@FindBy(xpath="//input[@id='endDate__id']")
	WebElement end_date;
	
	@FindBy(xpath="//div[contains(@class,'react-datepicker__day react-datepicker__day--sat react-datepicker__day--weekend react-datepicker__day--outside-month')][normalize-space()='11']")
	WebElement date;
	
	
	@FindBy(xpath="//*[text()='Select...']")
	WebElement select;
	
	@FindBy(xpath="//div[@id='react-select-2-option-0']")
	WebElement option;
	
	@FindBy(id="category__id")
	WebElement category;
	
	@FindBy(id="goal__id")
	WebElement goal;
	
	@FindBy(css="input[type='file']")
	WebElement upload;
	
	@FindBy(xpath="//div[contains(@class,'btn-lg float-right margin-left')][normalize-space()='Create']")
	WebElement create_button;
	
	@FindBy(xpath="//div[contains(@class,'btn-md-lg float-right margin-left')][normalize-space()='Create']")
	WebElement confirm_button;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success_msg;
	
	public void Create(String str1, String str2, String str3, String str4, String str5) {
		
		service.click();
		crowd_funding.click();
		create.click();
		name.sendKeys(str1);
		description.sendKeys(str2);
		start_date.clear();
		start_date.sendKeys(str3);
		end_date.click();
		date.click();
		select.click();
		option.click();
		category.clear();
		category.sendKeys(str4);
		goal.clear();
		goal.sendKeys(str5);
		
	}
			
	public void Fileupload() throws InterruptedException
	{
		String filepath= ("C:\\Users\\deena.denson\\Documents\\Demo\\disaster.jpg");
		upload.sendKeys(filepath);
		create_button.click();
		Thread.sleep(3000);
		confirm_button.click();
		Thread.sleep(3000);
		System.out.println("Created CrowdFunding:" +success_msg.getText());
			
	}
}
