package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {
		
		LocalTime saatbasla = LocalTime.now();
		
		System.out.println("Baslangic saati : " + saatbasla);  // 23:04:40.965659200
		
		@SuppressWarnings("unused")
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
		
		System.out.println("For loop " + (nano2- nano1) + " nano saniyede tamamladý");
		
		System.out.println(saatbasla.getMinute());
		
		System.out.println(saatbasla.plusMinutes(100));
		
		System.out.println(saatbasla.minusSeconds(1541));
		
		LocalTime yerelSaat = LocalTime.now(ZoneId.of("Turkey"));
		
		System.out.println(yerelSaat);
		
	}

}
