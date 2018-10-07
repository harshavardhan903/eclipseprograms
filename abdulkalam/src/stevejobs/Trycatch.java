package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trycatch 
{
	public static void main(String[] args) 
	{
		//launch site
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("http://www.way2sms.com");
		try
		{
			if(h.findElement(By.xpath("//*[@type='text']")).isDisplayed())
			{
				System.out.println("name displayed");
			}
			else
			{
				System.out.println("name not displayed");
			}
		}	
		catch(Exception ex)
		{
			System.out.println("wrong locator");
		}
	}	
}
