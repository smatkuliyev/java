package day09_ternary_Operator;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		
        /* Soru 12: Kullan�c�dan 4 basamakli bir sayi girmesini isteyin. Girdi�i sayi 5 �e
        b�l�n�yorsa son rakam�n� kontrol edin. Son rakam� 0 ise ekrana 5 �e b�l�nen
        �ift say�� yazd�r�n. Son rakam� 0 de�il ise 5 �e b�l�nen tek say�� yazd�r�n.
        Girdi�i password 5 �e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n                        */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli pozitif bir sayi giriniz : ");
		int sayi = scan.nextInt();

		if(sayi<1000 || sayi> 9999) {
			System.out.println("Lutfen 4 basamakli pozitif bir sayi giriniz : ");
			
		} else {
			if (sayi%5 == 0) { //5e tam bolunenler
				
				if (sayi%10 == 0) { // son rakam 0
					System.out.println("5�e tam b�l�nen �ift sayi");
				} else { // son rakam 5
					System.out.println("5�e tam b�l�nen tek sayi");
				}
				
			} else { //5e tam bolunemeyenler
				System.out.println("Tekrar deneyin");
			}
		}
		scan.close();

	}

}
