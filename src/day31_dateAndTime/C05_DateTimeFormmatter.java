package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormmatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat = LocalDateTime.now();
		
		System.out.println(tarihSaat);
		
		// Eger tarih ve saati kendi istedigimiz bicimde yazdirmak istersek
		// gun / ay / yil , saat : dak : saniye
		
		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("DDD / MM / YYYY EEEE  HH : mm : ss");
		
		System.out.println(duzenle.format(tarihSaat));
		
		/*
		 * GUN 
		 * d : basta sifir varsa onu yazmadan gun numarasini 
		 * dd: tek haneli 01 gibi basina sifir yazarak
		 * DDD : yilin kacinci gun oldugunu yazar
		 * E,EE,EEE : gun isminin ilk 3 harfini
		 * EEEE : gun isminin tamamini
		 * 
		 * AY (Ay icin M, dakika icin m kullanilir)
		 * M : basta 0 varsa onu yazmadan ay numarisi
		 * MM : tek haneli 01 gibi basina sifir yazarak ay numarasi
		 * MMM : ilk 3 harfi 
		 * MMMM : tamami
		 * 
		 * YIL
		 * YY : son 2 rakamini
		 * Y, YYY, YYYY : tamamini
		 * 
		 * SAAT (24 saat uzerinden istiyorsak HH, 12 saat uzerinden istiyorsak hh)
		 * HH : tamami , 02
		 * H : tek rakamli , 2
		 * 
		 * a yazarsak AM vey PM verir
		 */
		
		
	}

}
