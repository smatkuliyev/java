package day25_arrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		// verilen array'i Arrays class'indan yardim alarak liste'e cevirebiliriz
		
		String arr[] = {"A","b","C","d"};
		
		List<String> arraydenList = Arrays.asList(arr);			// [A, b, C, d]
		
		System.out.println("List : " + arraydenList);

	//	arraydenList.add("F");    	//	RTE
									//	Arrays.asList(), kullanirsak arraylist'in uzunlugu degistirilemez, add, remove, clear method'lari kullanilamaz
									//  UnsupportedOperationException
		
		arr[1] = "Z";
		System.out.println("Array : "+ Arrays.toString(arr));				// [A, Z, C, d]
		System.out.println("List : "+ arraydenList); 						// [A, Z, C, d]
		
		arraydenList.set(3, "D");
		System.out.println("List : "+ arraydenList); 						// [A, Z, C, D]
		
		System.out.println("Array : "+ Arrays.toString(arr));				// [A, Z, C, D]
	}

}
