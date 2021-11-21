package day04_incrementDecrement;

import java.util.Scanner;

public class C08_HomeWork5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("isminizi giriniz");
		String isim = scan.nextLine();
		
		System.out.println("soysiminiz giriniz");
		String soyisim = scan.nextLine();
		
		System.out.println("isminiz : " + isim);
		System.out.println("soyisminiz : " + soyisim);
		System.out.println("Kursumuza katiliminiz alinmistir, tesekkür ederiz");
		
		// sonraki soru cozumu
		
		System.out.println("isim - soyisim : " + isim + " " + soyisim);
		
		// sonraki soru cozumu
		
		char ilkHarf = isim.charAt(0);
		System.out.println(ilkHarf);
		
		scan.close();

	}

}
