package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Opera {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser name");
		String x=sc.nextLine();
		WebDriver driver = null;
		if(x.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(x.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","F:\\harsha\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();		
		}
		else
		{
			System.out.println("unknown browser");
			System.exit(0);
		}
		driver.get("http://www.gmail.com");
	

	}
	
}