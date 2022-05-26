//$Id$
package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) throws InterruptedException {


		// Setting Up Chromedriver

		WebDriverManager.chromedriver().setup();

		//Opening Chrome

		ChromeDriver driver = new ChromeDriver();

		//Maximizing the Browser window

		driver.manage().window().maximize();

		// Step 1 - Opening the given URL

		driver.get("http://www.leafground.com/pages/Edit.html");

		// Step 2 - Enter Email Address

		driver.findElement(By.id("email")).sendKeys("varanrajesh@gmail.com");


		// Step 3 - Append a text and press keyboard tab

		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys(" NewText");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys(Keys.TAB);

		// Step 4 - Get Default Text Entered

		WebElement defaulttext = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String DefText = defaulttext.getAttribute("value");
		defaulttext.clear();
		defaulttext.sendKeys(DefText);

		// Step 5 - Clear the field

		WebElement clearfield = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearfield.clear();

		// Step 6 - check If the field is Disabled

		WebElement IsDisabled = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		if(IsDisabled.isEnabled() == false)
		{
			System.out.println("The Field is Disabled");
		}
		else
		{
			System.out.println("The Field is Enbaled");

		}



		driver.close();

	}

}
