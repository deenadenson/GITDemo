package test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login {

public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deena.denson\\Downloads\\selenium_java_downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://10.242.0.226:8191/mt_mm/channels");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Login
		Landingpage landpage = new Landingpage(driver);
		landpage.loginApplication("admin","admin123");
		
		Thread.sleep(5000);
		
		//MessageTemplate 
		MessageTemplate msgtemplate = new MessageTemplate(driver);
		msgtemplate.message("1110");
		msgtemplate.sms("Your my.t money wallet has been successfully credited with Rs {Amount} on {DateTime}.");
		msgtemplate.scroll();
		msgtemplate.fcmmessage("Adjustment","Your my.t money wallet has been successfully credited with Rs {Amount} on {DateTime}.");
		
				
		//DeleteMessageTemplate
		MessageTemplateDelete msgdelete = new MessageTemplateDelete(driver);
		msgdelete.message("1110");
		msgdelete.modify();
		msgdelete.scroll();
		msgdelete.smsdelete();
		msgdelete.delete("1110");
		msgdelete.scroll1();
		
		//ServiceModify
		ServiceModify service = new ServiceModify(driver);
		service.servicemod("Add Crowdfund");
		service.modify();
		service.scroll();
		
		
}

}


