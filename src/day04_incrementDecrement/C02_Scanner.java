package day04_incrementDecrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		// Page 48, Question 7;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen isminizi yazin");
		
		char ilkHarf = scan.next().charAt(0);
		
		System.out.println("isminizin ilk harfi : " + ilkHarf);
				
		scan.close();

	}

}
