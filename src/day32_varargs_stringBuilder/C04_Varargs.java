package day32_varargs_stringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
		
		// varargs list gibi davraniyor ama
		// array method'lari ile calisir
		
		kafanaGoreIslem(5,10,13,0);
		
		// Varargs'da HIC ELEMAN olmasa da java hic itiraz etmez
		// once int olarak tanimlanan sayilari eslestiri kalan tum sayilari varargs'a doldurur
		
	}

	private static void kafanaGoreIslem(int sayi1, int sayi2, int sayi3, int sayi4, int... sayilar) {
		
		int toplam = 0;
		
		for (int each : sayilar) {
			toplam+=each;			
		}
		System.out.println("ilk sayi ile diger sayilarin toplamin carpimi : " + sayi1*toplam);
		
	}

}
