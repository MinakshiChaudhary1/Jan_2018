package Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base_Package.Base_Class;

public class TC4 extends Base_Class
{
	
	@Test
	public void Method4() throws InterruptedException
	{
		WebElement signin=driver.findElement(By.id("text"));
		signin.click();
	
		WebElement Email=driver.findElement(By.id("identifierId"));
		Email.sendKeys("meenakshi.absas14@gmail.com");
		WebElement Next=driver.findElement(By.id("identifierNext"));
		Next.click();
		Thread.sleep(5000);
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("absas@123");
	
		WebElement Next2=driver.findElement(By.id("passwordNext"));
		Next2.click();
		
       Thread.sleep(5000);
		WebElement Video=driver.findElement(By.id("video-title"));
		Video.click();
		
		Thread.sleep(5000);
		WebElement Createchannel=driver.findElement(By.cssSelector("a[is='yt-endpoint']"));// create channel
		Createchannel.click();
		
		//Thread.sleep(5000);
		//WebElement Subscribe=driver.findElement(By.xpath("//*[@id='subscribe-button']/ytd-subscribe-button-renderer"));
		//WebElement Subscribe=driver.findElement(By.xpath("//*[@id='subscribe-button']"));
		//Subscribe.click();
}}
