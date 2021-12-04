package day32_varargs_stringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {
		
		// varargs list gibi davraniyor ama
		// array method'lari ile calisir
		
		topla("Ali Can", 5,10,13,0);
		
		// varargs'dan once farkli parametreler kullanabiliriz,
		// ama varargs'dan sonra parametre yazilamaz,
		// yazarsaniz java varargs son parametre olmalidir diye sizi uyarir ve CTE verir
		
	}

	private static void topla(String iltstr , int... sayilar) {
		
		int toplam = 0;
		
		for (int each : sayilar) {
			toplam+=each;			
		}
		System.out.println("Girilen sayilarin toplami : " + toplam);
	}

}
