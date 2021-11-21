package day05_mathOperations;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 basamaklý bir sayi giriniz");
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
		
		
		scan.close();
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
	}

}
