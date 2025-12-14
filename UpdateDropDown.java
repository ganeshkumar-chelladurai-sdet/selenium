package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropDown {

	public static void main(String[] args) throws InterruptedException {

		//Declaring WebDriver and ChromeDriver - This will invoke the browser	
		WebDriver driver = new ChromeDriver();
		
		//This will get into URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		//This will click of dropdown WebElement
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		
		//This will click Adult + 5 times using for loop
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		Thread.sleep(1000);
		
		//This will click Child + 4 times using while loop
		int i=0;
		while(i<4) {
			driver.findElement(By.id("hrefIncChd")).click();
			i++;
		}
		Thread.sleep(1000);
		
		//This will click on done WebElement
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(1000);
		
		//This will print out After selecting Adult and Child passengers count
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
