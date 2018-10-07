package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("http://www.paytm.com");
		h.manage().window().maximize();
		Thread.sleep(3000);
		h.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		WebElement e=h.findElement(By.xpath("//*[@type='tel']"));
		h.executeScript("arguments[0].scrollIntoView();",e);
		
	}

}
