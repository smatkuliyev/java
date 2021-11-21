package day09_ternary_Operator;

import java.util.Scanner;

public class C08_Ternary_Hw_Q02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz : ");
		int sayi = scan.nextInt();
		
		System.out.println((sayi%2 == 0) ? "Cift sayi" : "Tek sayi" );
		
		scan.close();
	}

}
