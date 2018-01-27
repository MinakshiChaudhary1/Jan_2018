package Base_Package;//Browser Launch Only

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base_Class {
	public ChromeDriver driver;
	@BeforeMethod
	public void Method1() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	}

		public void Method3()
		{
			driver.close();
		}
}
