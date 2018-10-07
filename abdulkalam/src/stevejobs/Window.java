package stevejobs;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("http://www.sentia.in");
		h.manage().window().maximize();
		h.findElement(By.xpath("(//*[@class='img-responsive'])[3]")).click();
		h.findElement(By.xpath("(//*[@id='payol'])[1]/a")).click();
		Thread.sleep(5000);
		ArrayList<String> a=new ArrayList<String>(h.getWindowHandles());
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		h.switchTo().window(a.get(1));
		Thread.sleep(5000);
		h.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("9949270745");
		
	}

}
