package salesforceHackathon.salesforce;

import salesforceUtility.SalesforceUtility;

public class TC2LoginToSalesForce extends SalesforceUtility{
	
	

	public static void main(String[] args) throws Exception {
	launchBrowser();
	gotosalesforceURL();
	loginToSalesforce("spt@abc.com", "sathyasampu1");
	quitBrowser();
	
	}
 
}
