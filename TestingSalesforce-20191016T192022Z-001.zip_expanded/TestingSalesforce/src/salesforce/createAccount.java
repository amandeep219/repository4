package salesforce;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class createAccount extends ResubleMethods{

	public static void main(String[] args) throws InterruptedException, IOException {
		SFDC_Login.TC2_Login();

	}
	public static void TC10CreateAccount() throws InterruptedException, IOException

	{
		//valid login
		SFDC_Login.TC2_Login();
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
		SFDC_Login.TC2_Login();
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
		SFDC_Login.TC2_Login();
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
		SFDC_Login.TC2_Login();
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
	
	
}
