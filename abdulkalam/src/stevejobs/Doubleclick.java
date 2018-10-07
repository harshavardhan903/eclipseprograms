package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver harsha=new ChromeDriver();
		harsha.get("https://www.seleniumhq.org");
		harsha.manage().window().maximize();
		WebElement e=harsha.findElement(By.xpath("//*[text()='Download']"));
		Actions a=new Actions(harsha);
		a.moveToElement(e).build().perform();
		a.doubleClick().build().perform();
		a.contextClick().build().perform();

	}

}
