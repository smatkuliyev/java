package day10_ternary_SwitchStatement;

import java.util.Scanner;

public class C06_HomeWorkQ01 {

	public static void main(String[] args) {
		// Soru 1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Haftanýn kaçýncý günü : ");
		int gunNo = scan.nextInt() ;
		
		switch (gunNo) {
		case 1:
			System.out.println("PAZARTESÝ");
			break;
		case 2:
			System.out.println("SALI");
			break;
		case 3:
			System.out.println("ÇARÞAMBA");
			break;
		case 4:
			System.out.println("PERÞEMBE");
			break;
		case 5:
			System.out.println("CUMA");
			break;
		case 6:
			System.out.println("CUMARTESÝ");
			break;
		case 7:
			System.out.println("PAZAR");
			break;
		default:
			System.out.println("Geçerli bir gün giriniz");
			break;
		}
		scan.close();
	}
}
