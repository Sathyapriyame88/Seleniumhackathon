package salesforceHackathon.salesforce;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC33FNLNinHome extends SalesforceUtility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
		firstLastnameInHome();
		quitBrowser();


	}
	public static void firstLastnameInHome() throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='home_Tab']")));
		 driver.findElement(By.xpath("//li[@id='home_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		System.out.println("First and Last Name is Displayed as Link");
		waitExplicitly(10,driver.findElement(By.xpath("//a[@href='/_ui/core/userprofile/UserProfilePage'][normalize-space()='SathyaPriya T']")));
		driver.findElement(By.xpath("//a[@href='/_ui/core/userprofile/UserProfilePage'][normalize-space()='SathyaPriya T']")).click();
		System.out.println("This page is same as the My Profile page");
	}

}
