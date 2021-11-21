package day09_ternary_Operator;

import java.util.Scanner;

public class C06_NestedIfElse_Yil_HwQ10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yil giriniz : ");
		int yil = scan.nextInt();
		
		if (yil % 100 == 0) {
			
			if (yil % 400 == 0) {
				System.out.println("Artik yildir.");
			} else {
				System.out.println("Artik yil degildir1");
			}
			
		} else {
			
			if (yil % 4 == 0) {
				System.out.println("Artik yildir2.");
			} else {
				System.out.println("Artik yil degildir2");
			}

		}
		
		
		scan.close();
	}

}
