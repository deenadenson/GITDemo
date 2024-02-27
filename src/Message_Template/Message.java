package Message_Template;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import BannerUpload.Login;
import test.MessageTemplate;
import test.MessageTemplateDelete;

public class Message {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deena.denson\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://10.242.0.226:8191/mt_mm/channels");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Login
		Login loginpage = new Login(driver);
		loginpage.LoginApplication("admin","Admin@123");
		
		//Create_Message_Template
		Create_Message_Template msgtemplates =new Create_Message_Template(driver);
		msgtemplates.Message("1110");
		msgtemplates.Sms("Your my.t money wallet has been successfully credited with Rs {Amount} on {DateTime}.");
		msgtemplates.Scroll();
		msgtemplates.Fcmmessage("Adjustment","Your my.t money wallet has been successfully credited with Rs {Amount} on {DateTime}.");
		
		
		//DeleteMessageTemplate
		Delete_Message_Template msgdeleted = new Delete_Message_Template(driver);
		msgdeleted.Message("1110");
		msgdeleted.Modify();
		msgdeleted.Scroll();
		msgdeleted.Smsdelete();
		msgdeleted.Delete("1110");
		msgdeleted.Scroll1();
	}


	}


