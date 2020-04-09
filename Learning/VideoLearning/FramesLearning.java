package VideoLearning;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesLearning {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement text = driver.findElementById("Click");
		text.click();
		String textName = text.getText();
		System.out.println(textName);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement text1 = driver.findElementById("Click1");
		text1.click();
		
		driver.switchTo().defaultContent();
		List<WebElement> framesCount = driver.findElementsByTagName("iframe");
		int size = framesCount.size();
		System.out.println(size);
	}

}
