package web.flipkart;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class purchase {
	WebDriver driver;

	@Test
	public void mobile() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.cssSelector("*[class='_2IX_2- VJZDxU']")).sendKeys("8936036688");
		driver.findElement(By.cssSelector("*[type='password']")).sendKeys("Atifadil1@");
		driver.findElement(By.cssSelector("*[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("*[class='xtXmba']")).click();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\eclipse-workspace\\screenshot\\screenshot3.png"));
		driver.close();
	}

	@Test
	public void brand() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.cssSelector("*[class='_2IX_2- VJZDxU']")).sendKeys("8936036688");
		driver.findElement(By.cssSelector("*[type='password']")).sendKeys("Atifadil1@");
		driver.findElement(By.cssSelector("*[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("*[class='xtXmba']")).click();
		Thread.sleep(3000);
		Actions w = new Actions(driver);
		w.moveToElement(driver.findElement(By.cssSelector("*[class='_2I9KP_']"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("*[title='Apple']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("*[class='kJjFO0 _3DIhEh']")).click();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\eclipse-workspace\\screenshot\\screenshot4.png"));
		driver.close();
	}

}
