package stevejobs;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver eh=new ChromeDriver();
		eh.get("http://www.google.co.in");
		Thread.sleep(5000);
		WebElement e=eh.findElement(By.xpath("(//*[@aria-label='Gmail'])[2]"));
		int x=e.getLocation().getX();
		int y=e.getLocation().getY();
		int w=e.getSize().getWidth();
		int h=e.getSize().getHeight();
		File ss=eh.getScreenshotAs(OutputType.FILE);
		BufferedImage fullimg=ImageIO.read(ss);
		BufferedImage elescreen=fullimg.getSubimage(x, y, w, h);
		ImageIO.write(elescreen, "png", ss);
		File dest=new File("myele22.png");
		FileUtils.copyFile(ss, dest);
		
		

	}

}
