package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter gmail id");
		String x=sc.nextLine();
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver harsha=new ChromeDriver();
		harsha.get("http://www.gmail.com");
		harsha.findElement(By.name("identifier")).sendKeys("lovelyharsha903");
		harsha.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		harsha.findElement(By.name("password")).sendKeys("kovvuruharsha@");
		harsha.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		harsha.findElement(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		harsha.manage().window().maximize();
		harsha.findElement(By.name("to")).sendKeys(x);
		harsha.findElement(By.name("subjectbox")).sendKeys("wishes");
		harsha.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("Hi ,\nHow r u?,\nwhr r u!");
		harsha.findElement(By.xpath("//*[@class='bBe']")).click();
		Thread.sleep(5000);
		harsha.findElement(By.xpath("//*[@aria-label='Send ‪(Ctrl-Enter)‬']")).click();
		harsha.findElement(By.xpath("//*[contains(@aria-label,'Google Account')]/span ")).click();
		Thread.sleep(5000);
		harsha.findElement(By.xpath("//*[text()='Sign out']")).click();
		Thread.sleep(5000);
		
		
		
		
		

		
	

	}

}
