package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver harsha=new ChromeDriver();
		harsha.get("http://www.gmail.com");
		try
		{
			if(harsha.findElement(By.name("id")).isDisplayed())
			{
				System.out.println("email id displayed in page");
			}
			else
			{
				System.out.println("email id is not displayed");
			}
		}
catch(Exception ex)
		{
		System.out.println("wrong password");
		}
	}

}
