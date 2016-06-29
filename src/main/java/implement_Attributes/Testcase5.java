package implement_Attributes;


import org.testng.annotations.Test;

import wrapper.LinkedInWrapper;

public class Testcase5 extends LinkedInWrapper {

    @Test(enabled=false)
    public void case5() throws InterruptedException {
        //login();
        Thread.sleep(3000);
        clickByLink("Advanced");
        Thread.sleep(10000);
        enterByXpath("//*[@id='advs-company']","TCS");
        Thread.sleep(10000);
        selectById("advs-locationType", "I");
        Thread.sleep(10000);
        selectById("advs-countryCode", "in");
        Thread.sleep(10000);
        clickByXpath("//*[@id='peopleSearchForm']/div[1]/input[2]");
        Thread.sleep(2000);
        // verifyTextContainsById("advs-company"," ");
        String result = getTextById("advs-company");
        if (result.isEmpty()) {
            System.out.println("The field is Empty");
        } else {
            System.out.println("The field is not Empty");
        }
        Thread.sleep(5000);
        // clickById("adv-S-N-ffs");
        clickByXpath("//*[@id='peopleSearchForm']/div[1]/input[1]");
        Thread.sleep(3000);
        clickByClassName("submit-advs");
        quitBrowser();



    }
}
