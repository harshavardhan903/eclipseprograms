package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movemouse 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver harsha=new ChromeDriver();
		harsha.get("http://www.flipkart.com");
		harsha.manage().window().maximize();
		harsha.findElement(By.xpath("//*[@id='container']/following::button[1]")).click();
		Thread.sleep(2000);
		WebElement e=harsha.findElement(By.xpath("//*[text()='Men']"));
		Actions a=new Actions(harsha);
		a.moveToElement(e).build().perform();
		Thread.sleep(5000);
		harsha.findElement(By.xpath("//*[text()='Shirts']")).click();
		Thread.sleep(5000);
	
	
		

	}

}
