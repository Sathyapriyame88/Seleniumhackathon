package salesforceHackathon.salesforce;

import salesforceUtility.SalesforceUtility;

public class TC4BWrongUserPassword extends SalesforceUtility{

	public static void main(String[] args)throws Exception {
		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("123", "22131");
		quitBrowser();
	}

}
