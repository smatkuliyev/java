package day10_ternary_SwitchStatement;

import java.util.Locale;

public class C08_ToUpperCaseLowerCase {

	public static void main(String[] args) {
		
		String isim = "aLIy";  // Ali yazdir
		System.out.println("" + isim.toUpperCase().charAt(0) + isim.toLowerCase().charAt(1) + isim.toLowerCase().charAt(2)); // String olmas� i�in �n�ne "" ekledik
		
		// yerel dile �evirme y�ntemi, ama ben zaten t�rk�e klavye kulland���m i�in))
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
		
		
	}

}
