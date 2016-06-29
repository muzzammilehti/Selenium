package workshop;

import org.testng.annotations.Test;

//import org.junit.Test;

import wrapper.LinkedInWrapper;

public class Testcase4 extends LinkedInWrapper {

    @Test(groups="Profile", dependsOnGroups="AdvanceSearch")
    public void case4() throws InterruptedException {
        login();
        clickByLink("Jobs");
        enterById("job-search-box", "Selenium");
        clickByClassName("search-button");
        verifyColourByXpath("//*[@id='results']/li[1]/div/div[3]/a", "background-color", "rgba(40, 123, 188, 1)");
        clickByXpath("//*[@id='results']/li[2]/div/div[3]/a");
        String companyName = getTextByClassName("company");
        System.out.println("The Company Name is : " + companyName);
        clickByClassName("company");
        Thread.sleep(2000);
        String number = getNumberByXpath("//*[@id='body']/div[2]/div[1]/div[1]/div/p[3]");
        System.out.println("The Number of Employees in :" + companyName + "are " + number);
    }

}