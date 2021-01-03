package salesforceHackathon.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import salesforceUtility.SalesforceUtility;

public class TC12EditView extends SalesforceUtility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
		editView();
		quitBrowser();
		
	}

	public static void editView() throws Exception{
		waitExplicitly1(driver, driver.findElement(By.xpath("//li[@id='Account_Tab']")));
		driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
	    driver.findElement(By.id("tryLexDialogX")).click();
	    Thread.sleep(3000);
	    Select se=new Select(driver.findElement(By.id("fcf")));
		se.selectByVisibleText("Automation View12");
		Thread.sleep(3000);
			
		waitExplicitly1(driver, driver.findElement(By.xpath("//a[contains(text(),'Edit')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		waitExplicitly1(driver, driver.findElement(By.xpath("//input[@id='fname']")));
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("New Automation View12");
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='devname']")));
		driver.findElement(By.xpath("//input[@id='devname']")).click();
		Thread.sleep(3000);
		Select se1=new Select(driver.findElement(By.id("fcol1")));
		se1.selectByVisibleText("Account Name");
		Thread.sleep(3000);
		Select se2=new Select(driver.findElement(By.id("fop1")));
		se2.selectByVisibleText("contains");
		Thread.sleep(3000);
		waitExplicitly1(driver, driver.findElement(By.xpath("//input[@id='fval1']")));
		driver.findElement(By.xpath("//input[@id='fval1']")).click();;
		Select se3=new Select(driver.findElement(By.id("colselector_select_0")));
		se3.selectByVisibleText("Last Activity");
		Thread.sleep(3000);
		waitExplicitly1(driver, driver.findElement(By.xpath("//a[@id='colselector_select_0_right']//img[@title='Add']")));
		driver.findElement(By.xpath("//a[@id='colselector_select_0_right']//img[@title='Add']")).click();
		waitExplicitly1(driver, driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")));
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	}
}
