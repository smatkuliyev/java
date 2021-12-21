package day47_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

	public static void main(String[] args) {
		// icice map olusturacaksak en iceridekinden baslamaniz tavsiye olunur
		
		Map<String,String> ogr1Map = new HashMap<>();
		ogr1Map.put("isim", "Ali");
		ogr1Map.put("soyisim", "Can");
		ogr1Map.put("brans", "J.dev");
		
		Map<String,String> ogr2Map = new HashMap<>();
		ogr2Map.put("isim", "Veli");
		ogr2Map.put("soyisim", "Yan");
		ogr2Map.put("brans", "Qa");
		
		Map<String,String> ogr3Map = new HashMap<>();
		ogr3Map.put("isim", "Ali");
		ogr3Map.put("soyisim", "Yan");
		ogr3Map.put("brans", "C#");
		
		Map<String,String> ogr4Map = new HashMap<>();
		ogr4Map.put("isim", "Ayse");
		ogr4Map.put("soyisim", "Can");
		ogr4Map.put("brans", "QA");
		
	/*	System.out.println(ogr1Map);
		System.out.println(ogr2Map);
		System.out.println(ogr3Map);
		System.out.println(ogr4Map);
	*/	
		Map<Integer, Map<String,String>> sinifMap = new HashMap<>();
		sinifMap.put(101, ogr1Map);
		sinifMap.put(102, ogr2Map);
		sinifMap.put(103, ogr3Map);
		sinifMap.put(104, ogr4Map);
		
		System.out.println(sinifMap);
	//	{
	//	101={soyisim=Can, brans=J.dev, isim=Ali},
	//	102={soyisim=Yan, brans=Qa, isim=Veli}, 
	//	103={soyisim=Yan, brans=C#, isim=Ali}, 
	//	104={soyisim=Can, brans=QA, isim=Ayse}
	//	}
		
	}

}
