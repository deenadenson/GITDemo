

package Test_ststus_code;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Status_code_edit {
	
WebDriver driver;
	
	public Status_code_edit(WebDriver driver) 
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
	
	@FindBy(css="#react-select-2-option-0")
	WebElement option1;
	
	@FindBy(xpath="//div[normalize-space()='Update']")
	WebElement update;
	
	@FindBy(xpath="//div[contains(text(),'Yes')]")
	WebElement yes;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body toastify_body_class']")
	WebElement success;
	

	

	public void Edit2(String str1, String str2) throws InterruptedException {
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
		option1.click();
		update.click();
		Thread.sleep(3000);
		yes.click();
		Thread.sleep(3000);
		System.out.println("Status Code:" +success.getText());
		Thread.sleep(3000);
		
	}
	


}
