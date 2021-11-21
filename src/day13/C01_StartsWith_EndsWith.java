package day13;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cumle giriniz : ");
		String cumle = scan.nextLine();
		
		System.out.println("Hangi kelime ile baslayip baslamadigini kontrol etmek istersiniz : ");
		String ilkKelime = scan.next();
		
		System.out.println("Hangi kelime ile bitip bitmedigini kontrol etmek istersiniz : ");
		String sonKelime = scan.next();
		
		if (cumle.startsWith(ilkKelime)) {
			System.out.println("Girilen cumle " + ilkKelime +  " ile basliyor");
		} else {
			System.out.println("Girilen cumle " + ilkKelime +  " ile baslamiyor");
		}
		
		if (cumle.endsWith(sonKelime)) {
			System.out.println("Girilen cumle " + sonKelime +  " ile basliyor");
		} else {
			System.out.println("Girilen cumle " + sonKelime +  " ile baslamiyor");
		}
		
		scan.close();
	}

}
