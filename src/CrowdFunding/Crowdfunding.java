package CrowdFunding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BannerUpload.Login;

public class Crowdfunding {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deena.denson\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://10.242.0.226:8191/mt_mm/channels");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//Login
		Login loginpage = new Login(driver);
		loginpage.LoginApplication("admin","Admin@123");
		
		//Create_Crowdfund
		Create_Crowdfund fund =new Create_Crowdfund(driver);
		fund.Create("Charity", "Charity Fund", "2023-10-05", "Trust", "1000");
		fund.Fileupload();
		
		//Edit_Crowdfund
		Edit_Crowdfund edit =new Edit_Crowdfund(driver);
		edit.Modify("Charity Fund","Trust fund", "2000");
		edit.Update();
		

	}
}
