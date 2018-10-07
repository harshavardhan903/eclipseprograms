package stevejobs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activeele {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("http://www.way2sms.com");
		h.switchTo().activeElement().sendKeys("9949270745",Keys.TAB,"harsha");
		h.manage().window().maximize();
		int w=h.manage().window().getSize().getWidth();
		int he=h.manage().window().getSize().getHeight();
		System.out.println(w+" "+he);
		Dimension d=new Dimension(600,400);
		h.manage().window().setSize(d);
		Thread.sleep(6000);
		int x=h.manage().window().getPosition().getX();
		int y=h.manage().window().getPosition().getY();
		System.out.println(x+" "+y);
		Point p=new Point(500,250);
		h.manage().window().setPosition(p);
		Thread.sleep(10000);
		h.manage().window().maximize();
		
		

	}

}
