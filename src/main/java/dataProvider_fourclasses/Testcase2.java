package dataProvider_fourclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrapper.LinkedInWrapper;

public class Testcase2 extends LinkedInWrapper {

	@DataProvider(name="dataProvider2")
	public Object [][] getData()
	{
		Object[][] data = new Object[2][1];
		data[0][0]="Hellow";
		data[1][0]="World";
			
		return data;
	}
	
	
	
    @Test(groups="AdvanceSearch",dataProvider="dataProvider2")
    public void case2() throws InterruptedException {
    	clickByLink("Advanced");
        Thread.sleep(6000);
        clickByXpath("//*[@id='advs']/div[1]/button");
        Thread.sleep(6000);
        clickByXpath("//*[@id='pivot-bar']/ul/li[2]/button");
        Thread.sleep(6000);
        clickByXpath("//*[@id='pivot-bar']/ul/li[2]/button");
        String result = getTextByXpath("//*[@id='results_count']/div/p/strong");
        Thread.sleep(2000);
        System.out.println(result);
        
    }
}