package day15;

import java.util.Scanner;

public class C06_S4 {

	public static void main(String[] args) {
		// Soru 4) 	Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
		//			numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
		//			sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
		//			duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi ve soyisminizi art arda enter'e basarak giriniz.");
		String name = scan.next();
		String surname = scan.next();
		
		System.out.println("Lutfen 16 haneli kredi karti numaranizi bosluk birakmadan giriniz.");
		String kkNo= scan.next();
		
		String i= isimduzeltme(name, surname);
		String k = kkNoDuzeltme(kkNo);
		
		System.out.println(i);
		System.out.println(k);
		
		scan.close();
	}

	public static String kkNoDuzeltme(String kkNo) {
		kkNo = kkNo.substring(0, 4) + " " + kkNo.substring(4, 8) + " " + kkNo.substring(8, 12) + " " + kkNo.substring(12);
		return kkNo;
	}

	public static String isimduzeltme(String name, String surname) {
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		surname = surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
		return name + " " + surname;
		
	}

}
