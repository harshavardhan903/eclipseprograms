package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AngularJs {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter text");
		String x=sc.nextLine();
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("https://angularjs.org");
		WebDriverWait ww=new WebDriverWait(h,10);
		ww.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ng-model='yourName']")));
		h.manage().window().maximize();
		h.findElement(By.xpath("//*[@ng-model='yourName']")).sendKeys(x);
		ww.until(ExpectedConditions.textToBePresentInElement(By.xpath("(//*[starts-with(text(),'Hello')])[2]"), "Hello "+x+"!"));
		h.findElement(By.xpath("(//*[@ng-click='plnkr.open($event)'])[1]")).click();
		
	}

}
