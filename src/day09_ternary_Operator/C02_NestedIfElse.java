package day09_ternary_Operator;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		
        /* Soru 12: Kullanýcýdan 4 basamakli bir sayi girmesini isteyin. Girdiði sayi 5 ’e
        bölünüyorsa son rakamýný kontrol edin. Son rakamý 0 ise ekrana 5 ’e bölünen
        çift sayý” yazdýrýn. Son rakamý 0 deðil ise 5 ’e bölünen tek sayý” yazdýrýn.
        Girdiði password 5 ’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn                        */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli pozitif bir sayi giriniz : ");
		int sayi = scan.nextInt();

		if(sayi<1000 || sayi> 9999) {
			System.out.println("Lutfen 4 basamakli pozitif bir sayi giriniz : ");
			
		} else {
			if (sayi%5 == 0) { //5e tam bolunenler
				
				if (sayi%10 == 0) { // son rakam 0
					System.out.println("5’e tam bölünen çift sayi");
				} else { // son rakam 5
					System.out.println("5’e tam bölünen tek sayi");
				}
				
			} else { //5e tam bolunemeyenler
				System.out.println("Tekrar deneyin");
			}
		}
		scan.close();

	}

}
