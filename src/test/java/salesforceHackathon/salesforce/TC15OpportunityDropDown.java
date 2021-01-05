package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC15OpportunityDropDown extends SalesforceUtility {

	public static void main(String[] args)throws Exception {
		launchBrowser();
		gotosalesforceURL();
		 Map<String, String>  rowMap = readRowFromExcel(16);
			loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
		opportunityDropDown();
		quitBrowser();
		

	}
	public static void opportunityDropDown() throws Exception{
		waitExplicitly(10, driver.findElement(By.xpath("//li[@id='Opportunity_Tab']")));
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().activeElement();
	
		driver.findElement(By.id("tryLexDialogX")).click();
				
		driver.findElement(By.id("fcf")).click();
		
	}

}
