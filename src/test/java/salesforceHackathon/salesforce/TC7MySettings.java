package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import salesforceUtility.SalesforceUtility;

public class TC7MySettings extends SalesforceUtility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		Map<String, String>  rowMap = readRowFromExcel(8);
		loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
		mySettings(rowMap.get("Email"));
		quitBrowser();
		
		
	}
	public static void mySettings(String email) throws Exception{
		 waitExplicitly(10, driver.findElement(By.id("userNavLabel")));
		 driver.findElement(By.id("userNavLabel")).click();
		 waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")));
		 driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		 waitExplicitly(10, driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")));
		 driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")).click();
		 waitExplicitly(10, driver.findElement(By.xpath("//a[@id='LoginHistory_font']")));
		 driver.findElement(By.xpath("//a[@id='LoginHistory_font']")).click();
		 waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")));
		 driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
		 waitExplicitly(10, driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")));
		 driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")).click();
		 waitExplicitly(10, driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")));
		 driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")).click();
		 waitExplicitly(10, driver.findElement(By.id("p4")));
		 driver.findElement(By.id("p4")).click();
		 waitExplicitly(10, driver.findElement(By.xpath("//option[contains(text(),'Salesforce Chatter')]")));
		 driver.findElement(By.xpath("//option[contains(text(),'Salesforce Chatter')]")).click();
		 Thread.sleep(5000);
		 WebElement element=driver.findElement(By.xpath("//option[contains(text(),'Reports')]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", element);
			Thread.sleep(5000);
		driver.findElement(By.xpath("//option[contains(text(),'Reports')]")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//img[@class='rightArrowIcon']")));
	 driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();
	 waitExplicitly(10, driver.findElement(By.xpath("//input[@type='submit']")));
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 waitExplicitly(10, driver.findElement(By.xpath("//span[@id='EmailSetup_font']")));
	 driver.findElement(By.xpath("//span[@id='EmailSetup_font']")).click();
	 waitExplicitly(10, driver.findElement(By.xpath("//span[@id='EmailSettings_font']")));
	 driver.findElement(By.xpath("//span[@id='EmailSettings_font']")).click();
	 waitExplicitly(10, driver.findElement(By.xpath("//input[@id='sender_name']")));
	 driver.findElement(By.xpath("//input[@id='sender_name']")).clear();
	 driver.findElement(By.xpath("//input[@id='sender_name']")).sendKeys("SPT");;
	 waitExplicitly(10, driver.findElement(By.xpath("//input[@id='sender_email']")));
	 driver.findElement(By.xpath("//input[@id='sender_email']")).clear();
	 driver.findElement(By.xpath("//input[@id='sender_email']")).sendKeys(email);
	 WebElement radio=driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
	 radio.click();
	 Thread.sleep(5000);
	 waitExplicitly(10, driver.findElement(By.xpath("//input[@class='btn primary']")));
	 driver.findElement(By.xpath("//input[@class='btn primary']")).click();
	 
	 waitExplicitly(10, driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']")));
	 driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']")).click();
			
	 waitExplicitly(10, driver.findElement(By.xpath("//span[@id='Reminders_font']")));
	 driver.findElement(By.xpath("//span[@id='Reminders_font']")).click();
	 
	 waitExplicitly(10, driver.findElement(By.xpath("//input[@id='testbtn']")));
	 driver.findElement(By.xpath("//input[@id='testbtn']")).click();
			
					
			
			
					
			
			
			
	 
		 
	}
}
