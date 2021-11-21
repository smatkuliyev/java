package day10_ternary_SwitchStatement;

import java.util.Scanner;

public class C06_HomeWorkQ04 {

	public static void main(String[] args) {
	/*	 Soru 4 :  	Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
					Kullanici S girerse "Software"
					D girerse "Developer"
					E girerse "Engineer"
					T girerse “In Testing” yazdirin			*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("SDET kisaltmasindaki harflerden birini yazýnýz : ");
		char harf = scan.next().toUpperCase().charAt(0) ;
		
		switch(harf) {
		case 'S':
			System.out.println("Software");
			break;
		case 'D':
			System.out.println("Developer");
			break;
		case 'E':
			System.out.println("Engineer");
			break;
		case 'T':
			System.out.println("In Testing");
			break;
		default:
			System.out.println("Geçerli harf giriniz");
			break;
		}
		scan.close();
		
	}

}
