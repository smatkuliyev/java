package day13;

import java.util.Scanner;

public class C06_3_Soru {

	public static void main(String[] args) {
		// soru 3 : Kullanicidan isim isteyin, eger isim "a" harfi iceriyorsa, girdiginiz isim a harfi iceriyor,
		//			eger "Z" harfi iceriyorsa , girdiginiz isim Z harfi iceriyor yazdirin, ikisi de yoksa girdiginiz isim a ve Z harfi icermiyor yazdirin.	​
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir isim giriniz : ");
		String isim = scan.next();
				
		if (isim.contains("a") && isim.contains("Z")) {
			System.out.println("isim a ve Z harfi iceriyor");
		} else if(isim.contains("a")) {
			System.out.println("isim a harfi iceriyor");
		} else if(isim.contains("Z")) {
			System.out.println("isim Z harfi iceriyor");
		} else {
			System.out.println("isim a ve Z harfi icermiyor");
		}
				
		scan.close();
	}

}
