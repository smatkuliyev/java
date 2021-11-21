package day10_ternary_SwitchStatement;

import java.util.Scanner;

public class C06_HomeWorkQ02 {

	public static void main(String[] args) {
		// Soru 1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaçýncý ay : ");
		int ayNo = scan.nextInt() ;
		
		switch (ayNo) {
		case 1:
			System.out.println("OCAK");
			break;
		case 2:
			System.out.println("ÞUBAT");
			break;
		case 3:
			System.out.println("MART");
			break;
		case 4:
			System.out.println("NÝSAN");
			break;
		case 5:
			System.out.println("MAYIS");
			break;
		case 6:
			System.out.println("HAZÝRAN");
			break;
		case 7:
			System.out.println("TEMMUZ");
			break;
		case 8:
			System.out.println("AÐUSTOS");
			break;
		case 9:
			System.out.println("EYLÜL");
			break;
		case 10:
			System.out.println("EKÝM");
			break;
		case 11:
			System.out.println("KASIM");
			break;
		case 12:
			System.out.println("ARALIK");
			break;
		default:
			System.out.println("Geçerli bir ay giriniz");
			break;
		}
		scan.close();
	}

}
