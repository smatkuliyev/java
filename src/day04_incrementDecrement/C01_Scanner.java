package day04_incrementDecrement;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		
		// Page 48, Question 3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen cemberin yaricapini giriniz");
		
		double yaricap = scan.nextDouble();
		
		double cevre = 2 * 3.14 * yaricap;
		
		double alan = 3.14 * yaricap * yaricap;
		
		System.out.println("cemberin cevresi : " + cevre);
		System.out.println("cemberin alani : " + alan);
		
		
		scan.close();

	}

}
