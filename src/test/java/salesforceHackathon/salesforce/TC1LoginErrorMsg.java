package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC1LoginErrorMsg extends SalesforceUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotosalesforceURL();
		Map<String, String>  rowMap = readRowFromExcel(1);
		logintoSalesforceError(rowMap.get("userName"));
		quitBrowser();
		

	}
public static void logintoSalesforceError(String userName) throws Exception{
		
		waitExplicitly(10, driver.findElement(By.id("username")));
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(userName);
		waitExplicitly(10, driver.findElement(By.id("password")));
		driver.findElement(By.id("password")).clear();
		//driver.findElement(By.id("password")).sendKeys("sathyasampu1");
		waitExplicitly(10, driver.findElement(By.id("Login")));
		 driver.findElement(By.id("Login")).click();
		 Thread.sleep(5000);
		
		
	}


}
