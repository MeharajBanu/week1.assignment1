package Assignment.week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws Throwable {

		/*
		 * Assignment:3
==================================================
SalesForce:
// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL 
           https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Fill in all the text boxes
// Step 7: Handle all the dropdowns
// Step 8: Click the check box
// Step 9: Close the browser
		 *Note: No need click Start my freeTrial
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='UserFirstName']"));
		firstname.sendKeys("meharaj");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='UserLastName']"));
		lastname.sendKeys("banu");
		WebElement mail = driver.findElement(By.xpath("//input[@name='UserEmail']"));
		mail.sendKeys("meharajbanu@gmail.com");
		WebElement companyname = driver.findElement(By.xpath("//input[@name='CompanyName']	"));
		companyname.sendKeys("virtusa");
		WebElement phoneno = driver.findElement(By.xpath("//input[@name='UserPhone']"));
		phoneno.sendKeys("123456789");
		WebElement title1 = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select jobtitle = new Select(title1);
		jobtitle.selectByIndex(7);
		WebElement employee1 = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select emp = new Select(employee1);
		emp.selectByIndex(4);
		WebElement country1 = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select country = new Select (country1);
		country.selectByValue("India");
		Thread.sleep(2000);
		WebElement agree = driver.findElement(By.xpath("//input[@type='checkbox']"));
		agree.click();
	}

}
