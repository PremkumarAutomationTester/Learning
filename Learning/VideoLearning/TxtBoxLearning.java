package VideoLearning;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TxtBoxLearning {

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("dprem7@gmail.com");
		
		driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div/div/input").sendKeys("value");
		
		WebElement text = driver.findElementByXPath("//*[@id='contentblock']/section/div[3]/div/div/input");
		String textName = text.getAttribute("value");
		System.out.println(textName);
		
		WebElement clear = driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/div/div/input");
		clear.clear();
		System.out.println("content Cleared");
		
		WebElement enable = driver.findElementByXPath("//*[@id='contentblock']/section/div[5]/div/div/input");
		Boolean buttonEnable = enable.isEnabled();
		System.out.println("Textbox is enabled"+buttonEnable);	
		
	
		//Taking Snapshot using TakesScreenshot interface
	/*TakesScreenshot screenShot = (TakesScreenshot)driver;
	File destination = screenShot.getScreenshotAs(OutputType.FILE);
	File source = new File("D://Learning//sample.png");
	//FileHandler.copy(destination, source);
	FileUtils.copyFile(destination,source );*/
		
		//using robot Class for taking snapshot
		Robot robot = new Robot();
		Dimension dimen =  Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(dimen);
		BufferedImage source = robot.createScreenCapture(rect);
		File destination = new File("D://Learning//robot.png");
		ImageIO.write(source, "png", destination);
	
	}
	
}
