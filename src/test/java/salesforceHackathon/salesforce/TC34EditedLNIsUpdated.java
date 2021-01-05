package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC34EditedLNIsUpdated extends SalesforceUtility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		Map<String, String>  rowMap = readRowFromExcel(35);
		loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
		editedLastNameUpdated(rowMap.get("Last Name"));
		quitBrowser();

	}
	public static void editedLastNameUpdated(String lastname)throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='home_Tab']")));
		 driver.findElement(By.xpath("//li[@id='home_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		System.out.println("First and Last Name is Displayed as Link");
		waitExplicitly(15,driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")));
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")).click();
		System.out.println("This page is same as the My Profile page");
		waitExplicitly(10, driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")));
		 driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")).click();
		 Thread.sleep(5000);
		 driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));//About is inside iframes.
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		waitExplicitly(10, driver.findElement(By.id("lastName")));
		driver.findElement(By.id("lastName")).clear();
		 driver.findElement(By.id("lastName")).sendKeys(lastname);
		 //Then click on save all button
	    driver.findElement(By.xpath("//input[@value='Save All']")).click();
	    Thread.sleep(3000);
	    System.out.println("UserMenu and User:FirstandLastname page has updated LastName");
		
	}

}
