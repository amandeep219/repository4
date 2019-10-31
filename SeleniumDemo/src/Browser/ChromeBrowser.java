package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	public static void main (String[] args) throws InterruptedException {
		System.out.println("opening a chrome browser");
		String ChromeDriverPath = "C:\\Users\\AMANDEEP\\Desktop\\ChromeStandaloneSetup64";
		System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
		WebDriver driver = new ChromeDriver(); 
		
	//	driver.get("https://www.amazon.com");
	   driver.get("https://login.salesforce.com/");	//this line  launches the chrome driver instance  with specofied url
		driver.manage().window().maximize();// maximize the browser
		
		
		 WebElement userId = driver.findElement(By.xpath("//input[@id='username']"));
		  userId.sendKeys("aman");
		 
		
		Thread.sleep(3000);
		driver.quit();
	}

}
