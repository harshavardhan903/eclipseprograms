package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.speech.freetts.en.us.FeatureProcessors.SylOut;

public class Cssvalues {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebElement w=driver.findElement(By.xpath("//*[text()='Images']"));
		String a=w.getCssValue("opacity");
		String b=w.getCssValue("text-decoration");
		Actions a1=new Actions(driver);
		a1.moveToElement(w).build().perform();
		String cc=w.getCssValue("opacity");
		String bb=w.getCssValue("text-decoration");
		System.out.println(a+"   "+cc);
		System.out.println(b+"   "+bb);

	}

}
