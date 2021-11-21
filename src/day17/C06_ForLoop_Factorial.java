package day17;

import java.util.Scanner;

public class C06_ForLoop_Factorial {

	public static void main(String[] args) {
		// Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Lutfen 1 tam sayiyi giriniz : ");
		int sayi = scan.nextInt();
		
		System.out.print(sayi + "!=");
		
		int factorial = 1;
		
		for (int i = sayi; i > 1; i--) {
			factorial *= i;
			System.out.print(i+"*");
		}
		
		System.out.println("1=" + factorial);
		
		scan.close();
	}

}
