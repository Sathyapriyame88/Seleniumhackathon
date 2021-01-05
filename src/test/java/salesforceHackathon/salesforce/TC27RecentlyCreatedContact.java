package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import salesforceUtility.SalesforceUtility;

public class TC27RecentlyCreatedContact extends SalesforceUtility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		Map<String, String>  rowMap = readRowFromExcel(28);
		loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
	recentlyCreatedContact();
		quitBrowser();
		
	}
	public static void recentlyCreatedContact() throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Contact_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		Select se=new Select(driver.findElement(By.id("hotlist_mode")));
		se.selectByVisibleText("Recently Created");
		Thread.sleep(3000);
		
	}

}
