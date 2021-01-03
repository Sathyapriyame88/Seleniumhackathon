package salesforceHackathon.salesforce;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import salesforceUtility.SalesforceUtility;

public class TC36BlockingAEventInCalender extends SalesforceUtility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
         blockingAEvent();
		quitBrowser();

	}
	public static void blockingAEvent()throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='home_Tab']")));
		 driver.findElement(By.xpath("//li[@id='home_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		System.out.println("First and Last Name and current date is Displayed as Link");
		waitExplicitly(10,driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[2]/a[1]")));
		 driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[2]/a[1]")).click();
		 Thread.sleep(5000);
		 waitExplicitly(10,driver.findElement(By.xpath("//a[normalize-space()='8:00 PM']")));
		 driver.findElement(By.xpath("//a[normalize-space()='8:00 PM']")).click();
		 waitExplicitly(10,driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']")));
		 driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']")).click();
		 ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		 System.out.println(windows.size());
		 driver.switchTo().window(windows.get(1));
		 driver.findElement(By.xpath("//li[@class='listItem4']//a[1]")).click();;
		 Thread.sleep(5000);
		 driver.switchTo().window(windows.get(0));
		 waitExplicitly(10,driver.findElement(By.xpath("//input[@id='EndDateTime_time']")));
		 driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
		 System.out.println("DropDown display time from 9pm to 11.30pm");
		 Thread.sleep(3000);
		 waitExplicitly(10,driver.findElement(By.xpath("//div[@id='timePickerItem_42']")));
		 driver.findElement(By.xpath("//div[@id='timePickerItem_42']")).click();
		 System.out.println("Endtime 9pm is selected");
		 waitExplicitly(10,driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")));
		 driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
		 Thread.sleep(5000);
		 WebElement element=driver.findElement(By.xpath("//div[@id='p:f:j_id25']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", element);
			Thread.sleep(3000);
			System.out.println("The Event Other is added to the Calender");
	}

}
