package day09_ternary_Operator;

import java.util.Scanner;

public class C07_Ternary_Hw_Q01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz : ");
		double sayi1 = scan.nextDouble();
		
		System.out.println("Lutfen bir tam sayi giriniz : ");
		double sayi2 = scan.nextDouble();
		
		System.out.println( (sayi1 < sayi2) ? sayi1 : sayi2);
		
		
		scan.close();
	}

}
