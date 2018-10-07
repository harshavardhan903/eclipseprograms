package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Multiselect 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver harsha=new ChromeDriver();
		harsha.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		harsha.manage().window().maximize();
		WebElement e=harsha.findElement(By.xpath("//*[@name='iframeResult']"));
		harsha.switchTo().frame(e);
		WebElement e1=harsha.findElement(By.name("cars"));
		Select s=new Select(e1);
		if(s.isMultiple())
		{
			System.out.println("multi select");
		}
		else
		{
			System.out.println("single select");
		}
		//size of dropdown
		List<WebElement> l=s.getOptions();
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
		}
		//select 4th & 1st one in dropdown
		Actions a=new Actions(harsha);
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(3)).click(s.getOptions().get(0)).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		//get and display all selected items
		List<WebElement> sl=s.getAllSelectedOptions();
		for(int x=0;x<sl.size();x++)
		{
			System.out.println(sl.get(x).getText());
		}
		//deselected those selected items
		s.deselectByVisibleText("Audi");
		Thread.sleep(5000);
		s.deselectByVisibleText("Volvo");
		Thread.sleep(5000);
	}

}