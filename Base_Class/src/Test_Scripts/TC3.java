package Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base_Package.Base_Class;

public class TC3 extends Base_Class
{
	
	@Test
	public void Method2() throws InterruptedException
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
		
		//Thread.sleep(5000);
		//WebElement Like=driver.findElement(By.xpath("//button[contains(@aria-label,'like this video along with')]"));
		//Like.click();
		Thread.sleep(5000);
		WebElement Mute=driver.findElement(By.xpath("//button[contains(@title,'Mute')]"));
		Mute.click();
		
}
}