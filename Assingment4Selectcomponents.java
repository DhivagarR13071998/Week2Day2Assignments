package week2day1assignments;


import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assingment4Selectcomponents {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select diffOptions = new Select(element);
		List<WebElement> options2 = diffOptions.getOptions();
		int size = options2.size();
		System.out.println(size);
		for (int i = 0; i < options2.size(); i++) {
			Thread.sleep(2000);
			options2.get(i).click();
		
		}
		driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[1]")).click();
		driver.findElement(By.xpath("//li[@data-label='India']")).click();	
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();	
		driver.findElement(By.xpath("//li[@data-label='Tamil']")).click();
		}
	}

