package salesforceHackathon.salesforce;

import java.util.Map;

import salesforceUtility.SalesforceUtility;

public class TC4BWrongUserPassword extends SalesforceUtility{

	public static void main(String[] args)throws Exception {
		launchBrowser();
		gotosalesforceURL();
		Map<String, String>  rowMap = readRowFromExcel(5);
		loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
		quitBrowser();
	}

}
