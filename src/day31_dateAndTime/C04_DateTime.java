package day31_dateAndTime;

import java.time.LocalTime;

public class C04_DateTime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// bir String ve bir int variable olusturalim
		// bir loop icerisinde bu variable'lari 1000 kere degistirelim
		// ve islem surelerini kiyaslayalim.
		
		LocalTime saatbasla = LocalTime.now();
		
		System.out.println("Baslangic saati : " + saatbasla);  // 23:04:40.965659200
		
		int sayi = 10;
		
		for (int i = 0; i < 10000; i++) {
			sayi++;
		}
		LocalTime saatbitis = LocalTime.now();
		System.out.println("Bitis saati : " + saatbitis);
		
		// eger bir islemin baslangic ve bitis zamanini kaydetmek istiyorsak
		// hem basinda, hem sonunda LocalTime objesi olusturmaliyiz
		
		double nano1 = saatbasla.getNano();
		double nano2 = saatbitis.getNano();
		
		System.out.println("int For loop " + (nano2- nano1) + " nano saniyede tamamladý");
		
		System.out.println();
		
		LocalTime saatbaslaS = LocalTime.now();
		
		System.out.println("Baslangic saati : " + saatbaslaS);  
		
		String str = "celil";
		
		for (int i = 0; i < 10000; i++) {
			str+=" ";
		}
		LocalTime saatbitisS = LocalTime.now();
		System.out.println("Bitis saati : " + saatbitisS);
		
		// eger bir islemin baslangic ve bitis zamanini kaydetmek istiyorsak
		// hem basinda, hem sonunda LocalTime objesi olusturmaliyiz
		
		double nano3 = saatbaslaS.getNano();
		double nano4 = saatbitisS.getNano();
		
		System.out.println("str For loop " + (nano4- nano3) + " nano saniyede tamamladý");
		
		System.out.println();
		
		double StringSure = nano4- nano3;
		double intSure = nano2- nano1;
		
		System.out.println("int String'den " + (StringSure-intSure) + " nano saniye daha hizli bitirdi");
		
	}

}
