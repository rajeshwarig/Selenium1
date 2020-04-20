package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
	}
	
	@Test
	public void Login() {
		
		driver.findElement(By.id("identifierId")).sendKeys("tselenium26");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
	}
	
	

}
