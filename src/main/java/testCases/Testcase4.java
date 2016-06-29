package testCases;

import org.junit.Test;

import wrapper.LinkedInWrapper;

public class Testcase4 extends LinkedInWrapper {

    @Test
    public void case4() throws InterruptedException {
    	login();
		clickByLink("Jobs");
		Thread.sleep(5000);		
		enterById("job-search-box","cooking");
		clickByXpath("//*[@id='job-search']/div[1]/input");
		Thread.sleep(5000);
		verifyColourByXpath("//*[@id='results']/li[1]/div/div[3]/a", "background-color", "rgb(0, 0, 255)");
		Thread.sleep(5000);
		clickByXpath("//*[@id='results']/li[2]/div/div[3]/a");
		Thread.sleep(5000);
		String companyName = getTextByClassName("company");
		System.out.println("The Company Name is : " + companyName);
		clickByClassName("company");
		Thread.sleep(2000);
		String number = getNumberByXpath("//*[@id='stream-promo-top-bar']/div[2]/div[1]/div[1]/div/p[2]");
		System.out.println("The Number of Employees in :" + companyName + "are :" + number);

    }

}