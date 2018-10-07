package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook2 {

	public static void main(String[] args) throws Exception 
	{
		//for enter message purpose
		Scanner sc=new Scanner(System.in);
		System.out.println("name");
		String a=sc.nextLine();
		//disable notifications
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver(co);
		h.get("http://www.facebook.com");
		h.manage().window().maximize();
		//for login
		h.findElement(By.className("inputtext")).sendKeys("9949270745");
		h.findElement(By.id("pass")).sendKeys("kharsha903");
		h.findElement(By.xpath("//*[@value='Log In']")).click();
		Thread.sleep(3000);
		//searching purpose
		h.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys("sandeep maneti");
		Thread.sleep(3000);
		h.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys(Keys.ENTER);
		//here a means enter msg in text-box
		h.switchTo().activeElement().sendKeys(a);
		Thread.sleep(3000);
		//for emoji selection
		h.findElement(By.xpath("//*[@class='_6gb _6wm4 _3oxr _6jtr']")).click();
		Thread.sleep(3000);
		h.findElement(By.xpath("//*[@class='_4pia _6f3k']/table/tbody/tr[1]/td[1]/div/div")).click();
		h.findElement(By.xpath("(//*[@aria-label='Pick Emoji 👍'])[2]")).click();
		h.findElement(By.xpath("(//*[@aria-label='Pick Emoji 👍'])[2]")).click();
		//for send
		h.findElement(By.xpath("//*[@label='send']")).click();
		

	}

}
