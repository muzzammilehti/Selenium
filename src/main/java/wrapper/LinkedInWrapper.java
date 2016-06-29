package wrapper;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class LinkedInWrapper extends WrapperMethods {
String browser;
	@BeforeSuite
	public void bs() {
		System.out.println("Executing Method from Before Suite ");
	}

	@BeforeTest
	public void bt() {
		System.out.println("Executing Method from Before Test ");
	}

	@AfterClass
	public void ac() {
		System.out.println("Executing Method from After Class ");
	}

	@AfterTest
	public void at() {
		System.out.println("Executing Method from After Test ");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("Executing Method from Before Suite ");
	}
	
	
	@BeforeMethod
	@Parameters({"browser"})
	public boolean login() {
		try {
			invokeApp("chrome","https://in.linkedin.com/");
			enterById("login-email", "muzzammil.ehti@gmail.com");
			enterById("login-password", "flasH$23");
			clickByName("submit");
			driver.manage().window().maximize();
			return true;
		} catch (Exception e) {
			System.out.println("Exception Details : " + e.toString());
			return false;
		}
	}

	public boolean checkMessageSent(final String name, final String expectedMessage) {
		// TODO Auto-generated method stub
		try {
			String message = driver.findElementByClassName(name).getText();
			System.out.println("The actual Message : " + message);
			if (message.contains(expectedMessage)) {
				System.out.println("The Message was sent");
				return true;
			} else {
				System.out.println("The message is not sent");
				return false;
			}
		} catch (Exception e) {
			System.out.println("Exception in checkMessageSent  :" + e);

			return false;
		}

	}

	public void addSkill(final String xPath1, final String skill, final String id1, final String id2,
			final String xPath2, final String xPath3) {

		boolean flag = verifyTextContainsByXpath(xPath1, skill);
		System.out.println(flag);
		if (flag == false) {
			clickByXpath(xPath2);
			enterById(id1, skill);
			clickById(id2);
			clickByXpath(xPath3);

		} else {
			System.out.println("The skill is already added");

		}
	}
	
	

}
