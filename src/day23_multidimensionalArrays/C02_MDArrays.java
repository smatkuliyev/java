package day23_multidimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {
		// MultiDimensional Array'lar ic ice koyulmus array'lar demektir.
		
		int arr[][] = new int[3][2];
		System.out.println(Arrays.toString(arr)); 		// [[I@5ccd43c2, [I@4aa8f0b4, [I@7960847b], direk outer array'i yazdirmak istedigimizde
														// icindeki elemanlar non-primitive oldugunda referanslari yazdirir
		System.out.println(Arrays.toString(arr[1]));	// [0, 0]
		System.out.println(Arrays.toString(arr[2]));	// [0, 0]
		
		System.out.println(Arrays.deepToString(arr)); 	// [[0, 0], [0, 0], [0, 0]]
		
		arr[0][1] = 5;
		arr[1][0] = 2;
		arr[2][1] = 3;
		System.out.println(Arrays.deepToString(arr)); 	// [[0, 5], [2, 0], [0, 3]]
		
		int arr2[][] = {{0},{1,2,3},{6,7,8}};
		System.out.println(Arrays.deepToString(arr2)); 	// [[0], [1, 2, 3], [6, 7, 8]]
		
		System.out.println(Arrays.toString(arr2[1]));  	// [1, 2, 3]
		
		System.out.println(arr2[2][1]); 				// 7
	}

}
