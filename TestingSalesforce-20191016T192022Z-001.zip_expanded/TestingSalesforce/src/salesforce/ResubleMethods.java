package salesforce;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
public class ResubleMethods {
		static WebDriver driver;
		static ExtentTest logger;
		static ExtentReports report;
		
		{
		report = new ExtentReports("C:\\Users\\aman khatkar\\Desktop\\extreport.html",true);
		String path = "C:\\Users\\aman khatkar\\Desktop\\extreport.html";
		report = new ExtentReports(path);
//		logger = report.startTest("Starts salesforce application");
		}
		
		public static ExtentTest CreateTestScriptReport(String TestScriptName) {
			logger = report.startTest(TestScriptName);
			return logger;
		}

		/* name of the method:   Intialize browser
		 * BriefDescription  :   browser intialization
		 *  created date     :08/08/19 
		 *  LastModified Date:08/08/19           
		 */
	public static void initialize_driver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aman khatkar\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	/* name of the method:   lunch browser
	 * BriefDescription  :   lunching browser
	 *  created date     :08/08/19 
	 *  LastModified Date:08/08/19           
	 */
	public static void launchUrl(String URL)
	{
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	public static void enterText(WebElement obj,String textval,String objName) throws InterruptedException

	{
		if(obj.isDisplayed())
		{
			Thread.sleep(4000);
			obj.sendKeys(textval);
			System.out.println("pass: "+textval+"value is entered in "+objName+"field");
				
		}
		else
		{
			System.out.println("fail:" +objName+ "field does not exist please check application");
			
		}
	}
	
	/* name of the method:   clickobject--->Button
	 * BriefDescription  :   clicking a button
	 * Arguments         :  obj-->object,objName--->object name
	 *  createdby        :  Automation team 
	 *  created date     :08/08/19 
	 *  LastModified Date:08/08/19         
	 */
	public static void clickObj(WebElement obj,String objName)
	{
		if(obj.isDisplayed())
		{
			obj.click();
			System.out.println("pass :" +objName + "button is clicked");
					}
		else
		{
			System.out.println("Fail:" +objName+"button is not displayed ,please check the application");
			
		}
	}
	
	public static String[][] readXlData(String path, String string) throws IOException{
		FileInputStream fs=new FileInputStream(new File(path));
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum()+1;
		int colCount=sheet.getRow(0).getLastCellNum();
		String[][] data=new String[rowCount][colCount];
		for(int i=0;i<rowCount;i++){
			for(int j=0;j<colCount;j++){
				int cellType=sheet.getRow(i).getCell(j).getCellType();
				if(cellType==HSSFCell.CELL_TYPE_NUMERIC){
					int val=(int)sheet.getRow(i).getCell(j).getNumericCellValue();
					data[i][j]=String.valueOf(val);
				}
				else
					data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
					
			}
		}
		return (data);
	}
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
	
	
	// check if the checkbox is selected or not
		public static void check_if_selected(WebElement obj, String objName){  
			if(obj.isSelected()){
				System.out.println("Pass " + objName+ "is selected");
			    }else{
				System.out.println("Fail " + objName+ "is not selected");
			    }
		}
		// select the box
		public static void select_check(WebElement obj, String objName){  
			if(obj.isSelected()){
				System.out.println("Pass " + objName+ "is selected");
			    }else{
			    	obj.click();
				System.out.println("Was not selected,  " + objName+ " now selected");
			    }
		}
		
		//giving sleep time and printing on the console sleep info after sleep
		public static void sleep(int time) throws InterruptedException{
			Thread.sleep(time);
			System.out.println("you sleep " + time + " millisecond");
		}
		
		public static void close_driver() throws InterruptedException{
			driver.close();
			System.out.println("driver is closed");
		}

}
	

