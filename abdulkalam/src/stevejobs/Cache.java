package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cache {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver harsha=new ChromeDriver();
		harsha.get("http://www.google.co.in");
		harsha.manage().window().maximize();
		WebElement e=harsha.findElement(By.name("q"));
		e.sendKeys("face");
		Actions a=new Actions(harsha);
		for(int i=1;i<=7;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			a.pause(5000).build().perform();
		}
		JavascriptExecutor js=harsha;
		js.executeScript("arguments[0].style.border='3px blue dotted';",e);
		js.executeScript("arguments[0].setAttribute('disabled','true');",e);

	}

}
