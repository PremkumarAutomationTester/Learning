package VideoLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWExamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[contains(text(),'Alert Box')]").click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Alert is accepted");
		Thread.sleep(3000);
		
		driver.findElementByXPath("//button[contains(text(),'Confirm Box')]").click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		WebElement text = driver.findElementById("result");
		String text1 = text.getText();
		if (!(text1.equals("You pressed O"))) {
			System.out.println("issue");
		}
		else
		System.out.println(text1);
				
	
	WebElement info = driver.findElementByXPath("//button[contains(text(),'Prompt Box')]");
	info.click();
	Thread.sleep(3000);
	Alert prompt = driver.switchTo().alert();
	prompt.sendKeys("Learning");
	Thread.sleep(2000);
	prompt.accept();
	
	driver.findElementByXPath("//button[contains(text(),'Line Breaks?')]").click();
	Alert alert =  driver.switchTo().alert();
String message = alert.getText();
alert.dismiss();
System.out.println(message);
	}
	
}
