package day25_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Sort_Set {

	public static void main(String[] args) {
		
		List<String> isimler = new ArrayList<>();
		
		isimler.add("Kutlu");
		isimler.add("Emrah");
		isimler.add("Ferhat");
		isimler.set(1, "Ahmet");
		
		System.out.println(isimler);
		
		Collections.sort(isimler);
		System.out.println(isimler);
		
		isimler.add("Filiz");
		System.out.println(isimler);
		
		Collections.sort(isimler);
		System.out.println(isimler);
		
		/*
		 * System.out.println( first equals( second ))); // true
		 * hayvan.clear();
		 * System.out.println(hayvan .isEmpty ()); // false
		 */
		
	}

}
