package VideoLearning;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String parentWindow = driver.getWindowHandle();
		/*System.out.println(parentWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());*/
		driver.findElementByXPath("//div[@id='contentblock']/section/div[2]/div/div/button").click();
		Set<String> oldWindows = driver.getWindowHandles();
		Iterator<String> name = oldWindows.iterator();
		name.next();
		String secondwindow = name.next();
		String thirdWindow = name.next();
		driver.switchTo().window(thirdWindow);
		driver.close();
		/*int size = oldWindows.size();
		System.out.println(size);
		System.out.println(oldWindows);
		*/
		/*for (String childwindows : oldWindows) {
			if(!childwindows.equals(parentWindow))
				driver.switchTo().window(childwindows);
			
		}
		driver.close();	*/
		}
		
	

	}

