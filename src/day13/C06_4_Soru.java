package day13;

import java.util.Scanner;

public class C06_4_Soru {

	public static void main(String[] args) {
		
		// soru4)	Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi giriniz : ");
		String isim = scan.next();
		
		System.out.println("Soyisminizi giriniz : ");
		String soyisim = scan.next();
		
		if (isim.length() > soyisim.length()) {
			System.out.println("Isminiz daha uzun karakterli.");
		} else if(isim.length() == soyisim.length()){
			System.out.println("Isminiz ve soyisminiz uzunluk olarak bir birine esittir.");
		} else {
			System.out.println("Soyisminiz daha uzun karakterli.");
		}
		
		scan.close();
	}

}
