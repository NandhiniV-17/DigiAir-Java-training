package com.digitalair.automation.toolsqawebsite.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class toosQa 
{ 
	static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"/Users/NandhiniVenkataraman/Desktop/WebDrivers/chromedriver");
		driver = new ChromeDriver();// open Browser
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/elements");// To open toolsQa website
		Thread.sleep(2000);
		
		//Textbox -> Tried all with cssSelector
		driver.findElement(By.cssSelector("div > ul > li ")).click();//click "Textbox" option
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#userName")).sendKeys("Nandhini Venkataraman");//click enter the name
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='name@example.com']"))
											.sendKeys("nandhini@example.com");// To enter the Email
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"))
							.sendKeys("Missisauga, Ontario, Canada");// To enter the Current address
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#permanentAddress"))// To enter the Permanent address
							.sendKeys("TamilNadu, India");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//To scroll down the page
        Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("//button[@id= 'submit']"));//Click the Submit button
		
		js.executeScript("arguments[0].click()", submit);
		Thread.sleep(2000);
		

		//CheckBox
		driver.findElement(By.xpath("//div/ ul/li[2]")).click();//To ckick and navigate to "Check Box"
		Thread.sleep(1000);
		driver.findElement(By.className("rct-checkbox")).click();//To click the checkbox
		Thread.sleep(1000);
		boolean display1 = driver.findElement(By.id("result")).isDisplayed();//To Display the text
		System.out.println("Is the text displayed? :"+display1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/ div/button")).click();// To click the "+" symbol to expand
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/ div/button[2]")).click();// To click the "-" symbol to expand
		Thread.sleep(2000);		
		
		//RadioButton
		driver.findElement(By.xpath("//div/ ul/li[3]")).click();//To click and navigate to "Check Box"
		Thread.sleep(1000);
		WebElement select1 = driver.findElement(By.id("yesRadio"));// To select "Yes"
		js.executeScript("arguments[0].click()", select1);
		boolean display2 = driver.findElement(By.className("text-success")).isDisplayed();//To check whether the text is displayed after selecting yes
		System.out.println("Is the text 'You have selected-Yes' displayed? :"+display2);
		Thread.sleep(2000);
		
		//WebTable
		driver.findElement(By.xpath("//div/ ul/li[4]")).click();//To click and navigate to "WebTable"
		Thread.sleep(1000);
		driver.findElement(By.id("addNewRecordButton")).click();//To Click on Add
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nandhini");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Venkataraman");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("nandhini@text.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("12");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("QA");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("edit-record-4")).click(); // To Edit the table
		Thread.sleep(1000);
		WebElement edit = driver.findElement(By.xpath("//input[@id='age']"));
		edit.clear();// To clear the existing the data
		edit.sendKeys("00");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("delete-record-4")).click();
		Thread.sleep(2000);
		
		
		//Buttons
		driver.findElement(By.xpath("//div/ ul/li[5]")).click();//To click and navigate to "Buttons"
		Thread.sleep(1000);
		Actions act = new Actions(driver);//Instantiate the Actions class and locate the target element.
		WebElement dclick = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(dclick).perform(); //Perform the Double Click operation on the located element.
		boolean display3 = driver.findElement(By.id("doubleClickMessage")).isDisplayed();
		System.out.println("Is text 'You have done a double click' displayed? "+display3);
		
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.id("rightClickBtn")))
		.contextClick().build().perform();//To Right Click
		boolean display4 = driver.findElement(By.id("rightClickMessage")).isDisplayed();
		System.out.println("Is text 'You have done a right click' displayed? "+display4);
		
		Thread.sleep(2000);
		/*act.moveToElement(driver.findElement(By.xpath("//button[contains(@text()='Click Me')]"))).click().perform();
	
		driver.findElement(By.xpath("//button[contains(@text(), 'Click Me')]")).click();
		WebElement clickme = driver.findElement(By.xpath("//button[@text()='Click Me']")); 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", clickme);
		boolean display5 = driver.findElement(By.id("dynamicClickMessage")).isDisplayed();
		System.out.println("Is text 'You have done a dynamic click' displayed? "+display5	);*/
		
		
		//
		
		
		
		
	}

}
