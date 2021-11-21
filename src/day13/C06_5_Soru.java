package day13;

import java.util.Scanner;

public class C06_5_Soru {

	public static void main(String[] args) {
		// soru5)	Kullanicidan 4 harfli bir kelime alin ve ekrana tersten yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 harfli bir kelime giriniz : ");
		String kelime = scan.next();
		
		char ters1 = kelime.charAt(3);
		char ters2 = kelime.charAt(2);
		char ters3 = kelime.charAt(1);
		char ters4 = kelime.charAt(0);
		
		System.out.println("" + ters1 + ters2 + ters3 + ters4);
		
	//	System.out.println("girilen 4 harfli kelimenin tersten yazilisi: " + kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));
		
		scan.close();
	}

}
