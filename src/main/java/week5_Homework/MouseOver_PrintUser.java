package week5_Homework;

import org.testng.annotations.Test;

import wrapper.LinkedInWrapper;

public class MouseOver_PrintUser extends LinkedInWrapper {
	
	@Test
	public void mouseover() throws InterruptedException
	{
		launch_chrome("https://the-internet.herokuapp.com/hovers");
		//Thread.sleep(5000);
		mouseOverOnImageByXpath("//*[@id='content']/div/div[1]/img");
		//*[@id="content"]/div/div[1]/img
		Thread.sleep(1000);
		String username = getTextByXpath("//*[@id='content']/div/div[1]/div/h5");
		System.out.println("The mouse over user name is :" +username);
		
	}

}
