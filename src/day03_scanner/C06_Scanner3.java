package day03_scanner;

import java.util.Scanner;

public class C06_Scanner3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi yaziniz : ");
		
		String isim = scan.nextLine();
		
		System.out.println("Lutfen soyisminizi yaziniz : ");
		
		String soyisim = scan.nextLine();
		
		System.out.println("girilen isim : " + isim + " " + soyisim);
		
		scan.close();
		
		// Page 36 is homeWork

	}

}
