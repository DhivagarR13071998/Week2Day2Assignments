package week2day1assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment1Createaccount {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Dhivagar");
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[2]")).sendKeys("ravi");
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[3]")).sendKeys("email@gail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Dh!v@g@r130798");
		WebElement Month=driver.findElement(By.id("month"));
		Select love=new Select(Month);
		love.selectByValue("7");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Year=driver.findElement(By.id("year"));
		Select lock=new Select(Year);
		lock.selectByVisibleText("1998");
		WebElement birthdayday = driver.findElement(By.xpath("//select[@title='Day']")); 
		new Select(birthdayday).selectByVisibleText("13"); 
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.close();
	}

}
