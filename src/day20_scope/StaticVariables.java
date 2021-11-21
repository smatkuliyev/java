package day20_scope;

public class StaticVariables {
	
	static int no = 20;
	static int sayi;
	static String adres = "Ankara";
	static String cadde;
	static boolean aktifMi = true;
	static boolean tatildeMi ;
	

	public static void main(String[] args) {
		// static var'a main method dan direk ulasilabilir mi? EVET
		
		System.out.println(no); 			// 20
		no++;
		System.out.println(no);				// 21
		staticMethod();
		System.out.println(no);				// 22
		
		StaticVariables obje = new StaticVariables();
		obje.staticOlmayanMethod();
		System.out.println(no);				// 23
		
		
	}
	
	public static void staticMethod() {
		// static var'a static method dan direk ulasilabilir mi? EVET
		no++;
		System.out.println("static method'da no : " + no); 	// 22
	}
	
	public void staticOlmayanMethod() {
		// static var'a static olan veya olmayan method dan direk ulasilabilir -- mi? EVET
		// bu yuzden static varaible'lara CLASS VARIABLE denir.
		no++;
		System.out.println("static olmayan method'da no : " + no); 	// 23
	}

}
