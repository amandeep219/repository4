package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("opening a chrome browser");
		String ChromeDriverPath = "C:\\Users\\AMANDEEP\\Desktop\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	   // maximize window
		driver.manage().window().maximize();
		
		//enter email
		WebElement userId = driver.findElement(By.name("email"));
		userId.sendKeys("khatkaramandeep@yahoo.com");
		
		//enter password
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("abcdef");
		
		
		//click login e
		WebElement loginButton = driver.findElement(By.id("u_0_a"));
		loginButton.click();
		
		// print title of the page
		System.out.println("Title of the page : "+driver.getTitle());
		
		WebElement nameOfUser = driver.findElement(By.className("_1vp5"));
		
		//print the name of user:
		System.out.println("name of the user is: "+nameOfUser.getText());
		
		
		Thread.sleep(2000);
		//click home button
		WebElement homeButton = driver.findElement(By.id("u_0_c"));
		homeButton.click();
		
        // click settings button
		WebElement settingsButton = driver.findElement(By.id("userNavigationLabel"));
		settingsButton.click();
		
		
		// click log out button
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement logOutButton = 	 wait.until(ExpectedConditions.elementToBeClickable(By.className("_54nc")));
		
		logOutButton.click();
		
	
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		//Thread.sleep(3000);
		//driver.quit();

	}

}
