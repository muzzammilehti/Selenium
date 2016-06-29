package testleaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Opentaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//To launch chrome driver
		//FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./src/main/java/driver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//To perform implicityly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//To load the url
		driver.get("http://www.demo1.opetaps.org");
		
			
		//To enter user name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		
		//To enter password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//To click on login button
		driver.findElementByClassName("decorativeSubmit").click();
		
		Thread.sleep(2000);
		
		//To logout
		driver.findElementByClassName("decorativeSubmit").click();
		
		//To close the browser
		driver.close();
		
		
		
	}

}
