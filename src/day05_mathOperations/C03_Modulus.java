package day05_mathOperations;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3 basamaklý bir sayi giriniz");
		
		int sayi = scan.nextInt();  //573
		
		int rakamlarToplami = 0;
		
		int rakam = sayi % 10;      // 3
		rakamlarToplami += rakam;   //3
		sayi /= 10;                 // 57
		
		rakam = sayi%10;           //7
		rakamlarToplami += rakam;  //10
		sayi /= 10;                // 5
		
		rakamlarToplami += sayi;
		
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
		
		scan.close();
		
	}

}
