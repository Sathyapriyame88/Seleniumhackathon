package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC24NewButtonOnLeads extends SalesforceUtility {

	public static void main(String[] args) throws Exception {

		launchBrowser();
		gotosalesforceURL();
		 Map<String, String>  rowMap = readRowFromExcel(25);
			loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
		newButtonOnLeads(rowMap.get("Last Name"));
		quitBrowser();

	}
	public static void newButtonOnLeads(String lastname)throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Lead_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Lead_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		waitExplicitly(10,driver.findElement(By.xpath("//input[@title='New']")));
		 driver.findElement(By.xpath("//input[@title='New']")).click();
		 
		 waitExplicitly(10,driver.findElement(By.xpath("//input[@id='name_lastlea2']")));
		 driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys(lastname);;
		 
		 waitExplicitly(10,driver.findElement(By.xpath("//input[@id='lea3']")));
		 driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("ABCD");
		 Thread.sleep(3000);
		 waitExplicitly(10,driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")));
		 driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
	}

}
//td[@id='bottomButtonRow']//input[@title='Save']