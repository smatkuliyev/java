package day07_ifStatements;

import java.util.Scanner;

public class C02_SimpleIfStatements {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.print("tam sayi giriniz: ");
		int sayi = scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("Sayiniz çift sayi");
		}
		if (sayi%2==1) {
			System.out.println("Sayiniz tek sayi");
		}
		scan.close();
	}

}
