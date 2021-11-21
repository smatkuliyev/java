package day09_ternary_Operator;

import java.util.Scanner;

public class C05_NestedIfElse_Yil_HwQ09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yil giriniz : ");
		int yil = scan.nextInt();
		
		if (yil % 4 == 0) {
			
			if (yil % 100 == 0) {
				
				if (yil % 400 == 0) {
					System.out.println("Artik yildir.");
				} else {
					System.out.println("Artik yil degildir3");
				}
				
			} else {
				System.out.println("Artik yil degildir2");
			}
			
		} else {
			System.out.println("Artik yil degildir1");
		}
		
		scan.close();
	}

}
