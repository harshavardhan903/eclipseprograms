package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver harsha=new ChromeDriver();
		harsha.get("http://www.gmail.com");
		harsha.findElement(By.name("identifier")).sendKeys("lovelyharsha903");
		harsha.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		harsha.findElement(By.name("password")).sendKeys("903kharsha");
		harsha.findElement(By.xpath("//*[text()='Next']")).click();
		harsha.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> rl=harsha.findElements(By.xpath("(//table)[4]/tbody/tr"));
		int x=rl.size();
		System.out.println(x);
		List<WebElement> cl=rl.get(0).findElements(By.tagName("td"));
		int y=cl.size();
		System.out.println(y);

	}

}
