package day05_mathOperations;

import java.util.Scanner;

public class C06_HomeWork {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 5 basamakli bir sayi giriniz");
		
		int sayi = scan.nextInt();
		int rakamlarToplami = 0;
		
		int rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;
		
		rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;
		
		rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;
		
		rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;
		
		rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;
		
		System.out.println("girdiniz sayinin rakamlartoplami : " + rakamlarToplami);
		
		scan.close();
	}

}
