package VideoLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.leafground.com/pages/drop.html");
		//driver.get("http://www.leafground.com/pages/drag.html");
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("droppable");
		Actions action = new Actions(driver);
		action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		System.out.println("Movement completed");*/
	/*	WebElement drag1 = driver.findElementById("draggable");
		Actions action1 = new Actions(driver);
		int X = drag1.getLocation().getX();
		int Y =drag1.getLocation().getY();
		action1.dragAndDropBy(drag1, 50, 50).build().perform();*/
		
		WebElement from = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement to = driver.findElementByXPath("//ul[@id='sortable']/li[6]");
		Actions action = new Actions(driver);
		action.clickAndHold(to).moveToElement(from).release(from).build().perform();
		System.out.println("moved");
		
		
		
		
	}
}
