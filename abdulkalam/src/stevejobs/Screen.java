package stevejobs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\harsha\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("http://www.mercurytravels.co.in");
		List<WebElement> l=h.findElements(By.xpath("//input[@type='text']"));
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).isDisplayed())
			{
				int x=l.get(i).getLocation().getX();
				int y=l.get(i).getLocation().getY();
				int w=l.get(i).getSize().getWidth();
				int he=l.get(i).getSize().getHeight();
				File ss=h.getScreenshotAs(OutputType.FILE);
				BufferedImage full=ImageIO.read(ss);
				BufferedImage ele=full.getSubimage(x, y, w, he);
				ImageIO.write(ele, "png", ss);
				File dest=new File("pic"+i+".png");
				FileUtils.copyFile(ss, dest);
			}
		}
	}

}
