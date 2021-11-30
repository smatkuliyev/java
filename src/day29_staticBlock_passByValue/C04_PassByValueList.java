package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// Bir list(veya array) olusturalim, sonra list elemanlarini degistir method'u yazip orada list elemanlarindan bazilarini degistirelim
		// method void olsun
		// main method'a dondukten sonra yeniden list'i yazdiralim
		
		List<String> harfler = new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		// Java'da list ve Array gibi obje icin de pass by value gecerlidir.
		// Yani farkli bir method'da array ve list'e yeni bir deger atamisi yaparsaniz
		// orijinal array ve list degismez
		
		
		// method'da yeni deger atatigim  halde harfler listesi degismez
		listElemanlarDegistir(harfler); 									// [D, B, C]
		System.out.println("Method method'a donunce list : " + harfler); 	// [D, B, C]
		
		listDegistir(harfler);
		System.out.println("List'e yeni list atadiktan sonra  Method method'a donunce list : " + harfler); //[D, B, C]
	}

	private static void listDegistir(List<String> harfler) {
		
		harfler = new ArrayList<>();
		System.out.println("List'e  yeni deger atayinca : " + harfler);
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		
		harfler.set(0, "D");
		System.out.println("Method'da degistirdigimiz list : " + harfler);
		
	}

}

