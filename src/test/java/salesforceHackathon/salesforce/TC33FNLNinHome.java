package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC33FNLNinHome extends SalesforceUtility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		Map<String, String>  rowMap = readRowFromExcel(34);
		loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
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
		waitExplicitly(10,driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")));
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")).click();
		System.out.println("This page is same as the My Profile page");
	}

}
