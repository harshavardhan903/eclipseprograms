package stevejobs;

import java.util.Scanner;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Voiceus_1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter text");
		String x=sc.nextLine();
		//convert into voice
		System.setProperty("mbrola.base", "F:\\harsha\\mbrola");
		VoiceManager vm=VoiceManager.getInstance();
		Voice v=vm.getVoice("mbrola_us1");
		v.allocate();
		v.speak(x);
		v.deallocate();


	}

}
