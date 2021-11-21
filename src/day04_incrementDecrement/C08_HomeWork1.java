package day04_incrementDecrement;

import java.util.Scanner;

public class C08_HomeWork1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen tam sayi giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("lutfen bir tam sayi daha giriniz");
		
		int num2 = scan.nextInt();
		
		System.out.println("sayilarin toplami : " + (num1 + num2));
		System.out.println("sayilarin farki : " + (num1 - num2));
		System.out.println("sayilarin carpimi : " + (num1 * num2));
		
		
		scan.close();
		
	}

}
