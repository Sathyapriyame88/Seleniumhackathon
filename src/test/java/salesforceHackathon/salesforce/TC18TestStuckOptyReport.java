package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC18TestStuckOptyReport extends SalesforceUtility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		 Map<String, String>  rowMap = readRowFromExcel(19);
			loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
		teststuckOptyReport();
		quitBrowser();
		

	}
	public static void teststuckOptyReport()throws Exception{
		waitExplicitly(10, driver.findElement(By.xpath("//li[@id='Opportunity_Tab']")));
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().activeElement();
	
		driver.findElement(By.id("tryLexDialogX")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();
		Thread.sleep(3000);
				
	}

}
