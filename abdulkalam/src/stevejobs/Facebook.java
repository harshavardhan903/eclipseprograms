package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Facebook {

	public static void main(String[] args) throws Exception 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver(co);
		h.get("http://www.facebook.com");
		h.manage().window().maximize();
		h.findElement(By.className("inputtext")).sendKeys("9949270745");
		h.findElement(By.id("pass")).sendKeys("kharsha903");
		h.findElement(By.xpath("//*[@value='Log In']")).click();
		h.findElement(By.linkText("Messenger")).click();
		Thread.sleep(5000);
		List<WebElement> l=h.findElements(By.xpath("//*[@aria-label='Conversation list']/li"));
		System.out.println("no.of elements is "+l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
		}
		l.get(2).click();
		h.findElement(By.xpath("(//div[@role='presentation'])[2]")).click();
		h.switchTo().activeElement().sendKeys("hi",Keys.chord(Keys.SHIFT,Keys.ENTER,"hloo"),Keys.chord(Keys.SHIFT,Keys.ENTER,"whr r u"));
		h.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(3000);
		WebElement e=h.findElement(By.xpath("//*[@title='Choose an emoji']"));
		e.click();
		Thread.sleep(3000);
		h.findElement(By.xpath("(//table)[2]/tbody/tr[4]/td[3]")).click();
		Thread.sleep(3000);
		h.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		h.findElement(By.xpath("(//*[@role='combobox'])[2]")).sendKeys("wht r u doing!");
		Thread.sleep(5000);
		h.findElement(By.xpath("//*[text()='Send']")).click();
		
		Thread.sleep(5000);
		h.findElement(By.xpath("//*[@id='logoutMenu']/a")).click();
		h.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		
	}

}
