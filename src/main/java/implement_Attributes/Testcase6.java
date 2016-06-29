package implement_Attributes;

import org.testng.annotations.Test;

import wrapper.LinkedInWrapper;

public class Testcase6 extends LinkedInWrapper {

    @Test(invocationCount=2,invocationTimeOut=120000)
    public void case6() throws InterruptedException {

        Thread.sleep(5000);
        clickByXpath("//*[@id='account-nav']/ul/li[1]/a");
        Thread.sleep(5000);
        clickById("compose-button");
        Thread.sleep(5000);
        enterById("pillbox-input", "Praveen Kumat");
        Thread.sleep(2000);
        enterKeyById("pillbox-input");
        Thread.sleep(5000);
        enterById("compose-message", "Good Day This is testing my selenium script pls ignore");
        clickById("enter-to-send-checkbox");
        clickByClassName("message-submit");
        Thread.sleep(5000);
        checkMessageSent("message-body", "Good Day This is testing my selenium script pls ignore");
        quitBrowser();

    }

}