package day21_scope_arrays;

public class C01_LocalVariables {
	
	String okulIsmi;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Java local variable'lara default deger atamaz, ondan dolayi sorun yasamamak icin uygun deger atamamizda fayda var
		
		int sayi = 0; 					//int sayi; dersek java CTE verir
		System.out.println(sayi);
		
		String isim  = "Ali";
	}

	public static void staticMethod() {
//		sayi;		// Bir localde olusturulan variable (method'larin static olup olmamasina bagli olmaksizin) farkli localde kullanilamaz
		
		@SuppressWarnings("unused")
		String isim = "Veli";
	}
	
}
