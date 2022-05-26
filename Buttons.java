//$Id$
package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {


		// Setting Up Chromedriver

		WebDriverManager.chromedriver().setup();

		//Opening Chrome

		ChromeDriver driver = new ChromeDriver();

		//Maximizing the Browser window

		driver.manage().window().maximize();

		// Step 1 - Opening the given URL

		driver.get("http://www.leafground.com/pages/Button.html");

		// Step 2 - Click button to travel home page

		driver.findElement(By.id("home")).click();
		driver.findElement(By.linkText("Button")).click();


		// Step 3 - Find position of button (x,y)

		WebElement position = driver.findElement(By.id("position"));
		System.out.println("Position of the button is : "+position.getLocation());

		// Step 4 - Color of the button

		WebElement color = driver.findElement(By.id("color"));
		String colour = color.getCssValue("background-color");
		System.out.println("Color of the button is : "+colour);

		// Step 5 - Height and Width of the button

		WebElement size = driver.findElement(By.id("size"));

		System.out.println("Height of the button is "+size.getSize().getHeight());
		System.out.println("Width of the button is "+size.getSize().getWidth());

		driver.close();

	}

}
