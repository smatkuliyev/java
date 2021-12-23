package day48_maps_TheEND;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethods {

	public static void main(String[] args) {
		
		Map<Integer, String> ornekMap =  MapOlustur.myMap();
		
		System.out.println(ornekMap);
		System.out.println(ornekMap.containsKey(110)); 								// false
		System.out.println(ornekMap.containsValue("Java"));							// false
		System.out.println(ornekMap.containsValue("Mustafa, Kan, JAVA"));			// true
		
		Set<Entry<Integer, String>> entrySet = ornekMap.entrySet();
		
		int sayac = 1;
		for (Entry<Integer, String> each : entrySet) {
			System.out.println(sayac + ".entry : " + each);
			sayac++;
		}
		
		System.out.println(ornekMap.getOrDefault(110, "Yok dedim ya")); 			// Yok dedim ya
		System.out.println(ornekMap.getOrDefault(102, "Yok dedim ya")); 			// Veli, Yan, java
		
		ornekMap.putIfAbsent(103, "Ali, Yan, C#"); 									// eklemeyecek
		ornekMap.putIfAbsent(110, "Fikri, Yan, QA"); 									// eklemeyecek
		
		sayac = 1;
		for (Entry<Integer, String> each : entrySet) {
			System.out.println(sayac + ".entry : " + each);
			sayac++;
		}
		
		String maptenString = ornekMap.toString();
		System.out.println(maptenString);
		
	}

}
