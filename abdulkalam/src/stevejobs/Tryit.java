package stevejobs;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tryit 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver harsha=new ChromeDriver();
		harsha.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		harsha.manage().window().maximize();
		harsha.switchTo().frame("iframeResult");
		harsha.findElement(By.xpath("//*[text()='Try it']")).click();
		Thread.sleep(2000);
		String xe=harsha.switchTo().alert().getText();
		System.out.println(xe);
		harsha.switchTo().alert().dismiss();
		harsha.switchTo().defaultContent();
		WebElement e=harsha.findElement(By.xpath("//*[@class='CodeMirror-lines']/child::*"));
		int x=e.getLocation().getX();
		int y=e.getLocation().getY();
		int w=e.getSize().getWidth();
		int h=e.getSize().getHeight();
		File se=harsha.getScreenshotAs(OutputType.FILE);
		BufferedImage full=ImageIO.read(se);
		BufferedImage prgrm=full.getSubimage(x, y, w, h);
		ImageIO.write(prgrm,"png",se);
		File dest=new File("prgrm1.png");
		FileUtils.copyFile(se, dest);
		
	}

}
