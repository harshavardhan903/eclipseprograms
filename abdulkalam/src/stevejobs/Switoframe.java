package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switoframe {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("http://www.jqueryui.com/checkboxradio");
		h.switchTo().frame(0);
		h.findElement(By.xpath("(//*[@for='radio-3'])/span")).click();
		h.manage().window().maximize();

	}

}
