package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_HW_S2 {

	public static void main(String[] args) {
		
		// Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		
		List<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(4);
		list.add(7);
		
		int toplam = 0;
		
		for (Integer each : list) {
			toplam+=each*each;
		}
		 System.out.println(toplam);
	}
	
}
