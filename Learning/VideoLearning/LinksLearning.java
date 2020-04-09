package VideoLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinksLearning {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		/*ChromeOptions chromoption = new ChromeOptions();
		chromoption.addArguments("--Start Maximize--");*/
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//to click the link
		/*
		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div/div/div/a").click();
		driver.navigate().back();
		//Thread.sleep(2000);\
*/		
		
		//Find where am supposed to go without clicking me?
		WebElement where = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div/div/div/a");
		String togo = where.getAttribute("href");
		System.out.println(togo);
		
		List<WebElement> tags = driver.findElementsByTagName("a");
		int size = tags.size();
		System.out.println("The tag names are :"+size);
		//List<WebElement> tag1 = driver.findElementsByTagName("href");
		for (WebElement webElement : tags) {
			String names = webElement.getAttribute("href");
			System.out.println(names);
			
		}
		
		
		
		
		
		
	}	 
			}


