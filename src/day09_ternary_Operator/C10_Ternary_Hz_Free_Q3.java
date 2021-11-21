package day09_ternary_Operator;

import java.util.Scanner;

public class C10_Ternary_Hz_Free_Q3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz : ");
		int y = scan.nextInt();
		
		System.out.println( (y>5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y) );
		
		scan.close();
	}

}
