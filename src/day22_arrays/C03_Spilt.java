package day22_arrays;

import java.util.Arrays;

public class C03_Spilt {

	public static void main(String[] args) {
		// "Java ogrendim,  #cok para?kazandim.,"
		// cumlesinin kelimelerini, ozel karaketler ve noktalama isaretleri olmadan 
		// harf sirasina gore yazdiralim
		
		String cumle = "Java ogrendim,  #cok para?kazandim.,";
		
		String kelimeler[] = cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler)); 		// [Java, ogrendim,, , #cok, para?kazandim.,]
		
		for (int i = 0; i < kelimeler.length; i++) {
			kelimeler[i] = kelimeler[i].replaceAll("\\W", "");
	//		System.out.println(kelimeler[i]);
		}
		
		System.out.println(Arrays.toString(kelimeler)); 		// [Java, ogrendim, , cok, parakazandim]
		
		Arrays.sort(kelimeler);
		System.out.println(Arrays.toString(kelimeler)); 		// [, Java, cok, ogrendim, parakazandim]
				
		for (int i = 0; i < kelimeler.length; i++) {
			System.out.print(kelimeler[i] + " "); 				//  Java cok ogrendim parakazandim 
		}
	}

}
