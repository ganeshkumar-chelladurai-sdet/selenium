package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomationWithLocators {

	public static void main(String[] args) throws InterruptedException {
		//Declaring WebDriver and ChromeDriver - This will invoke the browser
		WebDriver driver = new ChromeDriver();
		
		//Introducing implicitlyWait to manage the delay
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//This will get into URL
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Sending keys (passing inputs) to login using findElement with id, name & className
		driver.findElement(By.id("inputUsername")).sendKeys("ganesh");
		driver.findElement(By.name("inputPassword")).sendKeys("wrongpassword");
		driver.findElement(By.className("signInBtn")).click();
		
		//Thread.sleep(3000);
		//Getting error text using getText
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Absolute cssSelector & xpath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("ganesh");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ganesh@test.com");
		
		//using parent-child method in xpath & cssSelector
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("ganesh@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());		
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		
		//using * & contains
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("ganesh");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
		
		//driver.close();
	}

}
