package salesforceHackathon.salesforce;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import salesforceUtility.SalesforceUtility;

public class TC37BlockingAEventweeklyReccurence extends SalesforceUtility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		Map<String, String>  rowMap = readRowFromExcel(38);
		loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
        blockindAEventWeeklyReccurence();
		quitBrowser();


	}
	public static void blockindAEventWeeklyReccurence() throws Exception{
	waitExplicitly(10,driver.findElement(By.xpath("//li[@id='home_Tab']")));
	 driver.findElement(By.xpath("//li[@id='home_Tab']")).click();
 Thread.sleep(3000);
 driver.switchTo().activeElement();
driver.findElement(By.id("tryLexDialogX")).click();
System.out.println("First and Last Name and current date is Displayed as Link");
waitExplicitly(10,driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[2]/a[1]")));
 driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[2]/a[1]")).click();
 Thread.sleep(5000);
 waitExplicitly(10,driver.findElement(By.xpath("//a[normalize-space()='4:00 PM']")));
 driver.findElement(By.xpath("//a[normalize-space()='4:00 PM']")).click();
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
 System.out.println("DropDown display time from 5pm to 11.30pm");
 Thread.sleep(3000);
 waitExplicitly(10,driver.findElement(By.xpath("//div[@id='timePickerItem_38']")));
 driver.findElement(By.xpath("//div[@id='timePickerItem_38']")).click();
 WebElement li=driver.findElement(By.xpath(" //label[contains(text(),'Create Recurring Series of Events')]"));
	li.click();
	WebElement radio=driver.findElement(By.xpath("//label[contains(text(),'Weekly')]"));
	radio.click();
	System.out.println("Weekly Radio Button Selected");
	
	
	waitExplicitly(10,driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")));
	driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")).click();
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Calendar calendar =Calendar.getInstance();
	calendar.add(Calendar.DAY_OF_MONTH, 14);
	//1/17/2021
	String date = simpleDateFormat.format(calendar.getTime());

	 driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")).sendKeys(date);;
	waitExplicitly(10,driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")));
	 driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
	 waitExplicitly(10,driver.findElement(By.xpath("//img[@title='Month View']")));
	 driver.findElement(By.xpath("//img[@title='Month View']")).click();
	
	}

}//td[@class='weekend selectedDate highlight']
