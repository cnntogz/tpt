package tpt;
import java.io.IOException;

import net.zemberek.erisim.Zemberek;
import net.zemberek.tr.yapi.TurkiyeTurkcesi;

public class Init {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Zemberek z = new Zemberek(new TurkiyeTurkcesi());
	        
	       ReadFile.readerFolder();
	       String kelime= YanlisKelime.KelimeDenetim("çalýþmmak");
	       System.out.println(kelime + " kelimesi icin oneriler:");

	}

}
