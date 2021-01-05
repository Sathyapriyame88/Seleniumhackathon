package salesforceHackathon.salesforce;

import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC8DeveloperConsole extends SalesforceUtility{

	public static void main(String[] args)throws Exception {
		launchBrowser();
		gotosalesforceURL();
		Map<String, String>  rowMap = readRowFromExcel(9);
		loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
		developerConsole();
		quitBrowser();
		

	}
	public static void developerConsole() throws Exception{
		waitExplicitly(10, driver.findElement(By.id("userNavLabel")));
		 driver.findElement(By.id("userNavLabel")).click();
		 waitExplicitly(15, driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]")));
		 driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]")).click();
		 Thread.sleep(5000);
		   ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		 System.out.println(windows.size());
		 driver.switchTo().window(windows.get(1));
		 driver.close();
		 driver.switchTo().window(windows.get(0));
	}

}
