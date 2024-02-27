package Add_Money;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import BannerUpload.Login;

public class Add_Money {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deena.denson\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//Invoking web browser
		driver.get("http://10.242.0.226:8191/mt_mm/channels");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		driver.manage().window().maximize();

		//Login
		Login loginpage = new Login(driver);
		loginpage.LoginApplication("admin","Admin@123");
		
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
	}

}
