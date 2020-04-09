package VideoLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ButtonLearning {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Position of the button
		/*WebElement position = driver.findElement(By.id("position"));
		Point location = position.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("The x value is :"+ x);
		System.out.println("The y value is :"+y);*/
		
		// color of the button
		/*WebElement button = driver.findElement(By.id("color"));
		String color = button.getCssValue("background-color");
		System.out.println("The Color is: " + color);*/
		
		// height & weight
		
		WebElement button = driver.findElement(By.id("size"));
		int height = button.getSize().getHeight();
		int width = button.getSize().getWidth();
		System.out.println("the height is "+height);
		System.out.println("the width is " +width);;

	}

}
