package week5_Homework;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import wrapper.LinkedInWrapper;

public class DragandDrop_Sortable extends LinkedInWrapper {
	
	@Test
	public void dragandDrop() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./src/main/java/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/sortable");
		
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Thread.sleep(5000);
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement pick = driver.findElementByXPath("//*[@id='sortable']/li[1]");
		WebElement drop = driver.findElementByXPath("//*[@id='sortable']/li[5]");
		
		Actions builder = new Actions(driver);
		//builder.dragAndDrop(pick, drop).release().build().perform();
		builder.clickAndHold(pick).release(drop).build().perform();
		
		
		
		
		
		
	}

}
