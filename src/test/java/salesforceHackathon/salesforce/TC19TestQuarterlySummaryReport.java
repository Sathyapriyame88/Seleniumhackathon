package salesforceHackathon.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import salesforceUtility.SalesforceUtility;

public class TC19TestQuarterlySummaryReport extends SalesforceUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
		testQuarterlySummaryRepo();
		quitBrowser();
	

	}
public static void testQuarterlySummaryRepo()throws Exception{
	waitExplicitly(10, driver.findElement(By.xpath("//li[@id='Opportunity_Tab']")));
	driver.findElement(By.xpath("//li[@id='Opportunity_Tab']")).click();
	Thread.sleep(5000);
	driver.switchTo().activeElement();
	driver.findElement(By.id("tryLexDialogX")).click();
	driver.findElement(By.xpath(" //h3[contains(text(),'Quarterly Summary')]"));
	Select se=new Select(driver.findElement(By.id("quarter_q")));
	se.selectByVisibleText("Current FQ");
	Thread.sleep(3000);
	Select se1=new Select(driver.findElement(By.id("open")));
	se1.selectByVisibleText("Open Opportunities");
	Thread.sleep(3000);
	waitExplicitly(10, driver.findElement(By.xpath("//input[@title='Run Report']")));
	driver.findElement(By.xpath("//input[@title='Run Report']")).click();
}
}
