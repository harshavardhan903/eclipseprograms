package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver harsha=new ChromeDriver();
		harsha.get("http://jqueryui.com/slider/");
		harsha.manage().window().maximize();
		//switch to frame
		//harsha.switchTo().frame(0);
		//WebElement e1=harsha.findElement(By.id("draggable"));
		//WebElement e2=harsha.findElement(By.id("droppable"));
		//Actions a=new Actions(harsha);
		//Thread.sleep(5000);
		//a.dragAndDrop(e1, e2).build().perform();
		//JavascriptExecutor js=harsha;
		//js.executeScript("arguments[0].style.border='3px blue double';",e2);
		//back to page and click slider
		//harsha.switchTo().defaultContent();
		//harsha.findElement(By.xpath("//*[text()='Slider']")).click();
		//switch to frame
		harsha.switchTo().frame(0);
		WebElement e1=harsha.findElement(By.xpath("//*[@id='slider']/span"));
		Actions a=new Actions(harsha);
		a.dragAndDropBy(e1, 300, 0).build().perform();
		Thread.sleep(5000);
		a.dragAndDropBy(e1, -250, 0).build().perform();
		//back to back and click vertical slider
		harsha.switchTo().defaultContent();
		harsha.findElement(By.linkText("Vertical slider")).click();
		harsha.switchTo().frame(0);
		WebElement e2=harsha.findElement(By.xpath("//*[@id='slider-vertical']/span"));
		a.dragAndDropBy(e2,100,0).build().perform();
		Thread.sleep(5000);
		a.dragAndDropBy(e2,-100,0).build().perform();
		Thread.sleep(5000);
		harsha.switchTo().defaultContent();
		harsha.close();
		
		
	
		

	}
}