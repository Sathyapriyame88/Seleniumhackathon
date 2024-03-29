package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC4AForgotPassword extends SalesforceUtility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		forgotPassword();
		quitBrowser();
		

	}
 public static void forgotPassword() throws Exception{
	 Map<String, String>  rowMap = readRowFromExcel(4);
	 waitExplicitly(15,driver.findElement(By.xpath("//a[@id='forgot_password_link']")));
	 driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
	// Thread.sleep(5000);
	 waitExplicitly(15, driver.findElement(By.xpath("//input[@id='un']")));
	 driver.findElement(By.xpath("//input[@id='un']")).sendKeys(rowMap.get("userName"));
	// Thread.sleep(5000);
	 waitExplicitly(15,driver.findElement(By.xpath("//input[@id='continue']")));
	 driver.findElement(By.xpath("//input[@id='continue']")).click();
	 Thread.sleep(5000);
 }

	 
 
}
