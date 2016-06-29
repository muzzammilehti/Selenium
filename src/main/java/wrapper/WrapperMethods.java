package wrapper;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;

public class WrapperMethods implements GenericWrappers {
	RemoteWebDriver driver;
   
	
	public boolean invokeApp(String browser, final String url) throws Exception {
		// TODO Auto-generated method stub
		try {
			if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
				driver.get(url);
				return true;
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./src/main/java/driver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(url);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Exception in Method invokeApp : " + e);
			return false;
		}
	}

	public boolean clearById(final String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).clear();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in the Method clearByClassName : " + e);
			return false;
		}
	}

	public boolean clearByClassName(final String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).clear();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in the Method clearByClassName : " + e);
			return false;
		}
	}

	public boolean clearByName(final String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).clear();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in the Method clearByName : " + e);
			return false;
		}
	}

	public boolean clearByXpath(final String xpathVal) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByXPath(xpathVal).clear();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in the Method clearByXpath : " + e);
			return false;
		}
	}

	public boolean clearByTagName(final String tagName) {
		try {
			driver.findElementByTagName(tagName).clear();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in the Method clearByTagName : " + e);
			return false;
		}
	}

	/*
	 * public boolean clearByLink(String name) { // TODO Auto-generated method
	 * stub try { driver.findElementByLinkText(name).clear(); return true; }
	 * catch (Exception e) { // TODO Auto-generated catch block
	 * System.out.println("Exception in the Method clearByLink : " + e); return
	 * false; } return false; }
	 */

	/*
	 * public boolean clearByPartialLinkText(String partialLink) { try {
	 * driver.findElementByPartialLinkText(partialLink).clear(); return true; }
	 * catch (Exception e) { // TODO Auto-generated catch block
	 * System.out.println("Exception in the Method clearByPartialLinkText : " +
	 * e); return false; } }
	 */

	public boolean enterById(final String idValue, final String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method enterById : " + e);
			return false;
		}
	}

	public boolean enterByName(final String name, final String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).sendKeys(data);
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method enterByName : " + e);
			return false;
		}
	}

	public boolean enterByTagName(final String tagName, final String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByTagName(tagName).sendKeys(data);
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method enterByTagName : " + e);
			return false;
		}
	}

	public boolean enterByClassName(final String className, final String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(className).sendKeys(data);
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method enterByClassName : " + e);
			return false;
		}
	}

	public boolean enterByCssSelector(final String cssSelector, final String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByCssSelector(cssSelector).sendKeys(data);
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method enterByCssSelector : " + e);
			return false;
		}
	}

	public boolean enterByXpath(final String xpathVal, final String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).sendKeys(data);
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method enterByXpath : " + e);
			return false;
		}
	}

	public boolean verifyTitle(final String title) {
		// TODO Auto-generated method stub
		try {
			driver.getTitle().equalsIgnoreCase(title);
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method verifyTitle : " + e);
			return false;
		}
	}

	public boolean verifyTextById(final String id, final String text) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).getText().equalsIgnoreCase(text);
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Exception in the verifyTextById Method : " + e);
			return false;
		}
	}

	public boolean verifyTextByName(final String id, final String text) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(id).getText().equalsIgnoreCase(text);
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Exception in the verifyTextByName Method : " + e);
			return false;
		}
	}

	public boolean verifyTextByClassName(final String id, final String text) {
		// TODO Auto-generated method stub
		try {
			if (driver.findElementByClassName(id).getText().equalsIgnoreCase(text)) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			System.out.println("Exception in the verifyTextByClassName Method : " + e);
			return false;
		}
	}

	public boolean verifyTextLinkText(final String id, final String text) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(id).getText().equalsIgnoreCase(text);
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Exception in the verifyTextLinkText Method : " + e);
			return false;
		}
	}

	public boolean verifyTextTagName(final String id, final String text) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByTagName(id).getText().equalsIgnoreCase(text);
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Exception in the verifyTextTagName Method : " + e);
			return false;
		}
	}

	public boolean verifyTextCssSelector(final String id, final String text) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByCssSelector(id).getText().contains(text);
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Exception in the verifyTextCssSelector Method : " + e);
			return false;
		}
	}

	public boolean verifyTextByXpath(final String xpath, final String text) {
		// TODO Auto-generated method stub
		try {
			if (driver.findElementByXPath(xpath).getText().equalsIgnoreCase(text)) {
				return true;
			} else {
				return false;

			}
		} catch (NoSuchElementException e) {
			System.out.println("Exception in the verifyTextByXpath Method : " + e);
			return false;
		}
	}

	public boolean verifyTextContainsById(final String id, final String text) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).getText().contains(text);
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method verifyTextContainsById : " + e);
			return false;
		}
	}

	public boolean verifyTextContainsByName(final String id, final String text) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(id).getText().contains(text);
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method verifyTextContainsByName : " + e);
			return false;
		}
	}

	public boolean verifyTextContainsByClassName(final String id, final String text) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(id).getText().contains(text);
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method verifyTextContainsByClassName : " + e);
			return false;
		}
	}

	public boolean verifyTextContainsByXpath(final String xpath, final String text) {
		// TODO Auto-generated method stub
		try {
			if (driver.findElementByXPath(xpath).getText().contains(text)) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Exception in the Method verifyTextContainsByXpath : " + e);
			return false;
		}
	}

	public boolean clickById(final String id) {
		try {
			driver.findElementById(id).click();
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method clickById : " + e);
			return false;
		}
	}

	public boolean clickByClassName(final String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method clickByClassName : " + e);
			return false;
		}
	}

	public boolean clickByName(final String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method clickByName : " + e);
			return false;
		}
	}

	public boolean clickByLink(final String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method clickByLink : " + e);
			return false;
		}
	}

	public boolean clickByXpath(final String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method clickByXpath : " + e);
			return false;
		}
	}

	public boolean mouseOverByXpath(final String xpathVal) {
		// TODO Auto-generated method stub
		try {
			Actions builder = new Actions(driver);
			WebElement mouseOver = driver.findElementByXPath(xpathVal);
			builder.moveToElement(mouseOver).build().perform();
			
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the mouseOverByXpath Method :" + e);
			return false;
		}
	}
	
	public boolean mouseOverOnImageByXpath(final String onimage) {
		// TODO Auto-generated method stub
		try {
			Actions builder = new Actions(driver);
			WebElement mouseOver = driver.findElementByXPath(onimage);
			builder.moveToElement(mouseOver).click().build().perform();
			
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the mouseOverByCSSSelector Method :" + e);
			return false;
		}
	}

	/*public boolean mouseOverByLinkText(final String linkName) {
		// TODO Auto-generated method stub
		try {
			Actions builder = new Actions(driver);
			WebElement we = driver.findElementByLinkText(linkName);
			builder.moveToElement(we).build().perform();
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the mouseOverByLinkText Method :" + e);
			return false;
		}
	}*/

	public String getTextByXpath(final String xpathVal) {
		// TODO Auto-generated method stub
		String text;
		try {
			text = driver.findElementByXPath(xpathVal).getText();
			return text;
		} catch (Exception e) {
			System.out.println("Exception in the Method getTextByXpath : " + e);
			return null;
		}
	}

	public boolean selectById(final String id, final String value) {
		// TODO Auto-generated method stub
		try {
			Select dropDown = new Select(driver.findElementById(id));
			dropDown.selectByValue(value);
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method selectById : " + e);
			return false;
		}

	}

	public boolean selectById(final String id, final int index) {
		// TODO Auto-generated method stub
		try {
			Select dropDown = new Select(driver.findElementById(id));
			dropDown.selectByIndex(index);

			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method selectById : " + e);
			return false;
		}
	}

	public String getWindowHandle() {
		String windowHandle = null;
		try {
			windowHandle = driver.getWindowHandle();
			driver.switchTo().window(windowHandle);
		} catch (Exception e) {
			System.out.println("Exception in getWindowHandle : " + e.toString());
		}
		return windowHandle;
	}

	public Set<String> getWindowHandles() {
		Set<String> handles = null;

		try {
			handles = driver.getWindowHandles();
			for (String gethandles : handles) {
				driver.switchTo().window(gethandles);
			}
		} catch (Exception e) {
			System.out.println("Exception in the Method getWindowHandles : " + e);
		}
		return handles;
	}

	public void captureScreenShot(final String name) {
		try {
			File snapShot = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snapShot, new File("./snapshots/" + name + ".jpeg"));
		} catch (Exception e) {
			System.out.println("Exception in the Medthod captureScreenShot : " + e);
		}
	}

	public boolean frameSwitchId(final String id) {
		try {
			driver.switchTo().frame(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}

	public boolean frameSwitchName(final String name) {
		try {
			driver.switchTo().frame(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}

	public boolean frameSwitchIndex(final int index) {
		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}

	public boolean frameSwitchElementId(final String id) {
		try {
			driver.switchTo().frame(driver.findElementById(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}

	public boolean frameSwitchElementName(final String name) {
		try {
			driver.switchTo().frame(driver.findElementById(name));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}

	public boolean frameSwitchElementXpath(final String xPath) {
		try {
			driver.switchTo().frame(driver.findElementById(xPath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}

	public boolean frameSwitchElementclass(final String classname) {
		try {
			driver.switchTo().frame(driver.findElementById(classname));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}

	public boolean frameSwitchElementDefault() {

		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;

	}

	public boolean invokeApp(final String browser) {
		// TODO Auto-generated method stub
		return false;
	}
    
	@AfterMethod()
	public void quitBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Exception in the Method quitBrowser : " + e);
		}
	}

	public void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			System.out.println("Exception in the Method closeBrowser : " + e);
		}
	}

	public String removeComa(final String xpathVal) {
		String number = driver.findElementByXPath(xpathVal).getText().replace(",", "");
		return number;
	}

	public String getTextById(final String id) {
		// TODO Auto-generated method stub
		String text;
		try {
			text = driver.findElementById(id).getText();
			return text;
		} catch (Exception e) {
			System.out.println("Exception in the Method getTextByXpath : " + e);
			return null;
		}
	}

	public boolean pressEnterByXpath(final String xpathVal) {
		// TODO Auto-generated method stub
		try {
			// Actions builder = new Actions(driver);
			WebElement we = driver.findElementByXPath(xpathVal);
			we.sendKeys(Keys.RETURN);
			return true;
		} catch (Exception e) {
			System.out.println("Exception in the Method pressEnterByXpath : " + e);
			return false;
		}

	}

	public String getTextByClassName(final String name) {
		// TODO Auto-generated method stub
		String text;
		try {
			text = driver.findElementByClassName(name).getText();
			return text;
		} catch (Exception e) {
			System.out.println("Exception in the Method getTextByXpath : " + e);
			return null;
		}

	}

	public String getNumberByXpath(final String name) {
		// TODO Auto-generated method stub
		String completeText = driver.findElementByXPath(name).getText();
		String requiredText = completeText.substring(0, completeText.indexOf(" "));
		return requiredText;

	}

	public void enterKeyById(final String id) {
		// TODO Auto-generated method stub
		WebElement element = driver.findElementById(id);
		element.sendKeys(Keys.RETURN);
	}

	public void getList(final String name, final String skill) {
		WebElement element = driver.findElementByXPath(name);
		if (element.getText().contains(skill)) {
			System.out.println("The skill is present");

		}

	}


	public boolean verifyColourByXpath(final String xPath1, final String cssValue, final String colour) {
		String actualColour = driver.findElementByXPath(xPath1).getCssValue(cssValue);
		if (actualColour.contentEquals(colour)) {
			System.out.println("The Background is blue");
			return true;
		} else {
			System.out.println("The colour is not blue");
			return false;
		}

	}

	public void test(final String xPath1) {
		WebElement element = driver.findElementByXPath(xPath1);
		String a = element.getText();
		System.out.println(a);

	}
	
	
	public boolean launch_chrome(String url)
	{
		try{
		System.setProperty("webdriver.chrome.driver", "./src/main/java/driver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get(url);
		
		return true;
		
		} catch (Exception e) {
		System.out.println("Exception Details : " + e.toString());
		return false;
			
	
	}
	}
	

}