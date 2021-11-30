package day29_staticBlock_passByValue;

import java.util.Arrays;

public class C05_PassByValueArray {

	public static void main(String[] args) {
		
		int sayilar[] = {3,4,5,6};
		
		listDegistir(sayilar);
		System.out.println("Eleman degistir method'undan sonra : " + Arrays.toString(sayilar)); //[10, 4, 5, 6]
		
		arrayiDegistir(sayilar);
		System.out.println("arrayiDegistri method'undan sonra : " + Arrays.toString(sayilar));
		
	}

	private static void arrayiDegistir(int[] sayilar) {
		sayilar = new int[6];
		System.out.println("arrayiDegistri method'unda : " + Arrays.toString(sayilar));
		
	}

	private static void listDegistir(int[] sayilar) {
		
		sayilar[0]=10;
		System.out.println("Eleman degistir method'unda : " + Arrays.toString(sayilar));
		
	}

}
