package day33_stringBuilder;

public class C07_Yarisma {

	public static void main(String[] args) {
		/*
		 * Soru : For loop ile 1000 defa bir islem yapalim. 
		 * Oncesinde ve sonrasinda zamani kontrol edip StringBuilder ve String class’larinin performanslarini karsilastiralim. 
		 *   
		 * Ipucu: long TimeSb = System.nanoTime(); kullanalim
		 */
		
		@SuppressWarnings("unused")
		String str = "Merhaba";
		StringBuilder sb = new StringBuilder("Merhaba");
		sb.trimToSize(); 		//capacity'i length boyutuna indirir
		
		long time1 = System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			str+=" ";
		}
		
		long time2 = System.nanoTime();
		
		long stringsure = time2 - time1;
		System.out.println("stringsure: " + stringsure);
		
		
		
		
		long time3 = System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			sb.append(" ");
		}
		long time4 = System.nanoTime();
		
		long sbsure = time4 - time3;
		System.out.println("sbsure: " + sbsure);
		
		if (sbsure > stringsure) {
			System.out.println("String daha hizli");
		} else {
			System.out.println("StringBuilder daha hizli");
		}
		
		System.out.println(stringsure/sbsure);
		
	}

}
