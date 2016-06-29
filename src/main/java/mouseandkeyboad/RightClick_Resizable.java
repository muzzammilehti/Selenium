package mouseandkeyboad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firfox.driver", "./src/main/java/driver/firefoxdriver.exe");
		 
		 FirefoxDriver driver = new FirefoxDriver();
		 		 
         driver.get("https://jqueryui.com");
         
         driver.findElementByLinkText("Resizable").click();
         
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
         driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
         
         Actions builder = new Actions(driver);
         
         WebElement rightClick=driver.findElementByXPath("//div[@id='resizable']");
         
         //builder.contextClick(rightClick).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
         
         builder.contextClick(rightClick).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
        

	}

}
