package day10_ternary_SwitchStatement;

import java.util.Locale;

public class C08_ToUpperCaseLowerCase {

	public static void main(String[] args) {
		
		String isim = "aLIy";  // Ali yazdir
		System.out.println("" + isim.toUpperCase().charAt(0) + isim.toLowerCase().charAt(1) + isim.toLowerCase().charAt(2)); // String olmasý için önüne "" ekledik
		
		// yerel dile çevirme yöntemi, ama ben zaten türkçe klavye kullandýðým için))
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
		
		
	}

}
