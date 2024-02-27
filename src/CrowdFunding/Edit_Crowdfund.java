package CrowdFunding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Edit_Crowdfund {
	

	WebDriver driver;

	public Edit_Crowdfund (WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

			
	
	@FindBy(linkText="Services")
	WebElement service ;
	
	@FindBy(linkText="Crowd Funding")
	WebElement crowd_funding;
	
	@FindBy(xpath="//span[@id='data_534_edit_button']//i[@class='fa fa-pencil']")
	WebElement edit;

	@FindBy(id="description__id")
	WebElement description;
	
	//@FindBy(xpath="//input[@id='endDate__id']")
	//WebElement end_date;
	
	//@FindBy(xpath="//div[contains(@class,'react-datepicker__day react-datepicker__day--sat react-datepicker__day--weekend react-datepicker__day--outside-month')][normalize-space()='9']")
	//WebElement date;
	
	@FindBy(xpath="//*[text()='Select...']")
	WebElement select;
	
	@FindBy(xpath="//div[@id='react-select-2-option-0']")
	WebElement option;
	
	@FindBy(id="category__id")
	WebElement category;
	
	@FindBy(id="goal__id")
	WebElement goal;
	
	@FindBy(xpath="//div[contains(@class,'btn-lg float-right margin-left')][normalize-space()='Update']")
	WebElement update_button;
	
	@FindBy(xpath="//div[contains(@class,'btn-md-lg float-right margin-left')][normalize-space()='Update']")
	WebElement confirm_button;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success_msg;


	public void Modify(String str1, String str2, String str3) throws InterruptedException {
		
		Thread.sleep(3000);
		service.click();
		crowd_funding.click();
		edit.click();
		description.clear();
		description.sendKeys(str1);
		//end_date.clear();
		//end_date.click();
		//date.click();
		category.click();
		category.clear();
		category.sendKeys(str2);
		goal.clear();
		goal.sendKeys(str3);
	}
	public void Update() throws InterruptedException
	{
		
		update_button.click();
		Thread.sleep(3000);
		confirm_button.click();
		Thread.sleep(3000);
		System.out.println("Updated CrowdFunding:" +success_msg.getText());
			
	}
}
