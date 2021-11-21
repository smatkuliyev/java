package day17;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Lutfen 2 tam sayiyi art arda enter e basarak giriniz : "); 	
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		int kucuk = 0;
		int buyuk = 0;
		
		if (sayi1>sayi2) {
			buyuk = sayi1;
			kucuk = sayi2;
		} else {
			buyuk = sayi2;
			kucuk = sayi1;
		}
		
		int toplam = 0;
		
		for (int i = kucuk; i <= buyuk; i++) {
			toplam += i;
		}
		
		System.out.println("Girilen sayilarin ve aralarindaki sayilarin toplami : " + toplam);
		
		scan.close();
	}

}
