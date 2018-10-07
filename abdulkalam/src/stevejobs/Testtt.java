package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testtt {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\harsha\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver h=new ChromeDriver();
		h.get("http://www.google.com");
	}

}
