//$Id$
package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {


		// Setting Up Chromedriver
		WebDriverManager.chromedriver().setup();

		//Opening Chrome
		ChromeDriver driver = new ChromeDriver();

		//Maximizing the Browser window
		driver.manage().window().maximize();

		// Step 1 - Opening the given URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Step 2 - Entering Username and Password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Step 3 - Clicking on Login locator using ClassName
		driver.findElement(By.className("decorativeSubmit")).click();

		// Step 4 - Clicking on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Step 5 - Clicking on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		// Step 6 - Creating Lead
		driver.findElement(By.linkText("Create Lead")).click();

		// Step 7 - Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VCORPITCS");

		// Step 8 - Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajeshwaran");

		// Step 9 - Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Angamuthu");

		// Step 10 - Enter FirstName Local Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Angamuthu");

		// Step 11 - Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Information Technology");

		// Step 12 - Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is a lead created by DemoSalesManager for the lead named Rajeshwaran Angamuthu");

		// Step 13 - Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.name("primaryEmail")).sendKeys("varanrajesh@gmail.com");

		// Step 14 - Select State/Province as NewYork Using Visible Text
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s = new Select(state);
		s.selectByVisibleText("New York");

		// Step 15 - Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		
		// Step 16 - Click on Edit Button
		driver.findElement(By.linkText("Edit")).click();
		
		// Step 17 - Click on Create Button
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		// Step 18 - Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Note field in EditForm");

		// Step 19 - Click on Update button
		driver.findElement(By.className("smallSubmit")).click();
		
		// Step 20 - Get the title of the page
		String title = driver.getTitle();
		System.out.println("The Title of the Resulting page is : "+title);
		
		driver.close();

	}

}
