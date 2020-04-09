package VideoLearning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLearning {
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
	/*ChromeOptions chromoption = new ChromeOptions();
	chromoption.addArguments("--Start Maximize--");*/
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://www.leafground.com/pages/Image.html");
	WebElement broken = driver.findElementByXPath("//div[@id='contentblock']/section/div[2]/div/div/img");
	if (broken.getAttribute("naturalWidth").equals("0")) {
		System.out.println("The image is Broken");
		
	}
}
}
