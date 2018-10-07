package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("http://www.way2sms.com");
		h.findElement(By.partialLinkText("Business")).click();
		try
		{
			WebElement e=h.findElement(By.xpath("//*[@id='staticLogin1']"));
			if(e.isDisplayed())
			{
				System.out.println("display");
				if(e.isEnabled())
				{
					System.out.println("enable");
					if(e.isSelected())
					{
						System.out.println("select");
					}
					else
					{
						System.out.println("notdisplay");
					}	
				}
				else
				{
					System.out.println("dis");
				}
			}
			else
			{
				System.out.println("hid");
			}	
		}		
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}	
		

	}

}
