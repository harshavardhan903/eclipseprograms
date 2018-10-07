package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("http://www.mercurytravels.co.in/");
		Thread.sleep(5000);
		h.findElement(By.partialLinkText("Flights")).click();
		try
		{
			WebElement e=h.findElement(By.name("tripType"));
			if(e.isDisplayed())
			{
				System.out.println("displayed");
				if(e.isEnabled())
				{
					System.out.println("enabled");
					if(e.isSelected())
					{
						System.out.println("selected");
					}
					else
					{
						System.out.println("not selected");
					}
				}
				else
				{
					System.out.println("disabeld");
				}
			}
			else
			{
				System.out.println("hidden");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}	
				
	}	
	
}
