package day10_ternary_SwitchStatement;

import java.util.Scanner;

public class C06_HomeWorkQ01 {

	public static void main(String[] args) {
		// Soru 1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Haftan�n ka��nc� g�n� : ");
		int gunNo = scan.nextInt() ;
		
		switch (gunNo) {
		case 1:
			System.out.println("PAZARTES�");
			break;
		case 2:
			System.out.println("SALI");
			break;
		case 3:
			System.out.println("�AR�AMBA");
			break;
		case 4:
			System.out.println("PER�EMBE");
			break;
		case 5:
			System.out.println("CUMA");
			break;
		case 6:
			System.out.println("CUMARTES�");
			break;
		case 7:
			System.out.println("PAZAR");
			break;
		default:
			System.out.println("Ge�erli bir g�n giriniz");
			break;
		}
		scan.close();
	}
}
