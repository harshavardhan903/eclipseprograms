package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL {

	public static void main(String[] args) 
	{
		DesiredCapabilities dd=DesiredCapabilities.chrome();
		dd.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("https://cacert.org/");

	}

}
