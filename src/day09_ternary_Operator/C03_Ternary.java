package day09_ternary_Operator;

public class C03_Ternary {

	public static void main(String[] args) {
		int x = 10;
		String tekMiCiftMi = x%2==0 ? "cift sayi" : "tek sayi" ;
		
		System.out.println(tekMiCiftMi);	// cift sayi
		
		System.out.println(x % 2 == 0 ? "cift sayi" : "tek sayi"); 	// cift sayi
		
		// Ternary yi 2 sekilde kullanabiliriz, assign ederiz veya syso yaparız
		
		// eger ternary'de donecek sonuclar ayni data turunden degilse, atama yapamayiz
		
		System.out.println(x > 5 ? "aferin" : 4); 	//	aferin
		
		//	String sonuc = x > 5 ? "aferin" : 4 ;
		
	}

}
