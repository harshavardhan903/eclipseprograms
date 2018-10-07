package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		WebDriver h=new ChromeDriver();
		h.get("http://www.way2sms.com");
		String a=h.getCurrentUrl();
		System.out.println(a);
		String b=h.getPageSource();
		System.out.println(b);
		String c=h.getTitle();
		System.out.println(c);
		WebElement e1=h.findElement(By.name("mobileNo"));
		String x=e1.getAttribute("class");
		System.out.println(x);
		WebElement e2=h.findElement(By.xpath("//*[@class='active']"));
		String y=e2.getText();
		System.out.println(y);
		String z=e2.getCssValue("font-size");
		System.out.println(z);
	}

}
