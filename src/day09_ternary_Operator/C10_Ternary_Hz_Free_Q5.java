package day09_ternary_Operator;

import java.util.Scanner;

public class C10_Ternary_Hz_Free_Q5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz : ");
		int y = scan.nextInt();
		
		System.out.println( (y<1000 && y>=100) ? "Uc basamakli sayi" : "Uc basamakli sayi degil" );
		
		
		scan.close();
	}

}
