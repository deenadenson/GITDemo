package GUI_Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Add_Money.AddmoneyBiller;
import Add_Money.AddmoneyCustomer;
import Add_Money.AddmoneyMerchant;
import BannerUpload.Banner_Customer;
import BannerUpload.Banner_Merchant;
import BannerUpload.Login;
import Message_Template_modify.Message_Modify;
import Withdraw_Money.WithdrawBiller;
import Withdraw_Money.WithdrawCustomer;
import Withdraw_Money.WithdrawMerchant;

public class Full_GUI {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deena.denson\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//Invoking web browser
		driver.get("http://10.242.0.226:8191/mt_mm/channels");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		driver.manage().window().maximize();

		//Login
		Login loginpage = new Login(driver);
		loginpage.LoginApplication("admin","admin123");
		
		//AddMoney_Customer
		AddmoneyCustomer admoney =new AddmoneyCustomer(driver);
		admoney.Addcustomer("56789123","1000");
		admoney.Scroll();
		
		//AddMoney_Biller
		AddmoneyBiller admoneybiller =new AddmoneyBiller(driver);
		admoneybiller.Addbiller("55234261","1000");
		admoneybiller.Scroll();
			
		//AddMoney_Merchant
		AddmoneyMerchant admoneymerchant =new AddmoneyMerchant(driver);
		admoneymerchant.Addmerchant("50909091","1000");
		admoneymerchant.Scroll();
		
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
