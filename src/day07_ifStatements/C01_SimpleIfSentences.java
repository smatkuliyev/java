package day07_ifStatements;

import java.util.Scanner;

public class C01_SimpleIfSentences {

	public static void main(String[] args) {
		
		/* 
		 * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
		 * isimlerini yazdirin
		 * Ornek:
		 * ilkHarf=P output = �Pazar, Pazartesi veya Persembe�
		 * ilkHarf=S output = �Sali�
		 * Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen gun isimlerinden birinin ilk harfini yaziniz : ");
		// kullan�c�n girdigi verinin tamamini kucuk veya buyuk yapabiliriz, .toUpperCase() veya .toLowerCase()
		char ilkHarf = scan.next().toUpperCase().charAt(0);

		if (ilkHarf == 'P') {
			System.out.println("Pazar, Pazartesi veya Persembe");
		}
		if (ilkHarf == 'S') {
			System.out.println("Sali");
		}
		if (ilkHarf == 'C') {
			System.out.println("Carsamba, Cuma veya Cumartesi");
		}
		if (ilkHarf != 'C' || ilkHarf != 'P' || ilkHarf != 'S') {
			System.out.println("Gecersiz karakter girdiniz. Lutfen gun isimlerinden birinin bas harfini yaziniz");
		}
		
		
		scan.close();
	}

}
