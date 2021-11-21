package day03_scanner;

import java.util.Scanner;

public class C05_Scanner2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi yaziniz : ");
		
		String isim = scan.next();
		
		System.out.println("Lutfen soyisminizi yaziniz : ");
		
		String soyisim = scan.next();
		
		System.out.println("girilen isim : " + isim + " " + soyisim);
		
		scan.close();

	}

}
