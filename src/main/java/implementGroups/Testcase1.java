package implementGroups;

import org.testng.annotations.Test;

import wrapper.LinkedInWrapper;

public class Testcase1 extends LinkedInWrapper {

    @Test(groups="Advance Search")
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
        //String actualConnection = getTextByXpath("//*[@id='results']/li[1]/div/h3/span/span/abbr");
        //System.out.println(actualConnection);
//        String connectionOne = "1st";
  //      String ConnectionTwo = "2nd";
        //if (actualConnection.contentEquals(connectionOne)) {
          //  System.out.println("The Connection is 1st connection");
        //} else if (actualConnection.contentEquals(ConnectionTwo)) {
          //  System.out.println("The Connection is 2nd connection");
        }

}
