package salesforceHackathon.salesforce;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import salesforceUtility.SalesforceUtility;

public class TC16CreateNewOpty extends SalesforceUtility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
		createNewOpty();
		quitBrowser();
		
			}

	public static void createNewOpty()throws Exception{
		waitExplicitly(10, driver.findElement(By.xpath("//li[@id='Opportunity_Tab']")));
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().activeElement();
	
		driver.findElement(By.id("tryLexDialogX")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//input[@title='New']")));
		driver.findElement(By.xpath("//input[@title='New']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='opp3']")));
		driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("Opty2");
		 waitExplicitly(10,driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']")));
		 driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']")).click();
		 ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		 System.out.println(windows.size());
		 driver.switchTo().window(windows.get(1));
		 driver.switchTo().frame(driver.findElement(By.xpath("//frame[@id='searchFrame']")));
		 driver.findElement(By.xpath("//input[@id='lksrch']")).sendKeys("abcd");
		 driver.findElement(By.xpath("//body/form[@id='theForm']/div[1]/div[2]/input[2]")).click();
		 Thread.sleep(5000);
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(driver.findElement(By.xpath("//frame[@id='resultsFrame']")));
		 driver.findElement(By.xpath("//tbody/tr[2]/th[1]/a[1]")).click();
		 Thread.sleep(5000);
		 driver.switchTo().window(windows.get(0));
		 
		 waitExplicitly1(driver, driver.findElement(By.xpath("//input[@id='opp9']")));
			driver.findElement(By.xpath("//input[@id='opp9']")).click();
			waitExplicitly1(driver, driver.findElement(By.xpath("//a[contains(text(),'Today')]")));
			driver.findElement(By.xpath("//a[contains(text(),'Today')]")).click();
			Select se=new Select(driver.findElement(By.id("opp11")));
			se.selectByVisibleText("Value Proposition");
			Thread.sleep(3000);
			 waitExplicitly(10,driver.findElement(By.xpath("//img[@title='Primary Campaign Source Lookup (New Window)']")));
			 driver.findElement(By.xpath("//img[@title='Primary Campaign Source Lookup (New Window)']")).click();
			 ArrayList<String> windows1=new ArrayList<String>(driver.getWindowHandles());
			 System.out.println(windows1.size());
			 driver.switchTo().window(windows1.get(1));
			 driver.switchTo().frame(driver.findElement(By.xpath("//frame[@id='searchFrame']")));
			 driver.findElement(By.xpath("//input[@id='lksrch']")).sendKeys("camp2");
			 driver.findElement(By.xpath("//body/form[@id='theForm']/div[1]/div[2]/input[2]")).click();
			 Thread.sleep(5000);
			 driver.switchTo().defaultContent();
			 driver.switchTo().frame(driver.findElement(By.xpath("//frame[@id='resultsFrame']")));
			 driver.findElement(By.xpath(" //tbody/tr[2]/th[1]/a[1]")).click();
			 Thread.sleep(5000);
			 driver.switchTo().window(windows1.get(0));
							
			 waitExplicitly(10, driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")));
				driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
		
	}
}
