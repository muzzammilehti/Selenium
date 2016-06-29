package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wrapper.LinkedInWrapper;

public class Testcase3 extends LinkedInWrapper {
    
	
	@Test
	@Parameters({"skill"})
    public void case3(String skill) throws InterruptedException {
        clickByXpath("//*[@id='main-site-nav']/ul/li[2]/a");
		boolean flag = false;
		flag = verifyTextContainsByXpath("//*[@id='profile-skills']/div/div/ul", skill);
		System.out.println(flag);
		if (flag == false) {
			clickByXpath("//*[@id='background-skills']/button");
			enterById("edit-skills-add-ta", skill);
			clickById("edit-skills-add-btn");
			clickByXpath("//*[@id='skills-editor-form']/p/input");
			System.out.println("The added skill is :" + skill );
		} else {
			System.out.println("The skill is already added");
		}

	}

}
