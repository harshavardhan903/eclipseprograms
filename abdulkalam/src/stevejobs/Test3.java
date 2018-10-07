package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test3 
{

	public static void main(String[] args) throws Exception 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		//driver.switchTo().frame("google_shimpl");
		driver.findElement(By.xpath("//*[@id='src']")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//*[@id='dest']")).sendKeys("tadipatri");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='rb-calendar']/table/tbody/tr[3]/td[3]")).click();
		
		

	}

}
