package day10_ternary_SwitchStatement;

import java.util.Scanner;

public class C06_HomeWorkQ02 {

	public static void main(String[] args) {
		// Soru 1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Ka��nc� ay : ");
		int ayNo = scan.nextInt() ;
		
		switch (ayNo) {
		case 1:
			System.out.println("OCAK");
			break;
		case 2:
			System.out.println("�UBAT");
			break;
		case 3:
			System.out.println("MART");
			break;
		case 4:
			System.out.println("N�SAN");
			break;
		case 5:
			System.out.println("MAYIS");
			break;
		case 6:
			System.out.println("HAZ�RAN");
			break;
		case 7:
			System.out.println("TEMMUZ");
			break;
		case 8:
			System.out.println("A�USTOS");
			break;
		case 9:
			System.out.println("EYL�L");
			break;
		case 10:
			System.out.println("EK�M");
			break;
		case 11:
			System.out.println("KASIM");
			break;
		case 12:
			System.out.println("ARALIK");
			break;
		default:
			System.out.println("Ge�erli bir ay giriniz");
			break;
		}
		scan.close();
	}

}
