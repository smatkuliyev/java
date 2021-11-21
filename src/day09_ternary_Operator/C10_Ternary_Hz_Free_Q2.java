package day09_ternary_Operator;

import java.util.Scanner;

public class C10_Ternary_Hz_Free_Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz : ");
		char ilkHarf = scan.next().charAt(0);
		
		System.out.println( ((ilkHarf>='A' && ilkHarf<='Z') || (ilkHarf>='a' && ilkHarf<='z')) ? 
				( (ilkHarf>='A' && ilkHarf<='Z') ? ("Buyuk Harf") : ("Kucuk Harf") ) : ("Girdiginiz karakter harf degil") );
		
	//	String sonuc = (ilkHarf>='a' && ilkHarf<='z') ? "Kucuk harf" : (
	//		(ilkHarf>='A' && ilkHarf<='Z') ? "Buyuk harf" : "Girdiginiz karakter harf degil");
	//	System.out.println(sonuc);
		
		scan.close();
	}

}
