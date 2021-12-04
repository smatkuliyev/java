package day32_varargs_stringBuilder;

public class C02_Varargs {

	public static void main(String[] args) {
		
		// varargs list gibi davraniyor ama
		// array method'lari ile calisir
		
		topla(5,10,13,0);
		
	}

	private static void topla(int... sayilar) {
		
		int toplam = 0;
		
		for (int each : sayilar) {
			toplam+=each;			
		}
		System.out.println("Girilen sayilarin toplami : " + toplam);
	}

}
