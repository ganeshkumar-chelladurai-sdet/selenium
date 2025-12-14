package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownTest {
	
	public static void main(String[] arg) {
		
		//Declaring WebDriver and ChromeDriver - This will invoke the browser		
		WebDriver driver = new ChromeDriver();
		
		//This will get into URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//This will get staticDropDown WebElement
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		//Assigning staticDropDown to Select
		Select dropdown = new Select(staticDropDown);
		
		//This will select by index
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//This will select by visible text
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//This will select by value
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
	}
}