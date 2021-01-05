package salesforceHackathon.salesforce;

import java.util.Map;

import salesforceUtility.SalesforceUtility;

public class TC2LoginToSalesForce extends SalesforceUtility{
	
	

	public static void main(String[] args) throws Exception {
	launchBrowser();
	gotosalesforceURL();
	Map<String, String>  rowMap = readRowFromExcel(2);
	System.out.println(rowMap.get("userName")+ " " + rowMap.get("Password"));
	loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
	quitBrowser();
	
	}
 
}
