package VideoLearning;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/download.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@class='container']/div[2]/a").click();
		Thread.sleep(3000);
		//driver.findElementByLinkText("http://www.leafground.com/testleaf.xlsx").click();
		File file = new File("C:\\Users");
		File[] file1 = file.listFiles();
		for (File file2 : file1) {
			if (file2.getName().equals("testleaf(4).xlsx"))
			{
				System.out.println("the File is downloaded");
			}
				
			}
			
		}
		
	}


