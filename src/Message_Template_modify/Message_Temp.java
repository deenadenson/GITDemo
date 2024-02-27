package Message_Template_modify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BannerUpload.Login;

public class Message_Temp {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deena.denson\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://10.242.0.226:8191/mt_mm/channels");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Login
		Login loginpage = new Login(driver);
		loginpage.LoginApplication("admin","Admin@123");
		//Message_Modify
		Message_Modify modify = new Message_Modify(driver);
		modify.Message("1111");
		modify.Modify();
		modify.Sms_Modify("Your money wallet has been successfully credited with Rs {Amount} on {DateTime}.");
		modify.Scroll();
		modify.Fcm_Modify("Your money wallet has been successfully credited ");
		modify.Scroll1();
		

	}

}
