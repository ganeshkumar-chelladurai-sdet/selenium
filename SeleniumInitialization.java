package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInitialization {

	public static void main(String[] args) {
		//Declaring WebDriver and ChromeDriver - This will invoke the browser
		WebDriver driver = new ChromeDriver();
		
		//This will get into URL
		driver.get("https://rahulshettyacademy.com");
		
		//This will get the title of the site
		System.out.println(driver.getTitle());
		
		//This will get the current URL
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
