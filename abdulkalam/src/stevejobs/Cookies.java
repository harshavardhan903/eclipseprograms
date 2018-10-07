package stevejobs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\harsha\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.manage().deleteAllCookies();
		h.get("http://www.abhibus.com");
		h.manage().window().maximize();
		if(h.manage().getCookies().size()!=0)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		//get text
		String x=h.getTitle();
		System.out.println(x);
		//get current url
		String y=h.getCurrentUrl();
		System.out.println(y);
		//get pagesource
		String z=h.getPageSource();
		System.out.println(z);
		//get attribute
		WebElement e=h.findElement(By.name("source"));
		String a=e.getAttribute("class");
		System.out.println(a);
		//get text
		String b=e.getAttribute("value");
		System.out.println(b);
		//getcss value
		String c=e.getCssValue("color");
		System.out.println(c);
		WebElement e1=h.findElement(By.xpath("//*[@class='wrap']"));
		int o=e1.getLocation().getX();
		int p=e1.getLocation().getY();
		int we=e1.getSize().getWidth();
		int he=e1.getSize().getHeight();
		File ss=h.getScreenshotAs(OutputType.FILE);
		BufferedImage full=ImageIO.read(ss);
		BufferedImage elesc=full.getSubimage(o,p,we,he);
		ImageIO.write(elesc, "png", ss);
		File dest=new File("mypic123.png");
		FileUtils.copyFile(ss, dest);
		
	}

}
