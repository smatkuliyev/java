package day15;

import java.util.Scanner;

public class C04_S1_MethodCreation {

	public static void main(String[] args) {
		// Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu
		//			kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki
		//			rakamlarin toplamini,100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz.");
		int sayi = scan.nextInt();
		
		tekMiciftMi(sayi);
		yuz(sayi);
		basamak(sayi);
		
		scan.close();
	}

	private static void yuz(int sayi) {
		
		if (sayi > 0) {
			System.out.println("ve 0'dan buyuktur.");
		} else if(sayi < 0){
			System.out.println("ve 0'dan kucuktur.");
		} else {
			System.out.println("ve 0'dir.");
		}
		
	}

	private static void basamak(int sayi) {
		if (sayi >= 100) {
			int rakam=0;
			int rakamlarToplami=0;
			rakam=(int) (sayi%10);
			rakamlarToplami+=rakam;
			sayi/=10;
			rakam=(int) (sayi%10);
			rakamlarToplami+=rakam;
			sayi/=10;
			rakam=(int) (sayi%10);
			rakamlarToplami+=rakam;
			System.out.println("rakamlar toplami : " + rakamlarToplami);
			
		} else if(sayi>0) {
			System.out.println("Sayinin birler basamagi : " + (sayi%10));
			
		} else {
			System.out.println("gecersiz sayi");
		}
		
	}

	public static void tekMiciftMi(int sayi) {
		
		if (sayi%2 == 0) {
			System.out.println("Girilen sayi cifttir");
		} else {
			System.out.println("Girilen sayi tektir");
		}
		
	}

}
