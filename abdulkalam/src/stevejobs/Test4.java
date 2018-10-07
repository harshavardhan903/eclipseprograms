package stevejobs;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.print.DocFlavor.STRING;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("http://www.facebook.com");
		h.manage().window().maximize();
		h.findElement(By.name("email")).sendKeys("9949270745");
		h.findElement(By.name("pass")).sendKeys("kharsha903");
		WebElement e=h.findElement(By.xpath("//*[@id='day']"));
		Select s1=new Select(e);
		s1.selectByIndex(9);
		WebElement e2=h.findElement(By.xpath("//*[@id='month']"));
		Select s2=new Select(e2);
		s2.selectByIndex(11);
		
		WebElement e3=h.findElement(By.xpath("//*[@id='year']"));
		Select s3=new Select(e3);
		s3.selectByVisibleText("1998");
		
		h.findElement(By.xpath("//*[@id='u_0_a']")).click();
		
		WebElement e4=h.findElement(By.xpath("(//*[@class='img'])[1]"));
		int x=e4.getLocation().getX();
		int y=e4.getLocation().getY();
		int wi=e4.getSize().getWidth();
		int hi=e4.getSize().getHeight();
		
		File ss=h.getScreenshotAs(OutputType.FILE);
		BufferedImage full=ImageIO.read(ss);
		BufferedImage half=full.getSubimage(x, y, wi, hi);
		ImageIO.write(half, "png", ss);
		
		File dest=new File("facebook111.png");
		FileUtils.copyFile(ss, dest);
		List<WebElement> l=h.findElements(By.xpath("//input[@input='text']"));
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).isDisplayed())
			{
				int a=l.get(i).getLocation().getX();
				int b=l.get(i).getLocation().getY();
				int wd=l.get(i).getSize().getWidth();
				int he=l.get(i).getSize().getHeight();
				//get page screen
				File se=h.getScreenshotAs(OutputType.FILE);
				BufferedImage ff=ImageIO.read(se);
				BufferedImage srn=ff.getSubimage(a, b, wd, he);
				ImageIO.write(srn, "png", se);
				File dd=new File("text.png");
				FileUtils.copyFile(se, dd);
			}
		}
		
		
	}

}
