package day40;

import java.util.Scanner;

public class C08_IllegalargumentException {

	public static void main(String[] args) {
		// Soru: Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen konsolda gormek icin yasinizi girin");
		int yas = scan.nextInt();
		
		try {
			if (yas < 0) {
				throw new IllegalArgumentException();
			} else {
				System.out.println(yas);
			}
			
			
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("Yas sifirdan kucuk olamaz");
		}
		
	}

}
