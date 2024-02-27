package BannerUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Banner {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deena.denson\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://10.242.0.226:8191/mt_mm/channels");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Login
		Login loginpage = new Login(driver);
		loginpage.LoginApplication("admin","Admin@123");
				
		//Banner_customer
		Banner_Customer banner1 = new Banner_Customer(driver);
		banner1.Banner_cust();
		banner1.ScrollDown();
		banner1.Fileupload();
		banner1.Upload("Datapack","Datapack Banner");
		
		//Banner_Merchant
		Banner_Merchant banner2 = new Banner_Merchant(driver);
		banner2.Banner_mer();
		banner2.ScrollDown();
		banner2.Fileupload();
		banner2.Upload("Datapack","Datapack Banner");
		
		
	}


}

