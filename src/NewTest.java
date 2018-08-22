package src;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class NewTest {

	WebDriver driver;
	ChromeDriver chrome;
	InternetExplorerDriver IE;
	static final int TIMEOUT = 30;
	static final int DefaultTimeout = 60;

	@Test
	public void show() {

		driver.findElement(By.id("sign-in-icon-down")).click();
		driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Signup clicked");
	}

	@BeforeTest
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		System.out.println("Browser launched");

	}

	@AfterTest
	public void quitBrowser() {

		driver.quit();
		System.out.println("Program Ends");
	}

}
