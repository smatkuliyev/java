package day09_ternary_Operator;

import java.util.Scanner;

public class C09_Ternary_Hw_Q03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz : ");
		double sayi = scan.nextDouble();
		
	//	System.out.println(Math.abs(sayi));
		
		System.out.println( (sayi>=0) ? sayi : (-1)*sayi);
		
		scan.close();
	}

}
