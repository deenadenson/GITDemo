 package Recharge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BannerUpload.Login;

public class Recharge {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deena.denson\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://10.242.0.226:8191/mt_mm/channels");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//Login
		Login loginpage = new Login(driver);
		loginpage.LoginApplication("admin","Admin@123");
		
		//Recharge_create
		Recharge_create pack = new Recharge_create(driver);
		pack.Create("MFS2052", "Airtime 52", "52", "Airtime 52");
		pack.Search("Airtime 52");
		
		//Recharge_Edit
		Recharge_Edit edit = new Recharge_Edit(driver);
		edit.Update("Airtime 46", "46", "Airtime 46", "MFS2046");
		edit.Search("Airtime 46");
		
		//Recharge_Delete
		Recharge_Delete delete =new Recharge_Delete(driver);
		delete.Delete();
		delete.Search("Airtime 46");
	}

}
