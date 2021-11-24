package day24_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_List_size_get_isEmpty {

	public static void main(String[] args) {
		// verilen bir array'dan istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin ve sonra yeni array'i yazdirin
		
		int arr[] = {3,4,5,6,3,5,8,3,4,9,5,6,4,7};
		int silinecekEleman = 4;
		
		List<Integer> gecici = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] != silinecekEleman) {
				gecici.add(arr[i]);
			}		
		}
		System.out.println("List olarak  : "+gecici); 	//list olarak istenmeyen eleman haric tum elemanlari goruyoruz
		
		// sonucu array olarak istiyorsak
		// listedekileri yeni array'e ekleyebiliriz
		
		int yeniArray[] = new int[gecici.size()];
		
		for (int i = 0; i < yeniArray.length; i++) {
			yeniArray[i]=gecici.get(i);
		}
		
		System.out.println("Array olarak : "+Arrays.toString(yeniArray));
		
		System.out.println(gecici.isEmpty());
		
	}

}
