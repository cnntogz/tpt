package tpt;


import net.zemberek.erisim.Zemberek;
import net.zemberek.tr.yapi.TurkiyeTurkcesi;
import document.AsciiToTurkish;

public class YanlisKelime {
	/* 
	 * Burada Ascii hatalarý dýþýnda kelime hatalarý düzeltilir eger hata 
	 * Ascii hatasý ise düzeltmez
	 * */
	
	public static String KelimeDenetim(String kelime){
	 Zemberek zemberek = new Zemberek(new TurkiyeTurkcesi());
	  if (!zemberek.kelimeDenetle(kelime)) {
    	  String[] klmDizi=zemberek.oner(kelime);
    	  
    	  for(int i=0;i<klmDizi.length;i++){
    		  if(AsciiToTurkish.AsciiToTurkish(kelime).equals(klmDizi[i])){
    			  return kelime;
    		  }
    	  }
    	  return klmDizi[0];
      }
      return kelime;
	}
}

