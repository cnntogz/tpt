package tpt;

import document.AsciiToTurkish;
import net.zemberek.erisim.Zemberek;
import net.zemberek.tr.yapi.TurkiyeTurkcesi;

/*
 * Eðer kelime hatasý Ascii hatasý ise düzeltir diger hatalarý düzeltmez
 * */

public class Ascii {
	public static String ascii(String kelime){
		Zemberek zemberek = new Zemberek(new TurkiyeTurkcesi());
		  // test
	      if (!zemberek.kelimeDenetle(kelime)) {
	    	  String[] klmDizi=zemberek.oner(kelime);
	    	  
	    	  for(int i=0;i<klmDizi.length;i++){
	    		  if(AsciiToTurkish.AsciiToTurkish(kelime).equals(klmDizi[i])){
	    			  return AsciiToTurkish.AsciiToTurkish(kelime);
	    		  }
	    	  }
	      }
	      return kelime;
	}

}
