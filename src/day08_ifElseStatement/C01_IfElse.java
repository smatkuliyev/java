package day08_ifElseStatement;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		/*
		 * Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin
		 */	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dikdortgenin 1 kenar uzunlugunu girin : ");
		
		double kenar1 = scan.nextDouble();
		
		System.out.print("Dikdortgenin diger kenar uzunlugunu girin : ");
		
		double kenar2 = scan.nextDouble();
		
		if (kenar1 == kenar2) {
			System.out.println("Girilen dikdortken Kare'dir");
		} else {
			System.out.println("Girilen dikdortken Kare degildir");
		}
		
		scan.close();
	}

}
