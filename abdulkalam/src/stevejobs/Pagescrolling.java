package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pagescrolling {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("https://semantic-ui.com/modules/dropdown.html");
		h.manage().window().maximize();
		h.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(3000);
		h.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		h.executeScript("alert('hiii,/nhello,/ngive me bdd');");
		h.switchTo().alert().dismiss();
		WebElement e=h.findElement(By.xpath("(//*[text()='Multiple Selection'])[2]"));
		JavascriptExecutor js=(JavascriptExecutor)h;
		js.executeScript("arguments[0].scrollIntoView();",e);
		//Thread.sleep(5000);
		

	}

}
