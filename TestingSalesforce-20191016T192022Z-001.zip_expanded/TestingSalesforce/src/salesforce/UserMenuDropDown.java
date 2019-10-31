package salesforce;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UserMenuDropDown extends ResubleMethods {

	//static WebDriver driver;
		static int resultflag = 0;
		static String [][]data;

		public static void main(String[] args) throws InterruptedException, IOException {
		data=	readXlData("C:\\Users\\aman khatkar\\Desktop\\SDFC Login.xls","readfile");
		    TC05();
			
		}
		
		
		public static void TC05() throws InterruptedException, IOException

		{

			 initialize_driver(); 
			 
			 String url = data[1][1];
			 String UserName = data[1][2];
			 String password = data[1][3];
			 launchUrl(url);	// launch URL
			 
			 //Enter username in username field
			WebElement Uname = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(Uname,UserName,"Uname");
			
			//Enter password in password field
			WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(pwd,password,"pwd");
			
			//click on login button
			WebElement loginButton = driver.findElement(By.xpath("//*[@id='Login']"));
			clickObj(loginButton,"loginButton");
			driver.close();
			
			//Thread.sleep(3000);
			
			WebElement nameDropDownButton = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			clickObj(nameDropDownButton,"nameDropDownButton");
			//driver.close();
			
			
		/*
		 * WebElement nameDropDownButtonList =
		 * driver.findElement(By.xpath("//div[@id='userNav-menuItems']"));
		 * System.out.println(nameDropDownButtonList.getText());
		 */
			
			System.out.println("TC05 is completed");
		}
		
		
		
		public static void TC06() throws InterruptedException, IOException

		{

			 initialize_driver(); 
			 
			 String url = data[1][1];
			 String UserName = data[1][2];
			 String password = data[1][3];
			 launchUrl(url);	// launch URL
			 
			 //Enter username in username field
			WebElement Uname = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(Uname,UserName,"Uname");
			
			//Enter password in password field
			WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(pwd,password,"pwd");
			
			//click on login button
			WebElement loginButton = driver.findElement(By.xpath("//*[@id='Login']"));
			clickObj(loginButton,"loginButton");
			driver.close();
			
			//Thread.sleep(3000);
			
			WebElement nameDropDownButton = driver.findElement(By.xpath("//span[@id='userNavButton']"));
			clickObj(nameDropDownButton,"nameDropDownButton");
			//driver.close();
			
			
			WebElement myProfileButton = driver.findElement(By.linkText("My Profile"));
			myProfileButton.click();
			
			WebElement editProfileButton = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
			clickObj(editProfileButton,"editProfileButton");
			//swithc to iframe
			driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/iframe[1]")));
			// click about button 
			WebElement aboutButton = driver.findElement(By.partialLinkText("About"));
			clickObj(aboutButton,"aboutButton");
			WebElement lastNameField = driver.findElement(By.xpath("//input[@id='lastName']"));
			enterText(lastNameField,"Khatkar","lastnamefield");
			
			WebElement saveAllButton = driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
			
			clickObj(saveAllButton,"saveAllButton");
		//	driver.close();
			// check changed user  lastname
	     WebElement userNameLabel = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
	     System.out.println(userNameLabel.getText().equals("Aman Khatkar"));
	     
	     //click on the post link
	     
	     WebElement postLink= driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
		 clickObj(postLink,"postLink");
		 
		 //switch to post iframe
		 WebElement postFrame=driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
		 driver.switchTo().frame(postFrame);
		 // click in post iframe
		 clickObj(postFrame,"postFrame");
		 
		 // Type something in postFrame
		 enterText(postFrame,"hi, I am Aman","postFrame");
		 
		 //Click on Share Button
		 WebElement shareButton = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		 clickObj(shareButton,"shareButton");
		 
		 // Check posted text
		 WebElement checkPostedData = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/p[1]"));
		
		 System.out.println(checkPostedData.getText().equals("Hi I am Aman"));
		 // Click File Link
		 WebElement fileLink = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
		 clickObj(fileLink,"fileLink");
		 //Upload file 
		 WebElement uploadFileLink = driver.findElement(By.linkText(" Upload a file from your computer"));
		 clickObj(uploadFileLink,"uploadFileLink");
		 
		 WebElement chooseFileButton = driver.findElement(By.xpath("//input[@id='chatterFile']"));
		 chooseFileButton.sendKeys("C:\\Users\\aman khatkar\\Desktop\\BA602-Syllabus - May 2019 H6 (2).docx");
		 
		 clickObj(chooseFileButton,"chooseFileButton");
		 // click on share button
		 clickObj(shareButton,"shareButton");
		 // check if file is posted
		 System.out.println(driver.findElement(By.xpath("//span[contains(text(),'posted a file.')]")).getText().equals("Aman Khatkar Posted a file"));
		
		 WebElement profileButton = driver.findElement(By.linkText("Profile"));
		 clickObj(profileButton,"profileButton");
		 
		 
		Actions actions = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//span[@class='profileImage chatter-avatarFull chatter-avatar']//img[@class='chatter-photo']"));
		actions.moveToElement(target).perform();
		WebElement addPhotoLink =driver.findElement(By.linkText("Add Photo"));
		 clickObj(addPhotoLink,"addPhotoLink");
		
		 
		 /////////////////pending last point
		 
		 
		
		 
		
		 System.out.println("TC06 is completed");
		}
		
		public static void TC07() throws InterruptedException, IOException

		{
			TC05();
			
			 // click on mysettings link
			WebElement mySettings = driver.findElement(By.linkText("My Settings"));
			 clickObj(mySettings ,"mySettings");
			 // click on personal link
			 WebElement personalLink = driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"));
			 clickObj(personalLink,"personalLink");
			 // find download login history link
			 WebElement loginHistoryLink = driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
			 clickObj(loginHistoryLink,"loginHistoryLink");
			 // click download login history link
			 WebElement DownloadloginHistoryLink = driver.findElement(By.partialLinkText(" Download login histo"));
			 clickObj(DownloadloginHistoryLink,"DownloadloginHistoryLink");
			 
			 // check if the login history displayed
			 WebElement loginHistoryTitle = driver.findElement(By.xpath("//h3[@id='RelatedUserLoginHistoryList_title']"));
			 System.out.println("Is login history displayed: "+loginHistoryTitle.isDisplayed());
			
			 
			 Thread.sleep(3000);
			 //check if file downloaded
			System.out.println("is file displayed:" + isFileDownloaded("C:\\Users\\aman khatkar\\Downloads","LoginHistory1565557527944.csv"));
			 
			 WebElement displayAndLayoutLink = driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']"));
			 clickObj(displayAndLayoutLink,"displayAndLayoutLink");
			 
			 WebElement reportsTab = driver.findElement(By.linkText("Reports"));
			 
			 
			 System.out.println("is report tab presesnt on top of page links: "+reportsTab.isDisplayed());
			////////////not all
			 
			 WebElement emailLink = driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']]"));
			 clickObj(emailLink,"emailLink");
			 
			 WebElement emailSettingsLink = driver.findElement(By.xpath("//span[@id='EmailSettings_font']"));
			 clickObj(emailSettingsLink,"emailSettingsLink");
			 
			 WebElement emailName = driver.findElement(By.xpath("//input[@id='sender_name']"));
			 
			 emailName.clear();
			 enterText(emailName,"Aman Khatkar","emailName");
			 
			 WebElement emailAddress = driver.findElement(By.xpath("//input[@id='sender_email']"));
			 
			 emailAddress.clear();
			 enterText(emailAddress,"aman.khatkar03@gmail.com","emailAddress");
			 
			 
			
			 WebElement automaticBCC = driver.findElement(By.xpath("//label[contains(text(),'Yes')]"));
			 clickObj( automaticBCC," automaticBCC");
			 

			 WebElement saveEmailSettingsButton = driver.findElement(By.xpath("//input[@name='save']"));
			 clickObj( saveEmailSettingsButton,"saveEmailSettingsButton");
			// check message
			 System.out.println(driver.findElement(By.xpath("//div[contains(@class,'messageText')]")).equals("settings have been successfully saved"));
			 
			 
			 WebElement calenderAndReminderLink= driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
			 clickObj(calenderAndReminderLink," calenderAndReminderLink");
			 
			 WebElement activityReminderLink= driver.findElement(By.xpath("//a[@id='Reminders_font']"));
			 clickObj(activityReminderLink,"activityReminderLink");
			 //preview reminder not found
			
			 
			 
			
			
			
			 
			
	}
		public static void TC08() throws InterruptedException, IOException

		{
			TC05();
			WebElement DeveloperConsoleButton = driver.findElement(By.linkText("Developer Console"));
			 clickObj(DeveloperConsoleButton ,"DeveloperConsoleButton");
		String DevConsoleWindow= driver.getWindowHandle();
		driver.getCurrentUrl().equals("https://na112.salesforce.com/_ui/common/apex/debug/ApexCSIPage");
			
		}
		
		
		public static void TC09() throws InterruptedException, IOException

		{
			TC05();
			WebElement logOutButton = driver.findElement(By.linkText("Logout"));
			 clickObj(logOutButton ,"logOutButton ");
			System.out.println(driver.getCurrentUrl().equals("https://login.salesforce.com/")); 
			driver.close();
			
		}
	}


