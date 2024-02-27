package Settlement_System_Wallets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BannerUpload.Login;

public class Settlement_Wallets {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deena.denson\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://10.242.0.226:8191/mt_mm/channels");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();


		//Login
		Login loginpage = new Login(driver);
		loginpage.LoginApplication("admin","Admin@123");
		
		//Offline_Settlement
		Offline_Settlement settlement =new Offline_Settlement (driver);
		settlement.Settle();
		
		//System_Wallets
		System_Wallets sys = new System_Wallets(driver);
		sys.Syswallet();
		sys.Scroll();

	}

}
