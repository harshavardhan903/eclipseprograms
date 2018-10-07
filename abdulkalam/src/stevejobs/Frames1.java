package stevejobs;



import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.abhibus.com");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//*[starts-with(@alt,'Ganesh Chaturthi Sale')]"));
		int x=e.getLocation().getX();
		int y=e.getLocation().getY();
		int w=e.getSize().getWidth();
		int h=e.getSize().getHeight();
		File ss=driver.getScreenshotAs(OutputType.FILE);
		BufferedImage fullimg=ImageIO.read(ss);
		BufferedImage eless=fullimg.getSubimage(x, y, w, h);
		ImageIO.write(eless, "png", ss);
		File dest=new File("mypic2.png");
		FileUtils.copyFile(ss, dest);
		
		
		
		
		
	}

}
