package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Voicegoogle 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter msg");
		String x=sc.nextLine();
		//launch site
		ChromeOptions co=new ChromeOptions();
		co.addArguments("use-fake-ui-for-media-stream=1");		
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver(co);
		h.get("http://www.google.co.in");
	
		
		WebDriverWait w=new WebDriverWait(h, 10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		h.manage().window().maximize();
		h.findElement(By.id("gsri_ok0")).click();
		Thread.sleep(4000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("gsri_ok0")));
		System.setProperty("mbrola.base", "F:\\harsha\\mbrola");
		VoiceManager vm=VoiceManager.getInstance();
		Voice v=vm.getVoice("mbrola_us1");
		v.allocate();
		v.speak(x);
		v.deallocate();

	}

}
