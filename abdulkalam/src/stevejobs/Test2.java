package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","F:\\harsha\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		FirefoxDriver harsha=new FirefoxDriver();
		harsha.get("http://www.paytm.com");
		harsha.manage().window().maximize();
		int w=harsha.manage().window().getSize().getWidth();
		int h=harsha.manage().window().getSize().getHeight();
		System.out.println(w+" "+h);
		Dimension d=new Dimension(420,600);
		harsha.manage().window().setSize(d);
		Thread.sleep(6000);
		int x=harsha.manage().window().getPosition().getX();
		int y=harsha.manage().window().getPosition().getY();
		System.out.println(x+" "+y);
		Point p=new Point(500,250);
		harsha.manage().window().setPosition(p);
		Thread.sleep(7000);
		harsha.manage().window().maximize();

		
		
		

	}

}
