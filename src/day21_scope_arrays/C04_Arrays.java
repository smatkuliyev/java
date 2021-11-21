package day21_scope_arrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
		
		int arr[] = {22,3,4,8,6};
		
		// tum elemenleri yazdiralim
		// Array'in elemanlarini looop ile yazdirabiliriz
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");				// 22 3 4 8 6 
		}
		System.out.println();
		// ya da Arrays Class'dan yardim alip yazdirabiliriz
		System.out.println(Arrays.toString(arr));		// [22, 3, 4, 8, 6]
		
	}

}
