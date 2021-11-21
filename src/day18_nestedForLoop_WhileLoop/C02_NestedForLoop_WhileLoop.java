package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C02_NestedForLoop_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan 10'dan kucuk pozitif bir tamsayi girmesini isteyin
		// girdigi sayiya gore asagidaki sekli yazdirin
		// orn : 3 girilirse
		// 1
		// 1 2
		// 1 2 3

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 10'dan kucuk 1 tam sayi giriniz : ");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
