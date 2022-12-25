package theBizioAutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BillingSection
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/NandhiniVenkataraman/Desktop/Web Drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thebizio.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='container']//a/button")).click();
		driver.findElement(By.className("form-control")).sendKeys("prod.bzo.0607@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Password@0607");
		driver.findElement(By.id("kc-login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://dashboard.thebizio.com']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		driver.findElement(By.className("profile-arrow")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://bizio-center.thebizio.com/profile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/billing']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("react-aria-2-tab-invoices")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr/td[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr/td[6]/div/button")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@href= contains'blob:https://bizio-center.thebizio.com/901cd3ea-d2a3-4925-9f24-593fce5c72b2']")).click();	
		//driver.findElement(By.partialLinkText("blob:https://bizio-center.thebizio.com/"));
		//driver.findElement(By.xpath("//a[contains(text(),'.pdf')]")).click();
		//driver.findElement(By.xpath("//div[@class='sc-kZLDfD.iMJGIB.offcanvas-title.h5']")).click();
		//driver.findElement(By.xpath("//div/svg")).click();
		driver.findElement(By.xpath("//div[contains(@class, 'sc-kZLDfD')]")).click();
	}

}
