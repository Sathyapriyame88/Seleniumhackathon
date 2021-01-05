package salesforceHackathon.salesforce;

import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC32checkTheSaveNewButtonInContact extends SalesforceUtility{

	public static void main(String[] args)throws Exception {
		launchBrowser();
		gotosalesforceURL();
		Map<String, String>  rowMap = readRowFromExcel(33);
		loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
	checkTheSaveNewButton(rowMap.get("Last Name"));
		quitBrowser();
		

	}
	public static void checkTheSaveNewButton(String lastname) throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Contact_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		
		waitExplicitly(10,driver.findElement(By.xpath("//input[@title='New']")));
		 driver.findElement(By.xpath("//input[@title='New']")).click();
		 
		 waitExplicitly(10,driver.findElement(By.xpath("//input[@id='name_lastcon2']")));
		 driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys(lastname);;
		 
		 waitExplicitly(10,driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']")));
		 driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']")).click();
		 ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		 System.out.println(windows.size());
		 driver.switchTo().window(windows.get(1));
		 driver.switchTo().frame(driver.findElement(By.xpath("//frame[@id='searchFrame']")));
		 driver.findElement(By.xpath("//input[@id='lksrch']")).sendKeys("Global Media");
		 driver.findElement(By.xpath("//body/form[@id='theForm']/div[1]/div[2]/input[2]")).click();
		 Thread.sleep(5000);
		 System.out.println("Error msg for no Account");
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(driver.findElement(By.xpath("//frame[@id='resultsFrame']")));
		 driver.findElement(By.xpath("//tbody/tr[2]/th[1]/a[1]")).click();
		 Thread.sleep(5000);
		 driver.switchTo().window(windows.get(0));
		 System.out.println("Test case failed");
		 waitExplicitly(10,driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save & New']")));
		 driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save & New']")).click();
		 Thread.sleep(5000);
		 waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Contact_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		System.out.println("Test case failed");
		
	}

}
