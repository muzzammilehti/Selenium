package execution;

import org.testng.annotations.Test;

import wrapper.LinkedInWrapper;

public class Testcase3 extends LinkedInWrapper {
    
	@Test(dependsOnMethods={"testNG.Testcase1.case1","testNG.Testcase2.case2"})
    public void case3() throws InterruptedException {
        clickByXpath("//*[@id='main-site-nav']/ul/li[2]/a");
		boolean flag = false;
		flag = verifyTextContainsByXpath("//*[@id='profile-skills']/div/div/ul", "Baking");
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
