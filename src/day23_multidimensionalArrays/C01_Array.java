package day23_multidimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// verilen bir array'dan istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin ve sonra yeni array'i yazdirin
		
		int arr[] = {3,4,5,6,3,5,8,3,4,9};
		int silinecekEleman = 3;
		
		//array e yeni eleman eklemeyiz veya silemeyiz, uzunlugu degismez
		
		int sayac = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] ==silinecekEleman) {
				sayac++;
			}
		}
		
		System.out.println(sayac);
		int yeniArrayUzunluk = arr.length-sayac;
		
		// artik yeni array i olusturabiliriz
		
		int yeniArr[] = new int[yeniArrayUzunluk];
		
		// simdi eski array deki elemanlari birer birer alip, silinecek eleman esit olmayanlari yeni array'a atamaliyiz 
		
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] != silinecekEleman) {
				yeniArr[index] = arr[i];
				index++;
			}			
		}
		System.out.println(Arrays.toString(yeniArr));		
	}
}
