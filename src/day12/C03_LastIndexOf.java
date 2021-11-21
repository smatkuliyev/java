package day12;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {
		
		// Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz : ");
		String cumle = scan.nextLine();
		
		System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz : ");
		char krk = scan.next().charAt(0);
		
		int index = cumle.lastIndexOf(krk);
		
		if (index < 0) {
			System.out.println("Girilen harf verilen cumlede yok");
		} else {
			System.out.println("Girilen harf verilen cumlede var");
		}
		scan.close();
	}

}
