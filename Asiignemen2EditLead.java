package week2day1assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Asiignemen2EditLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//a[text()='Find Leads'][1]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("dhivagar");
		WebElement firstone= driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a"));
		String set1 = firstone.getText();
		System.out.println(set1);
		firstone.click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Companyname");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.close();
	}

}
