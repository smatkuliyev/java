package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// Kullanicidan 2 sayi isteyin
		// sayilarin karelerini ve kuplerini toplayip yazdiran 2 ayri method yazin
		// kullaniciya us sorun
		// 2 yazarsa karelerin toplamini yapan method, 3 yazarsa kup method calissin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("2 sayi'yi enter'e basarak art arda giriniz...");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("Karelerin toplami icin 2 ye, kuplerin toplami icin 3 basiniz...");
		int us = scan.nextInt();
		
		if (us == 2) {
			kareTopla(sayi1, sayi2);
		} else if(us == 3) {
			kupTopla(sayi1, sayi2);
		} else  {
			System.out.println("Lutfen dogru islem seciniz!");
		}

		scan.close();
	}

	public static void kupTopla(int sayi1, int sayi2) {
		
		System.out.println("Sayilarin karesinin toplami : " + (sayi1*sayi1*sayi1 + sayi2*sayi2*sayi2));
		
	}

	public static void kareTopla(int sayi1, int sayi2) {
		
		System.out.println("Sayilarin karesinin toplami : " + (sayi1*sayi1 + sayi2*sayi2));
		
	}

}
