package stevejobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getpagesource 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.paytm.com");
		String y=driver.getPageSource();
		System.out.println(y);
		String z=driver.getCurrentUrl();
		if(z.contains("https"))
		{
			System.out.println("site is secure");
		}
		else
		{
			System.out.println("site is not secure");
		}


	}

}
