package day23_multidimensionalArrays;

import java.util.Arrays;

public class C07_Arrays_copyOf {

	public static void main(String[] args) {
		// Verilen iki array'i birlestiren ve sonucu birlesikArray isminde bir array'e kaydeden bir method olusturun
		
		int arr[] = {3,5,7,9};
		int arr2[] = {2,4,6};
		
		int birlesikArray[] = birlestir(arr, arr2);	
		Arrays.sort(birlesikArray);
		System.out.println(Arrays.toString(birlesikArray));

	}

	public static int[] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikArray[] = Arrays.copyOf(arr1, arr1.length+arr2.length); //[3,5,7,9,0,0,0]
		
		for (int i = 0; i < arr2.length; i++) {
			birlesikArray[i+arr1.length] =arr2[i];
		}
		
		return birlesikArray;
	}

}
