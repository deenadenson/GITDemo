package Withdraw_Money;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BannerUpload.Login;

public class Withdraw_Money {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deena.denson\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://10.242.0.226:8191/mt_mm/channels");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Login
		Login loginpage = new Login(driver);
		loginpage.LoginApplication("admin","Admin@123");
		
		//WithdrawMoney_Customer
		WithdrawCustomer withdrawmoney =new WithdrawCustomer(driver);
		withdrawmoney.Withdrawcustom("56789123","1000");
		withdrawmoney.Scroll();		
				
		//WithdrawMoney_Biller
		WithdrawBiller withmoneybiller =new WithdrawBiller(driver);
		withmoneybiller.Withdrawbill("55234261","1000");
		withmoneybiller.Scroll();				
				
		//WithdrawMoney_Biller
		WithdrawMerchant withmoneymer =new WithdrawMerchant(driver);
		withmoneymer.Withdrawmer("50909091","1000");
		withmoneymer.Scroll();	
	
	}

}
