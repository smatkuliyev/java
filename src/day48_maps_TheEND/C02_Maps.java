package day48_maps_TheEND;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		// 	Soru 3 ) 	Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
		//				mapè { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		// 				Istenen dil è java
		// 				Sonuc è [Ali, Veli]
		
		Map<Integer, String> soruMap =  MapOlustur.myMap();
		
		String istenenDil = "Java";
		
		dilBilenListesiOlustur(soruMap, istenenDil);	
		
		System.out.println(dilBilenListesiOlustur(soruMap, istenenDil));

	}

	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {
		List<String> dilBilenListesi = new ArrayList<>();
		// { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		// istenenDil = "Java";
		soruMap.values(); 													// bana collection donduruyor
		
		List<String> valueList = new ArrayList<>(soruMap.values());
	//	System.out.println(valueList); 										// [Ali, Can, java, Veli, Yan, java, Ali, Yan, C#], 3 tane eleman
	//	bu uc elemani tek tek alip split ile bolup dil degeri verilen input'a esit olanlarin isim degerlerini dilBilenListesi'ne ekleyecegim
		
		String parcaliArr[] = new String[3];
		
		for (String each : valueList) {
			parcaliArr = each.split(", "); 		// [Ali, Can, Java] seklinde 2 elemanli bir array getirecek
			
			if (parcaliArr[2].equalsIgnoreCase(istenenDil)) {
				dilBilenListesi.add(parcaliArr[0]);
			}
		}
		
		return dilBilenListesi;
	}

}
