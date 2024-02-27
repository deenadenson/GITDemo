package Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BannerUpload.Login;

public class Settings {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deena.denson\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://10.242.0.226:8191/mt_mm/channels");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//Login
		Login loginpage = new Login(driver);
		loginpage.LoginApplication("admin","Admin@123");
		
		//Service_modify
		Service_modify service =new Service_modify(driver);
		service.Service("Add Crowdfund");
		service.Modify();
		service.Scroll();
		
		//Status_code
		Status_code status = new Status_code(driver);
		status.Search("264");
		status.Edit1("Not counter");
		status.Edit2("264","Not a counter");
		
		//POS_Management
		POS_Management pos =new POS_Management(driver);
		pos.Pos_info();

	}

}
