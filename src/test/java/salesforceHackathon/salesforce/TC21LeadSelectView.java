package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC21LeadSelectView extends SalesforceUtility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		 Map<String, String>  rowMap = readRowFromExcel(22);
			loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
		leadSelectView();
		quitBrowser();

	}
	public static void leadSelectView()throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Lead_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Lead_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		waitExplicitly(10,driver.findElement(By.id("fcf")) );
		driver.findElement(By.id("fcf")).click();
		
		
	}

}
