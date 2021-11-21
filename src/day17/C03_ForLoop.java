package day17;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin.
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Bir kelime giriniz : "); 		//cekoslavakyalilastiramadiklarimizdanmisiniz
		String str = scan.next();
		
		String a = tersineCevir(str);
		
		System.out.println(a);
		
		scan.close();
	}

	public static String tersineCevir(String str) {
		
		String tersStr = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			
			tersStr+=str.substring(i, i+1); //str.charAt(i);
			
		}
		
		return tersStr;

	}

}
