package day19_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Lutfen bolenlerini bulmak icin pozitif bir tam sayi giriniz : ");
		int sayi = scan.nextInt();		// 345 data turu int
		
		int rakamlarToplami=0;
		int rakam = 0;
		
		rakamlarToplami=0;
		String sayiStr = "" + sayi;		// 345 data turu String
		
		// int olarak verilen bir sayinin basamak sayisini bulmak istersek, kisa yoldan o sayiyi String'e cevirip, str.length() method'unu kullanabiliriz
		
		for (int i = 0; i < sayiStr.length(); i++) {
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
		}
		System.out.println("Girdiginiz sayinin rakam toplami  : " + rakamlarToplami);	
		scan.close();
	}

}
