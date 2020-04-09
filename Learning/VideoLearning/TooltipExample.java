package VideoLearning;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.leafground.com/pages/tooltip.html");
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/*WebElement tooltip = driver.findElementById("age");
		String name = tooltip.getAttribute("title");
		System.out.println(name);*/
		List<WebElement> selectable = driver.findElementsByXPath("//ol[@id='selectable']/li");
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL)	
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2))
		.click(selectable.get(3))
		.build().perform();

	}

}
