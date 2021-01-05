package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import salesforceUtility.SalesforceUtility;

public class TC6MyProfile extends SalesforceUtility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		Map<String, String>  rowMap = readRowFromExcel(7);
		loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
		myProfile();
		changeLastName(rowMap.get("Last Name"));
		shareAPost(rowMap.get("Text"));
		uploadAfile(rowMap.get("Image"));
		updateProfilePic(rowMap.get("Image1"));
	quitBrowser();
		
	}
	public static void myProfile() throws Exception{
		 waitExplicitly(10, driver.findElement(By.id("userNavLabel")));
		 driver.findElement(By.id("userNavLabel")).click();
		 //find my profile in usermenu and click
		 waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")));
		 driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		
	}
	public static void changeLastName(String LastName) throws Exception {
		 //click on the edit icon, an edit profile page pops up
		waitExplicitly(10, driver.findElement(By.xpath("(//img[@alt='Edit Profile'])[1]")));
		 driver.findElement(By.xpath("(//img[@alt='Edit Profile'])[1]")).click();
		 Thread.sleep(5000);
		 //edit profile is an iframe. click on About
	    driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));//About is inside iframes.
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		//then clear the lastname field and enter new value
		waitExplicitly(10, driver.findElement(By.id("lastName")));
		driver.findElement(By.id("lastName")).clear();
		 driver.findElement(By.id("lastName")).sendKeys(LastName);
		 //Then click on save all button
	    driver.findElement(By.xpath("//input[@value='Save All']")).click();
	    //you can see the change in the usernamedrop down menu with updated lastname
	}
	
	public static void shareAPost(String text) throws Exception {
	   	waitExplicitly(10, driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']")));
		driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']")).click();
	    //send values to the text field which is inside an iframe
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
	    driver.findElement(By.xpath("//body[contains(text(),'Share an update, @mention someone...')]")).sendKeys(text);
	    //now switch from the text field to the defaultcontent(Post)
	    driver.switchTo().defaultContent();
	    //Then click on share button
	    waitExplicitly(10,  driver.findElement(By.xpath("//input[@id='publishersharebutton']")));
	    driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		
	}
	
	public static void uploadAfile(String image) throws Exception {	 
		Thread.sleep(3000);
	   // waitExplicitly(10, driver.findElement(By.xpath("//a[@id='publisherAttachContentPost']")));
		driver.findElement(By.xpath("//a[@id='publisherAttachContentPost']")).click();
		Thread.sleep(3000);
		waitExplicitly(10, driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")));
		driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")).click();
		WebElement choseFile=driver.findElement(By.xpath("//input[@id='chatterFile']"));
		choseFile.sendKeys(image);
		//Thread.sleep(5000);
	//	waitExplicitly(10, driver.findElement(By.xpath("//input[@id='chatterFile']")));
		//driver.findElement(By.xpath("//input[@id='chatterFile']")).click();
		
	//driver.findElement(By.xpath("//input[@id='chatterFile']")).sendKeys("C:\\Users\\SampuSathya\\Desktop\\Sathya Assign\\pics2.jpg");;
  
	waitExplicitly(10,  driver.findElement(By.xpath("//input[@id='publishersharebutton']")));
	  driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		Thread.sleep(3000);	
	
	}
	public static void updateProfilePic(String image1)throws Exception{
		waitExplicitly1(driver, driver.findElement(By.xpath("//span[contains(text(),'Moderator')]")));
		Actions actions= new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Moderator')]"))).perform();
		waitExplicitly(5, driver.findElement(By.xpath("//a[@id='uploadLink']")));
		driver.findElement(By.xpath("//a[@id='uploadLink']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']")));
		WebElement choseFile=driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
		choseFile.sendKeys(image1);
		driver.findElement(By.xpath("(//input[@value='Save'])[2]")).click();
		Thread.sleep(3000);
		Actions actions1=new Actions(driver);
		actions1.dragAndDropBy(driver.findElement(By.xpath("//div[@class='imgCrop_handle imgCrop_handleNW']")), 100, 20);
		driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
	}

}
