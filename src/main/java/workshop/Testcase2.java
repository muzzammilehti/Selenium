package workshop;



import org.testng.annotations.Test;

import wrapper.LinkedInWrapper;

public class Testcase2 extends LinkedInWrapper {

	@Test(groups="AdvanceSearch")
    public void case2() throws InterruptedException {
        login();
        clickByLink("Advanced");
        Thread.sleep(2000);
        clickByXpath("//*[@id='advs']/div[1]/button");
        Thread.sleep(2000);
        clickByXpath("//*[@id='pivot-bar']/ul/li[2]/button");
        Thread.sleep(2000);
        clickByXpath("//*[@id='pivot-bar']/ul/li[2]/button");
        String result = getTextByXpath("//*[@id='results_count']/div/p/strong");
        Thread.sleep(2000);
        System.out.println(result);
    }
}