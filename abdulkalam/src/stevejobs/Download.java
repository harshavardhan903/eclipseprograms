package stevejobs;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Download {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("http://sensongsmp3.net/teluguwap-songs/");
		h.manage().window().maximize();
		List <WebElement> l=h.findElements(By.xpath("//*[@class='lttplist']/li/a"));
		Actions a=new Actions(h);
		a.click(l.get(13)).build().perform();
		h.findElement(By.xpath("(//*[contains(text(),'Download')])[11]")).click();
		h.findElement(By.xpath("//*[text()='Download | డౌన్లోడ్']")).click();
		
		
		

	}

}
