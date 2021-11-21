package day04_incrementDecrement;

import java.util.Scanner;

public class C08_HomeWork2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir kenar uzunlugunu giriniz");
		
		double num1 = scan.nextInt();
		
		System.out.println("diger kenar uzunlugunu giriniz");
		
		double num2 = scan.nextInt();
		
		System.out.println("cevresi : " + (2 * num1 + 2 * num2));
		System.out.println("alani : " + (num1 * num2));
		
		scan.close();
	}

}
