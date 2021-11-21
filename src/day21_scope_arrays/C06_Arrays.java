package day21_scope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
		int arr[] = {3,15,8,11,1};
		
		int toplam = 0;
		
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		
		System.out.println("Elementlerin toplami : " + toplam);
		
		// Array'in tum elemanlarini once kucukten buyuge sonra buyukten kucuge yazdirin
		
		//kucukten buyuge
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//buyukten kucuge
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		// Array yappmak isterseniz ayni uzunlukta bir array olusturup elemanlari ters sirada yeni array tasiyabiliriz.
		
		int tersArray[] = new int[arr.length];
		
		for (int i = 0; i < tersArray.length; i++) {
			tersArray[i]=arr[arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(tersArray));
		
	}
}
