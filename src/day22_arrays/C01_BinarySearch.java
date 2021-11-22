package day22_arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		
		String isimler[] = {"Hacer", "ainagul", "Emine", "Murat", "Kutlu"};
		
		// isimler array'inda Murat var mi?
		
		Arrays.sort(isimler);
		// arrays class i sort yaptigimizda kalici olarak degisir
		
		System.out.println(Arrays.toString(isimler)); 		// [Emine, Hacer, Kutlu, Murat, ainagul]
		//sort method'u elementleri natural order'e gore siralar.
		
		isimler[4] = "Ainagul";
		System.out.println(Arrays.toString(isimler)); 
		Arrays.sort(isimler);
		
		System.out.println(Arrays.binarySearch(isimler, "Murat")); 	//4
		
		System.out.println(Arrays.binarySearch(isimler, "Mehmet")); //-5
		
		System.out.println(Arrays.binarySearch(isimler, "Tugba")); //-6
		
		System.out.println(Arrays.binarySearch(isimler, "Kursat")); //-4
		
	}

}
