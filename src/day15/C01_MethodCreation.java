package day15;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini isteyin
		// iki farkli method olusturun methodlardan biri girilen kelimeleri
		// ilk harfleri buyuk, digeri kucuk olacak sekilde   birlestirsin
		// ikince method isim ve soyisim ilk harfleri buyuk
		// kalan harfleri * olacak sekilde birlestirsin
		
		// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
		// ve programin kalan kisminda ismi ve soyismi kullanicini istedigi sekilde kullanin 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi ve soyisminizi enter'e basarak art arda giriniz...");
		String isim = scan.next();
		String soyisim = scan.next();
		
		System.out.println("Isminizin acik sekilde yazilmasini istiyorsaniz 1'e, \nilk harfi haric gizli yazdirmasi icin 2'ye basiniz...");
		int tercih = scan.nextInt();
		
		String birlesmisIsim = null; // Emrah Saglam, E**** S*****
		
		if (tercih == 1) {
			birlesmisIsim = acikIsim(isim, soyisim);
		} else if(tercih == 2){
			birlesmisIsim = isimGizle(isim, soyisim);
		} else {
			System.out.println("Lutfen 1 veya 2 secin");
		}
		
		System.out.println("Kullanicinin tercihi : " + birlesmisIsim);
		
		scan.close();
	}

	public static String isimGizle(String isim, String soyisim) {
		
		isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
		
		return isim + " " + soyisim;	
	}

	public static String acikIsim(String isim, String soyisim) {
		
		isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		return isim + " " + soyisim;
	}

}
