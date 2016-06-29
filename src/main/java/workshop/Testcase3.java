package workshop;


import org.testng.annotations.Test;

import wrapper.LinkedInWrapper;

public class Testcase3 extends LinkedInWrapper {
    
	@Test(groups="Profile", dependsOnGroups="AdvanceSearch")
    public void case03() {
        // TODO Auto-generated method stub
        login();
        clickByXpath("//*[@id='main-site-nav']/ul/li[2]/a");
        boolean flag = false;
        flag = verifyTextContainsByXpath("//*[@id='profile-skills']/div/div/ul", "baking");
        System.out.println(flag);
        if (flag == false) {
            clickByXpath("//*[@id='background-skills']/button");
            enterById("edit-skills-add-ta", "baking");
            clickById("edit-skills-add-btn");
            clickByXpath("//*[@id='skills-editor-form']/p/input");
        } else {
            System.out.println("The skill is already added");
        }

    }

}
