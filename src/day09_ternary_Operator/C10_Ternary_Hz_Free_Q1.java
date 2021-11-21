package day09_ternary_Operator;

import java.util.Scanner;

public class C10_Ternary_Hz_Free_Q1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz : ");
		int sayi = scan.nextInt();
		
		System.out.println( (sayi < 10) ? "Rakam" : ((sayi < 100) ? "iki basamakli sayi" : "uc basamakli veya daha buyuk sayi"));
		
		
		scan.close();
	}

}
