//Implementing data provider in all the four classes

package dataProvider_fourclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrapper.LinkedInWrapper;

public class Testcase1 extends LinkedInWrapper {

	@DataProvider(name="dataProvider1")
	public Object [][] getData()
	{
		Object[][] data = new Object[2][1];
		data[0][0]="Selenium";
		data[1][0]="Training";
			
		return data;
	}
	
	
    @Test(groups="AdvanceSearch",dataProvider="dataProvider1")
    public void case1() throws InterruptedException {
        //login();
    	clickByLink("Advanced");
        Thread.sleep(6000);
        enterById("advs-keywords", "key");
        Thread.sleep(6000);
        clickByClassName("submit-advs");
        Thread.sleep(2000);
        String count = removeComa("//*[@id='results_count']/div/p/strong[1]");
        System.out.println("The search count is :" + count);
        String name = getTextByXpath("//*[@id='results']/li[1]/div/h3/a");
        System.out.println("The First connection in the search result : " + name);
        Thread.sleep(3000);
		String actualConnection = getTextByXpath("//*[@id='results']/li[1]/div/h3/span/span/abbr");
		System.out.println(actualConnection);
		String connectionOne = "1st";
		String ConnectionTwo = "2nd";
		Thread.sleep(3000);
		if (actualConnection.contentEquals(connectionOne)) {
			System.out.println("The Connection is 1st connection");
		} else if (actualConnection.contentEquals(ConnectionTwo)) {
			System.out.println("The Connection is 2nd connection");
		}
}

}