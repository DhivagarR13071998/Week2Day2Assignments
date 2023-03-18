package week2day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Asiignment2CreateContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Dhivagar");
		driver.findElement(By.id("lastNameField")).sendKeys("Ravid");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Dhivagar");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ravid");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Department");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Department");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("email@gmail.com");
		WebElement general = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")); 
		new Select(general).selectByVisibleText("84057"); 
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Important");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title=driver.getTitle();
		System.out.println(title);

	}

}
