package stevejobs;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Vlc {

	public static void main(String[] args) throws Exception 
	{
		Runtime.getRuntime().exec("C:\\Program Files\\VideoLAN\\VLC\\vlc.exe");
		Thread.sleep(2000);
		Robot r=new Robot();
		for(int i=1;i<=3;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		for(int j=1;j<=4;j++)
		{	
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		
		
	}
}