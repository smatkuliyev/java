package day40_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {
		
		// Kullanicidan istedigi kadar sayi alip bu sayilari toplayan bir program yapiniz
		// sayi girisini bitirmek icin q basin
		
		int sayi = 0;
		int toplam = 0;
		int count = 0;
	
		
		Scanner scan = new Scanner(System.in);
		// InputMismatchException
		
		try {
			
			while (count<10000) {
				
				System.out.println("Lutfen toplamak icin bir sayi yaziniz : \nBitirmek icin sayi disinda bir seye basiniz");
				sayi = scan.nextInt();
				toplam+=sayi;
				
				count++;
			}
			
		} catch (InputMismatchException e) {
			
			System.out.println("Girdiginiz "+ count + " adet Sayin toplami : " + toplam);
		}
		
		
		

		
		scan.close();
		
	}

}
