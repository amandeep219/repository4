package salesforce;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationScripts extends ResubleMethods{
	
	static int resultflag = 0;
	static String [][]data;
	
	public AutomationScripts(String filePath, String fileName) throws IOException
	{
		data=	readXlData("C:\\Users\\aman khatkar\\Desktop\\SDFC Login.xls","readfile");

	}

	public static void TC2_Login() throws InterruptedException, IOException

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
		
		System.out.println("TC1_Login is completed");
	}
	
	
	public static void TC1_LoginError() throws IOException, InterruptedException
	 {
		initialize_driver(); 
		String url = data[1][1];
		String UserName = data[1][2];
		 launchUrl(url);	// launch URL
		//Enter username in username field
				WebElement Uname = driver.findElement(By.xpath("//input[@id='username']"));
				enterText(Uname,UserName,"Uname");
				
		//Enter password in password field
				WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
				pwd.clear();
				
		//click on login button
				WebElement loginButton = driver.findElement(By.xpath("//*[@id='Login']"));
				clickObj(loginButton,"loginButton");
				
				Thread.sleep(3000);
				String errormessage =driver.findElement(By.xpath("//div[@id='error']")).getText(); 
				if(errormessage.equals("Please enter your password."))
				{ 
					resultflag = 1;
					System.out.println("The error message is: "+errormessage);
				} 
				else
				{ 
					resultflag = 0;
				} 
				driver.close();
				
				System.out.println("TC2_LoginError is completed");
	 }

	
	
	
	 public static void TC03_CheckRememberMe() throws
	 IOException,InterruptedException
	 { 
		 initialize_driver();
	 
	 String url = data[1][1]; String UserName = data[1][2];
	 String password =data[1][3]; 
	 launchUrl(url); // launch URL
	 
	  //Enter username in username field
	 WebElement Uname = driver.findElement(By.xpath("//input[@id='username']"));
	  enterText(Uname,UserName,"Uname");
	  //Enter password in password field 
	  WebElement pwd =driver.findElement(By.xpath("//input[@id='password']"));
	 enterText(pwd,password,"pwd");
	 
	  Thread.sleep(3000); WebElement
	  remember=driver.findElement(By.xpath("//*[@id='rememberUn']"));
	  remember.click();
	  
	 //click on login button
	  WebElement loginButton =
	  driver.findElement(By.xpath("//*[@id='Login']"));
	  clickObj(loginButton,"loginButton"); driver.close(); //logout
	
	 Uname = driver.findElement(By.id("idcard-identity"));
	 
	 WebElement UserMenu =
	  driver.findElement(By.xpath("//*[@id='userNavButton']")); UserMenu.click();
	 Thread.sleep(3000); WebElement logout
	  =driver.findElement(By.xpath("//a[@title='Logout']")); logout.click();
	 
	 Uname = driver.findElement(By.id("idcard-identity"));
	 System.out.println(Uname.getText().equals("aman.khatkar03-eval@force.com"));
	 
	 driver.close();

	 System.out.println("TC03_CheckRememberMe is completed");
	// report.endTest(logger); 
}
	 
	 public static void TC04A_ForgotPassword() throws IOException,
	  InterruptedException {

	 initialize_driver();
	 
	 String url = data[1][1]; String UserName = data[1][2];
	 String password =data[1][3]; 
	 launchUrl(url); // launch URL
	WebElement forgetPassword = driver.findElement(By.linkText("Forgot Your Password?"));
	forgetPassword.click();
	WebElement userNameField = driver.findElement(By.cssSelector("//input[@id='un']"));
	enterText(userNameField,UserName,"UnameNameField");
	
	WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
	continueButton.click();
	
	WebElement CheckEmailLogo = driver.findElement(By.xpath("//h2[@id='header']"));
	System.out.println("Email logo is present: "+ CheckEmailLogo.isDisplayed());
	
	driver.close(); 
	System.out.println("TC4A_ForgotPassword is completed");
	
	
	
	

		 
	 }

public static void TC04A() throws InterruptedException,
 IOException {
	
	initialize_driver();
	 
	 String url = data[2][1];
	 String UserName = data[2][2];
	 String password =data[2][3]; 
	 String expectedOutput =data[2][4]; 
	 launchUrl(url); // launch URL
	 
	  //Enter username in username field
	 WebElement Uname = driver.findElement(By.xpath("//input[@id='username']"));
	  enterText(Uname,UserName,"Uname");
	  //Enter password in password field 
	  WebElement pwd =driver.findElement(By.xpath("//input[@id='password']"));
	 enterText(pwd,password,"pwd");
	 
	 
	 
	 //click on login button
	  WebElement loginButton =
	  driver.findElement(By.xpath("//*[@id='Login']"));
	  clickObj(loginButton,"loginButton"); 
	  
	  WebElement errorMsg =driver.findElement(By.xpath("//div[@id='error']"));
	  System.out.println(errorMsg.getText().equals(expectedOutput));
	   driver.close(); 
	
	
	
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
	//System.out.println("is file displayed:" + isFileDownloaded("C:\\Users\\aman khatkar\\Downloads","LoginHistory1565557527944.csv"));
	 
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



public static void TC10CreateAccount() throws InterruptedException, IOException

{
	//valid login
	TC2_Login();
	WebElement accounts = driver.findElement(By.linkText("Accounts"));
	clickObj(accounts,"accounts");
	
	WebElement accountsTextOnHomePage = driver.findElement(By.xpath("//h1[@class='pageType']"));
	System.out.println("Is it accounts page: "+accountsTextOnHomePage.getText().equals("Accounts"));
	

	WebElement newAccountsButton  = driver.findElement(By.xpath("//input[@name='new']"));
	
	clickObj(newAccountsButton, "newAccountsButton");
	WebElement enterAccountName  = driver.findElement(By.xpath("//input[@id='acc2']"));
	enterText(enterAccountName,"aman's account","aman's account");
	

	WebElement saveNewAccInfo  = driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]"));
	
	clickObj(saveNewAccInfo, "saveNewAccInfo");
	WebElement newAccountPageTitlle  = driver.findElement(By.xpath("//h2[contains(@class,'topName')]"));
	System.out.println("Is it new accounts page: "+newAccountPageTitlle.getText().equals("aman's account"));
	
	
	
	
}
public static void TC11CreateNewView() throws InterruptedException, IOException

{
	//valid login
	TC2_Login();
	WebElement accounts = driver.findElement(By.linkText("Accounts"));
	clickObj(accounts,"accounts");
	
	WebElement accountsTextOnHomePage = driver.findElement(By.xpath("//h1[@class='pageType']"));
	System.out.println("Is it accounts page: "+accountsTextOnHomePage.getText().equals("Accounts"));
	

	WebElement createNewView  = driver.findElement(By.linkText("Create New View"));
	
	clickObj(createNewView,"createNewView");
	
	WebElement viewName  = driver.findElement(By.xpath("//input[@id='fname']"));
	enterText(viewName ,"amandeepKaur", "amandeepKaur");
	
	WebElement viewUniqueName  = driver.findElement(By.xpath("//input[@id='devname']"));
	enterText(viewUniqueName ,"amandeep_Kaur", "amandeep_Kaur");
	
	WebElement saveCreateNewView  = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
	
	clickObj(saveCreateNewView,"saveCreateNewView");
	WebElement newviewName = driver.findElement(By.xpath("//option[contains(text(),'amandeepKaur')]"));
	
	System.out.println("Is it accounts page: "+newviewName.getText().equals("amandeepKaur"));
	
	
	
	
	
}
public static void TC12EditView() throws InterruptedException, IOException

{
	//valid login
	TC2_Login();
	WebElement accounts = driver.findElement(By.linkText("Accounts"));
	clickObj(accounts,"accounts");
	
	WebElement accountsTextOnHomePage = driver.findElement(By.xpath("//h1[@class='pageType']"));
	System.out.println("Is it accounts page: "+accountsTextOnHomePage.getText().equals("Accounts"));
	

	WebElement viewDropDown  = driver.findElement(By.xpath("//select[@id='00B3i000001GjEl_listSelect']"));
	
	clickObj(viewDropDown,"viewDropDown");
	
	Select select = new Select(viewDropDown);
	select.selectByVisibleText("amandeepKaur");
	
	WebElement editAccounts = driver.findElement(By.linkText("Edit"));
	clickObj(editAccounts,"editAccounts");
	//chech the page
	WebElement viewName = driver.findElement(By.xpath("//select[@id='fcf']"));
	
	System.out.println("Is it accounts page: "+viewName.getText().equals("amandeepKaur"));
	
	
	
	//one step 
	
	
	
	
	
	
	
	
}

public static void TC14createReport() throws InterruptedException, IOException

{
	//valid login
	TC2_Login();
	WebElement accounts = driver.findElement(By.linkText("Accounts"));
	clickObj(accounts,"accounts");
	
	WebElement accountsTextOnHomePage = driver.findElement(By.xpath("//h1[@class='pageType']"));
	System.out.println("Is it accounts page: "+accountsTextOnHomePage.getText().equals("Accounts"));
	

	WebElement accActivity30days  = driver.findElement(By.linkText("Accounts with last activity > 30 days"));
	
	clickObj(accActivity30days,"accActivity30day");
	
	WebElement unsavedReportTitle = driver.findElement(By.xpath("//h2[@class='pageDescription']"));
	
	System.out.println("Is page name is: "+ unsavedReportTitle.getText().equals("Unsaved Report"));
	WebElement dateField = driver.findElement(By.xpath("//img[@id='ext-gen148']")) ;
	clickObj(dateField,"dateField");
	
	WebElement createdDate = driver.findElement(By.xpath("//div[@class='x-combo-list-item x-combo-selected']")) ;
	
	clickObj(createdDate,"createdDate");
	WebElement fromDate = driver.findElement(By.xpath("//img[@id='ext-gen152']")) ;
	
	clickObj(fromDate,"fromDate");
	
	WebElement todayFromDate = driver.findElement(By.xpath("//button[@id='ext-gen281']")) ;
	
	clickObj(todayFromDate,"todayFromDate");
	
	WebElement toDate = driver.findElement(By.xpath("//img[@id='ext-gen154']")) ;
	
	clickObj( toDate," toDate");
	
	WebElement toToDate = driver.findElement(By.xpath("//button[@id='ext-gen298']")) ;
	
	clickObj(toToDate,"toToDate");
	
	WebElement listOfRecords = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//b[contains(text(),'Grand Totals (0 records)')]")) ;
	
	System.out.println(listOfRecords.getText().equals("Grand Totals (0 records)"));
	
	
	
	//table[@class='x-grid3-row-table']//b[contains(text(),'Grand Totals (0 records)')]
	
	
	
	
	
	
	
	
	
	
	
}
public static void tc15() throws InterruptedException, IOException{ // create opt sheet
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Opportunity_Tab")).findElement(By.tagName("a")).click();
	    	
	WebElement viewDropDown=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fcf")));
	Select select=new Select(viewDropDown);
	select.selectByIndex(2); 	
	
	driver.close();
}


public static void tc16() throws InterruptedException, IOException{ // create opt sheet
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Opportunity_Tab")).findElement(By.tagName("a")).click();
	
	WebElement newOp=driver.findElement(By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input"));
	newOp.click();
	Thread.sleep(3000);
	WebElement name=driver.findElement(By.xpath(".//*[@id='opp3']")); name.sendKeys("new Oppor");
	WebElement nameA=driver.findElement(By.xpath(".//*[@id='opp4']")); nameA.sendKeys("Susana");
	
	WebElement type=driver.findElement(By.id("opp5"));
	Select typeS=new Select(type);
	typeS.selectByValue("New Customer");
	
	WebElement lead=driver.findElement(By.id("opp6"));
	Select leadS=new Select(lead);
	leadS.selectByValue("Other");
	
	WebElement stage=driver.findElement(By.id("opp11"));
	Select stageS=new Select(stage);
	stageS.selectByIndex(3);
	
	WebElement closeD=driver.findElement(By.xpath(".//*[@id='opp9']")); closeD.sendKeys("11/10/2017");
	WebElement source=driver.findElement(By.xpath(".//*[@id='opp17']")); source.sendKeys("google");
	
	WebElement save=driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[1]"));
	save.click();
	
	driver.close();
	
}

public static void tc17() throws InterruptedException, IOException{ // create opt sheet
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Opportunity_Tab")).findElement(By.tagName("a")).click();
	
	WebElement pipeline=driver.findElement(By.xpath(".//*[@id='toolsContent']/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a"));
    clickObj(pipeline, "opportunity pipeline link");
	Thread.sleep(2000);
	driver.close();
}

public static void tc18() throws InterruptedException, IOException{ // create opt sheet
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Opportunity_Tab")).findElement(By.tagName("a")).click();
	
	WebElement stuck=driver.findElement(By.xpath(".//*[@id='toolsContent']/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a"));
    clickObj(stuck, "Stuck opportunity link");
	Thread.sleep(2000);
	driver.close();
}

public static void tc19() throws InterruptedException, IOException{ // create opt sheet
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Opportunity_Tab")).findElement(By.tagName("a")).click();
	
	WebElement inter=driver.findElement(By.xpath(".//*[@id='quarter_q']"));
	Select interS=new Select(inter);
	interS.selectByIndex(1);
	
	WebElement include=driver.findElement(By.xpath(".//*[@id='open']"));
	Select includeS=new Select(include);
	includeS.selectByIndex(3);

	WebElement run=driver.findElement(By.xpath(".//*[@id='lead_summary']/table/tbody/tr[3]/td/input"));
	run.click();
	
	driver.close();  	
}

public static void logout() throws InterruptedException{
	//login();
    Thread.sleep(5000);
	WebElement navMenu = driver.findElement(By.id("userNav"));
	navMenu.click();
	navMenu.findElement(By.linkText("Logout")).click();
	System.out.println("log out the Salesforce");
	driver.close();
}

public static void tc20_leadsTab() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Lead_Tab")).findElement(By.tagName("a")).click();
	driver.close();
}

public static void tc21_leadsSelectView() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Lead_Tab")).findElement(By.tagName("a")).click();
	
	WebElement dropdown=driver.findElement(By.xpath(".//*[@id='fcf']"));
	clickObj(dropdown, "drop down view list");
	Thread.sleep(1000);
	driver.close();
}

public static void tc22_defaultView() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Lead_Tab")).findElement(By.tagName("a")).click();
	
	WebElement dropdown=driver.findElement(By.xpath(".//*[@id='fcf']"));
	Select dropdownS=new Select(dropdown);
	dropdownS.selectByVisibleText("Today's Leads");
	Thread.sleep(2000);
	
	logout();
	TC2_Login();
	WebDriverWait wait2=new WebDriverWait(driver, 30);
	WebElement tabBar2= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar2.findElement(By.id("Lead_Tab")).findElement(By.tagName("a")).click();
	Thread.sleep(5000);
	
	driver.close();
}

public static void tc23() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Lead_Tab")).findElement(By.tagName("a")).click();
	
	WebElement dropdown=driver.findElement(By.xpath(".//*[@id='fcf']"));
	Select dropdownS=new Select(dropdown);
	dropdownS.selectByVisibleText("Today's Leads");
	Thread.sleep(5000);
	
	WebElement go=driver.findElement(By.xpath(".//*[@id='filter_element']/div/span/span[1]/input"));
	clickObj(go, "go view drop down");
	
	driver.close();
}

public static void tc24() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Lead_Tab")).findElement(By.tagName("a")).click();
	
	WebElement newLead=driver.findElement(By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input"));
	clickObj(newLead, "creating new lead");
	
	WebElement lname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name_lastlea2")));
	lname.sendKeys("ABCD");
	
	WebElement company= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lea3")));
	company.sendKeys("ABCD");
	
	WebElement leadstatus=driver.findElement(By.xpath(".//*[@id='lea13']"));
	Select leadstatusSelect=new Select(leadstatus);
	leadstatusSelect.selectByIndex(3);
	Thread.sleep(5000);
	
	WebElement save=driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[1]"));
	clickObj(save, "save view drop down");
	Thread.sleep(3000);
	
	driver.close();
}

public static void tc25() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Contact_Tab")).findElement(By.tagName("a")).click();
	
	WebElement newC=driver.findElement(By.xpath("//*[@id='hotlist']/table/tbody/tr/td[2]/input"));
	clickObj(newC, "creating new contact");
	
	WebElement lname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name_lastcon2")));
	lname.sendKeys("new contact");
	
	WebElement nameA= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("con4")));
	nameA.sendKeys("bucket");
	
	sleep(1000);
	
	WebElement save=driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[1]"));
	clickObj(save, "save new contact");
	sleep(2000);
	
	driver.close();
}

public static void tc26() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Contact_Tab")).findElement(By.tagName("a")).click();
	

	WebElement newView=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='filter_element']/div/span/span[2]/a[2]"))); 
	clickObj(newView, "Create new view contact");  	
	
	WebElement viewName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='fname']")));
	viewName.sendKeys("Betsy");
	
	WebElement uniqueName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='devname']")));
	uniqueName.sendKeys("Josh");
	
	WebElement save=driver.findElement(By.xpath(".//*[@id='editPage']/div[1]/table/tbody/tr/td[2]/input[1]"));
	clickObj(save, "saved contact"); 
	sleep(3000);
	
	driver.close();
}

public static void tc27() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Contact_Tab")).findElement(By.tagName("a")).click();
	
	WebElement dropdown=driver.findElement(By.xpath(".//*[@id='hotlist_mode']"));
	Select dropdownSelect=new Select(dropdown);
	dropdownSelect.selectByIndex(1);

	sleep(3000);
	
	driver.close();
}

public static void tc28() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Contact_Tab")).findElement(By.tagName("a")).click();
	

	WebElement dropdown=driver.findElement(By.xpath(".//*[@id='fcf']"));
	Select dropdownSelect=new Select(dropdown);
	dropdownSelect.selectByIndex(3);  // my contacts

	sleep(3000);
	
	driver.close();
}

public static void tc29() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Contact_Tab")).findElement(By.tagName("a")).click();
	
	// table 
	
	driver.close();
}
public static void tc30() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Contact_Tab")).findElement(By.tagName("a")).click();
	
	WebElement newView=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='filter_element']/div/span/span[2]/a[2]"))); 
	clickObj(newView, "Create new view contact");  	
	
	WebElement uniqueName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='devname']")));
	uniqueName.sendKeys("Demo");
	
	WebElement save=driver.findElement(By.xpath(".//*[@id='editPage']/div[1]/table/tbody/tr/td[2]/input[1]"));
	clickObj(save, "saved contact"); 
	
	WebElement error= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='editPage']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[2]")));
	WebElement mssg=error.findElement(By.tagName("strong"));
	System.out.println(mssg.getText());
	
	sleep(3000);
	driver.close();
}

public static void tc31() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Contact_Tab")).findElement(By.tagName("a")).click();
	
	WebElement newView=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='filter_element']/div/span/span[2]/a[2]"))); 
	clickObj(newView, "Create new view contact");  	
	
	WebElement viewName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='fname']")));
	viewName.sendKeys("Stef");
	
	WebElement uniqueName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='devname']")));
	uniqueName.sendKeys("Fitz");
	
	WebElement cancel=driver.findElement(By.xpath(".//*[@id='editPage']/div[1]/table/tbody/tr/td[2]/input[2]"));
	clickObj(cancel, "cancel contact"); 
	
	sleep(3000);
	driver.close();
}

public static void tc32() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("Contact_Tab")).findElement(By.tagName("a")).click();
	
	WebElement newC=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input"))); 
	clickObj(newC, "Create new contact");  	
	
	WebElement lname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='name_lastcon2']")));
	lname.sendKeys("Eda");
	
	WebElement accountName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='con4']")));
	accountName.sendKeys("Apple");
	
	WebElement saveNew=driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[2]"));
	clickObj(saveNew, "save & new contact"); 
	
	sleep(3000);
	
	driver.close();
}

public static void tc33() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("home_Tab")).findElement(By.tagName("a")).click();
	
	WebElement firstNameLast=driver.findElement(By.xpath(".//*[@id='ptBody']/div/div[2]/span[1]/h1/a"));
	clickObj(firstNameLast, "firstName  & LastName profile"); 
	
	sleep(3000);
	driver.close();
}

public static void tc34() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("home_Tab")).findElement(By.tagName("a")).click();
	
	WebElement firstNameLast=driver.findElement(By.xpath(".//*[@id='ptBody']/div/div[2]/span[1]/h1/a"));
	clickObj(firstNameLast, "firstName  & LastName profile"); 
	sleep(3000);
	
	WebElement edit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='chatterTab']/div[2]/div[2]/div[1]/h3/div/div/a")));
	edit.click();
	sleep(2000);
	
	WebElement aboutTab=driver.findElement(By.id("contactInfo"));
	System.out.println("____"+aboutTab.getText()+"____");

	
	driver.close();
}

public static void tc35() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("AllTab_Tab")).findElement(By.tagName("a")).click();
	
	WebElement customize=driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[1]/table/tbody/tr/td[2]/input")); 
	customize.click();
    sleep(2000);
    
    WebElement selectedTab=driver.findElement(By.id("duel_select_1"));
	Select selectedTabSSS=new Select(selectedTab);
	selectedTabSSS.selectByValue("Dashboard");  // because you removed it
	sleep(2000);
	
	WebElement remove=driver.findElement(By.id("duel_select_0_left")); 
	clickObj(remove, "remove selected tab");
	
	WebElement save=driver.findElement(By.xpath(".//*[@id='bottomButtonRow']/input[1]"));  
	clickObj(save, "save change");
	
	logout();
	
	
}

public static void tc36() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("home_Tab")).findElement(By.tagName("a")).click();
	
	WebElement currentDate=driver.findElement(By.xpath(".//*[@id='ptBody']/div/div[2]/span[2]/a"));
	clickObj(currentDate, "current Date link under name "); 
	sleep(3000);
	
	WebElement eightPm=driver.findElement(By.xpath(".//*[@id='p:f:j_id25:j_id61:28:j_id64']/a"));
	clickObj(eightPm, "@8:00 pm "); 
	sleep(3000);
	

	
	WebElement endDate=driver.findElement(By.id(".//*[@id='simpleTimePicker']"));
	clickObj(endDate, "end date drop down ");
	
	//endDate.findElement(By.id("simpleTimePicker")).
	endDate.findElement(By.linkText("9:00 PM")).click();
    
	WebElement save=driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[1]"));  
	clickObj(save, "save event");
	
	close_driver();
	
}

public static void tc37() throws InterruptedException, IOException{
	TC2_Login();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement tabBar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabBar")));
	tabBar.findElement(By.id("home_Tab")).findElement(By.tagName("a")).click();
	
	WebElement currentDate=driver.findElement(By.xpath(".//*[@id='ptBody']/div/div[2]/span[2]/a"));
	clickObj(currentDate, "current Date link under name "); 
	sleep(3000);
	
	WebElement fourPm=driver.findElement(By.xpath(".//*[@id='p:f:j_id25:j_id61:20:j_id64']/a"));
	clickObj(fourPm, "@4:00 pm "); 
	sleep(3000);
	
	
	
	WebElement rec=driver.findElement(By.id("IsRecurrence"));
	check_if_selected(rec, "recurrence");
	select_check(rec, "recurrence");
	sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='recpat']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[1]/div/div[2]")).click(); // weekly
    sleep(2000);
    
    WebElement endDate=wait.until(ExpectedConditions.elementToBeClickable(By.id("RecurrenceEndDateOnly")));
    endDate.sendKeys("12/25/2017");
    
    WebElement save=driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[1]"));  
	clickObj(save, "save event");
	
		
}   

}









	 
	
	 







