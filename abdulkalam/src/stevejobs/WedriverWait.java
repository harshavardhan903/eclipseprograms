package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WedriverWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		h.manage().window().maximize();
		h.findElement(By.xpath("//*[@class='rcMainTable']/tbody/tr[3]/td[1]")).click();

	}

}
