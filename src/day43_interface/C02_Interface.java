package day43_interface;

public interface C02_Interface {
	
	void motor(); 						//interface'de method'lara access modifier yazmazsaniz java public olarak kabul eder. public, abstract olur
	
	int sayi = 10;						// variable'lari public olarak kabul eder. public, static, final olur
	
	
	// interface'de body'si olan method yazmak isterseniz
	// Java size 2 alternatif suanr
	// 1 - method'un basina "default" keyword yazabilirsiniz ancak burada yazilan default access modifier degil,
	// 		Java'nin interface icin ozel kabul etti bir keyword'tur
	
	
	
	
	
	public default void kaporta() { 
		System.out.println("default keyword sayesinde body olusturabildim");
	}
	
	public static void sanzuman() {
		System.out.println("static keyword sayesinde body olusturabildim");
	}
	
}
