package VideoLearning;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxLearning {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		/*ChromeOptions chromoption = new ChromeOptions();
		chromoption.addArguments("--Start Maximize--");*/
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
		driver.findElementByXPath("//div[@id='contentblock']/section/div/div[2]/input").click();
		Thread.sleep(2000);
		WebElement checked = driver.findElementByXPath("//div[@id='contentblock']/section/div[2]/div/input");
	if (checked.isSelected())
	{
		System.out.println("It is already selected");
	}
	else
	{
		checked.click();
	}
		/*boolean status = checked.isSelected();
		System.out.println(status);*/
	
	List<WebElement> selectAlloptions = driver.findElementsByXPath("//input[@type='checkbox']");
	for (WebElement webElement : selectAlloptions) {
		if(!(webElement.isSelected()))
		{
			webElement.click();
		}
	}
		
	}

}
