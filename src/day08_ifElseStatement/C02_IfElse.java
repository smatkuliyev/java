package day08_ifElseStatement;

import java.util.Scanner;

public class C02_IfElse {

	public static void main(String[] args) {
		
		// Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("istediginiz bir sey girin : ");
		
		char k = scan.next().charAt(0);
		
		if ( (k >= 'A' && k <= 'Z') || (k >= 'a' && k <= 'z')) {
			System.out.println("Karakter \"" + k +"\" bir harftir.");
		} else {
			System.out.println("Karakter \"" + k +"\" bir harf degildir.");
		}
		scan.close();
		
	}

}
