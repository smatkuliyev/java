package day17;

import java.util.Scanner;

public class C04_ForLoop_Palindrome {

	public static void main(String[] args) {
		// Soru 9 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Bir kelime giriniz : "); 		//cekoslavakyalilastiramadiklarimizdanmisiniz
		String str = scan.nextLine();
		
		String a = tersineCevir(str);
		
		System.out.println(a);
		
		if (str.equals(tersineCevir(str))) {
			System.out.println("Girdiginiz string palindrome");
		} else {
			System.out.println("Girdiginiz string palindrome degildir");
		}
		
		scan.close();		
	}
	
	public static String tersineCevir(String str) {
		
		String tersStr = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			
			tersStr+=str.substring(i, i+1);
			
		}
		
		return tersStr;

	}

}
