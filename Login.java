package ecourierz;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	@Test
	public void ecourierzLogin() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait expWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://qa.ecourierz.com/beta/user/dashboard");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("devops@ecourierz.com");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//mat-icon[@role='img'])[2]")).click();
		
	//WebElement receiverName = driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[2]"));
		//expWait.until(ExpectedConditions.textToBePresentInElement(receiverName,"Receiver Name"));
		//receiverName.sendKeys("Shanu");
		driver.findElement(By.id("mat-input-0")).sendKeys("Shanu");
		driver.findElement(By.id("mat-input-1")).sendKeys("Address line 1");
		driver.findElement(By.id("mat-input-2")).sendKeys("Address line 2");
		driver.findElement(By.id("mat-input-3")).sendKeys("Address line 3");
		driver.findElement(By.id("mat-input-11")).sendKeys("560006");
		//driver.findElement(By.id("mat-input-4")).sendKeys("Bangalore");
		//driver.findElement(By.id("mat-input-5")).sendKeys("KA");
		driver.findElement(By.id("mat-input-6")).sendKeys("abcds@gmail.com");
		driver.findElement(By.id("mat-input-7")).sendKeys("9999999999");
		driver.findElement(By.id("mat-input-8")).sendKeys("bag");
		driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[2]")).click();
		driver.findElement(By.id("mat-input-12")).sendKeys("20");
		driver.findElement(By.id("mat-input-13")).sendKeys("5");
		driver.findElement(By.id("mat-input-14")).sendKeys("6");
		driver.findElement(By.id("mat-input-15")).sendKeys("15");
		driver.findElement(By.id("mat-input-16")).sendKeys("100");
		driver.findElement(By.id("mat-input-9")).sendKeys("456969");
		driver.findElement(By.id("mat-input-10")).sendKeys("523654");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	
}
