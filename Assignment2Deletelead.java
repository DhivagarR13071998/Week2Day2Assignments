package week2day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2Deletelead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Find Leads'][1]")).click();
		driver.findElement(By.xpath("//span[@class='x-tab-strip-text ' and text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("98");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		WebElement Selectfirst= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
		String set= Selectfirst.getText();
		Selectfirst.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads'][1]")).click();
		Thread.sleep(9000);
		driver.findElement(By.linkText("Name and ID")).click();
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(set);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Boolean Selectfirst1 = driver.findElement(By.xpath("//div[@id='ext-gen437']")).isDisplayed();
		System.out.println(Selectfirst1);
		String pageofrecordsPer = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']")).getText();
		System.out.println(pageofrecordsPer );
		driver.close();
		
}
	}

