package web.flipkart;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class search {
	WebDriver driver;

	@Test
	public void prosearch() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("*[class='_2YxCDZ']")).click();
		Select m = new Select(driver.findElement(By.cssSelector("*[class='_2YxCDZ']")));
		Thread.sleep(3000);
		m.selectByValue("25000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='_5THWM1']/div[3]")).click();
		driver.findElement(By.xpath("//*[@class='_2iDkf8 shbqsL']/div")).click();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\eclipse-workspace\\screenshot\\screenshot5.png"));
		driver.close();

	}

	@Test
	public void buy() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("*[class='_2YxCDZ']")).click();
		Select m = new Select(driver.findElement(By.cssSelector("*[class='_2YxCDZ']")));
		Thread.sleep(3000);
		m.selectByValue("25000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='_5THWM1']/div[3]")).click();
		driver.findElement(By.xpath("//*[@class='_2iDkf8 shbqsL']/div")).click();
		Thread.sleep(3000);
		// JavascriptExecutor j=(JavascriptExecutor)driver;
		// j.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//*[@data-id='MOBF9Z7ZJZ2PKSQQ']")).click();
		Thread.sleep(3000);
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("window.scrollBy(0,350)", "");
		// driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/button")).click();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\eclipse-workspace\\screenshot\\screenshot6.png"));
		driver.close();
	}

}
