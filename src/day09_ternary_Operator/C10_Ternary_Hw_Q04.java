package day09_ternary_Operator;

import java.util.Scanner;

public class C10_Ternary_Hw_Q04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz : ");
		double sayi = scan.nextDouble();
		
		System.out.println( (sayi > 0) ? "Sayi pozitif" : sayi*sayi);
		
		scan.close();
	}

}
