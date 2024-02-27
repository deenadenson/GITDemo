package Test_ststus_code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BannerUpload.Login;
import Settings.Status_code;

public class Edit {

		
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\deena.denson\\Documents\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://10.242.0.226:8191/mt_mm/channels");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//Login
			Login loginpage = new Login(driver);
			loginpage.LoginApplication("admin","Admin@123");
			
			//Status_code
			Status_code_edit status = new Status_code_edit(driver);
			status.Edit2("264","Not a counter");

	}

}
