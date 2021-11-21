package day09_ternary_Operator;

import java.util.Scanner;

public class C10_Ternary_Hz_Free_Q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz : ");
		double x = scan.nextDouble();
		System.out.println("Lutfen bir sayi giriniz : ");
		double y = scan.nextDouble();
		
		System.out.println( x == y ? "Dikdortgen bir kare'dir" : "Dikdortgen bir kare degildir" );
		
		
		scan.close();
	}

}
