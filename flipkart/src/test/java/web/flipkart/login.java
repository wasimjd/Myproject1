package web.flipkart;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;

	@Test
	public void Alogin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("https://www.flipkart.com");
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@class='LC20lb MBeuO DKV0Md']")).click();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\eclipse-workspace\\screenshot\\screenshot1.png"));
		driver.close();

	}

	@Test
	public void UP() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.cssSelector("*[class='_2IX_2- VJZDxU']")).sendKeys("8936036688");
		driver.findElement(By.cssSelector("*[type='password']")).sendKeys("Atifadil1@");
		driver.findElement(By.cssSelector("*[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\eclipse-workspace\\screenshot\\screenshot2.png"));
		driver.close();

	}
}
