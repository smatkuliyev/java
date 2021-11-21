package day08_ifElseStatement;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		/*  Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
		    		birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana “Eskenar degil”   */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ucgenin 1. kenarýný giriniz : ");
		double k1 = scan.nextInt();
		
		System.out.print("Ucgenin 2. kenarýný giriniz : ");
		double k2 = scan.nextInt();
		
		System.out.print("Ucgenin 3. kenarýný giriniz : ");
		double k3 = scan.nextInt();
		
		if (k1==k2 && k2==k3) {
			System.out.println("Eskenar ucgen");
		} else {
			System.out.println("Eskenar degil");
		}
		
		scan.close();
	}

}
