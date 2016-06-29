package mouseandkeyboad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.firfox.driver", "./src/main/java/driver/firefoxdriver.exe");
		 
		 FirefoxDriver driver = new FirefoxDriver();
		 		 
         driver.get("http://jqueryui.com/droppable/");
         
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
         driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
         
         WebElement list1= driver.findElementByXPath("//*[@id='draggable']");
         
         WebElement list2= driver.findElementByXPath("//*[@id='droppable']");
         
         Actions builder = new Actions(driver);
         
         //driver.findElementById("draggable").click();
         
         builder.dragAndDrop(list1, list2).release().build().perform();
         
        
         
         
	}

}
