package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cacherequired {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("http://www.google.co.in");
		h.manage().window().maximize();
		h.findElement(By.name("q")).sendKeys("isro");
		Thread.sleep(5000);
		List<WebElement> l=h.findElements(By.xpath("//*[@role='listbox']/li"));
		int cs=l.size()-2;
		Actions a=new Actions(h);
		for(int i=1;i<=cs;i++)
		{	
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(5000);
			String x=h.findElement(By.name("q")).getAttribute("value");
			System.out.println(x);
			if(x.equalsIgnoreCase("isro wiki"))
			{
				a.sendKeys(Keys.ENTER).build().perform();
			}	
		}
	}
}
