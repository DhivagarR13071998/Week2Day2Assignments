package week2day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Find Leads'][1]")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("dhivagarr98@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		WebElement firstmail= driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a"));
		String set1 = firstmail.getText();
		System.out.println(set1);
		firstmail.click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String set2= driver.getTitle();
		System.out.println(set2);
				if (set2.contains("Duplicate Lead"))
				{
					System.out.println("It is duplicate lead page");
				}
				else
					System.out.println("It is not a duplicate lead page");

		driver.findElement(By.className("smallSubmit")).click();
		WebElement firstmail2= driver.findElement(By.id("viewLead_firstName_sp"));
		String set3= firstmail2.getText();
		if(set1.contains(set3))
		{
			System.out.println(set3 + " is the duplicated lead name");
				}
		else
		{
			System.out.println("This is not the duplicated name");
		}
		

	}

}