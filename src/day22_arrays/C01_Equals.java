package day22_arrays;

import java.util.Arrays;

public class C01_Equals {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,5,4};
		int arr2[] = {1,2,3,4,5};
		System.out.println(Arrays.equals(arr1, arr2)); 		//false
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.equals(arr1, arr2)); 		//true
		
		int arr3[] = {1,2,3,4,6};
		int arr4[] = {1,2,3,4,15};
		System.out.println(Arrays.equals(arr3, arr4)); 		//false
		

	}

}
