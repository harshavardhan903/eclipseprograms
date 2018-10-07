package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		WebDriver h=new ChromeDriver();
		h.get("http://www.paytm.com");
		WebElement e1=h.findElement(By.xpath("//*[@type='search']"));
		String x=e1.getAttribute("placeholder");
		System.out.println(x);
		WebElement e2=h.findElement(By.xpath("//*[@data-reactid='47']"));
		String y=e2.getText();
		System.out.println(y);
		String w=e2.getTagName();
		System.out.println(w);
		WebElement e3=h.findElement(By.xpath("//*[@data-reactid='243']"));
		String z=e2.getCssValue("color");
		System.out.println(z);
	}
}
