//$Id$
package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {


		// Setting Up Chromedriver
		WebDriverManager.chromedriver().setup();

		//Opening Chrome
		ChromeDriver driver = new ChromeDriver();

		//Maximizing the Browser window
		driver.manage().window().maximize();

		// Step 1 - Opening the given URL
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// Step 2 - Select training program using Index
		WebElement index = driver.findElement(By.id("dropdown1"));
		Select s = new Select(index);
		s.selectByIndex(1);

		// Step 3 - Select training program using Text
		WebElement text = driver.findElement(By.name("dropdown2"));
		Select t = new Select(text);
		t.selectByVisibleText("Selenium");




		// Step 3 - Select training program using Value
		WebElement value = driver.findElement(By.id("dropdown3"));
		Select v = new Select(value);
		v.selectByValue("1");





		// Step 4 - Get number of drop down options
		WebElement options = driver.findElement(By.className("dropdown"));
		Select select = new Select(options);
		System.out.println("The size of the drop down is : "+select.getOptions().size());



		// Step 4 - Get number of drop down options
		WebElement send = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		send.sendKeys("Selenium");



		WebElement multipleselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select ms = new Select(multipleselect);
		ms.selectByVisibleText("Selenium");
		ms.selectByValue("2");



		driver.close();

	}

}
