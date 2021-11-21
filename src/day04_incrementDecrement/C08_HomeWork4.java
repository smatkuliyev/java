package day04_incrementDecrement;

import java.util.Scanner;

public class C08_HomeWork4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("uzunlugu giriniz");
		double num1 = scan.nextInt();
		
		System.out.println("genisligi giriniz");
		double num2 = scan.nextInt();
		
		System.out.println("yuksekligi giriniz");
		double num3 = scan.nextInt();
		
		System.out.println("pirizmanin hacmi : " + (num1 * num2 *  num3));
		
		scan.close();
	}

}
