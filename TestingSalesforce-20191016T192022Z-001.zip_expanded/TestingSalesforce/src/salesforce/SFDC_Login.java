package salesforce;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SFDC_Login extends ResubleMethods {
	//static WebDriver driver;
	static int resultflag = 0;
	static String [][]data;

	public static void main(String[] args) throws InterruptedException, IOException {
	data=	readXlData("C:\\Users\\aman khatkar\\Desktop\\SDFC Login.xls","readfile");
	    TC1_LoginError();
		TC2_Login();
		TC03_CheckRememberMe();
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

	 
	 




	 
	
	 





 }