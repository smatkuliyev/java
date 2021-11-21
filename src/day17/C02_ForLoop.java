package day17;

import java.util.Scanner;

public class C02_ForLoop {

	public static void main(String[] args) {
		// Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Bir kelime giriniz : "); 		//cekoslavakyalilastiramadiklarimizdanmisiniz
		String str = scan.next();
		
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));			// System.out.print(str.substring(i, i+1));
		}
		
		scan.close();
	}

}
