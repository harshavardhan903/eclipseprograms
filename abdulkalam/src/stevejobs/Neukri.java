package stevejobs;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Neukri {

	public static void main(String[] args) throws Exception
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver(co);
		h.get("https://www.naukri.com/");
		h.manage().window().maximize();
		Thread.sleep(2000);
		h.switchTo().alert().accept();
		h.findElement(By.xpath("//*[@id='geoLocPopUp']/span[1]")).click();
		//h.findElement(By.xpath("//*[text()='Later']")).click();
		WebElement e=h.findElement(By.xpath("(//*[text()='Services'])[1]"));
		Actions a=new Actions(h);
		a.moveToElement(e).build().perform();
	

	}

}
