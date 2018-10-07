package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myprgm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//*[@alt='Nokia 6.1 Plus (White, 64 GB)']")).click();
		driver.switchTo().activeElement().sendKeys("lovelyharsha903@gmail.com");
		

	}

}
