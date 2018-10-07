package stevejobs;

import java.util.Scanner;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Voice1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter text");
		String x=sc.nextLine();
		VoiceManager vm=VoiceManager.getInstance();
		Voice v=vm.getVoice("kevin");
		v.allocate();
		v.speak(x);
		v.deallocate();

	}

}
