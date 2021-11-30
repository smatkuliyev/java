package day29_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// Main method'dan diger method'lara veya diger method'lardan main method'a bir variable gonderirseniz
		// Java orijinal variable'leri degil onlarin degerlerini(value) goturur, orijinal variable'in degeri degismez
		
		// Biz 100 tl ye satilan bir urun icin 2 farkli indirim uygulayan 2 method olusturalim
		
		int fiyat = 100;
		
		System.out.println(indirimYap25(fiyat)); 										// 75
		System.out.println("Method'dan sonra main method'daki fiyat : " + fiyat); 		// 100
		
		// indirimli kalici yapmak istiyorsaniz main method'da atama yapmaniz lazim
		fiyat = indirimYap10(fiyat);														
		System.out.println("Method'dan sonra main method'daki fiyat : " + fiyat);		// 90
		
	}
	private static int indirimYap25(int fiyat) {
		fiyat*=0.75;
		
		return fiyat;
	}

	private static int indirimYap10(int fiyat) {
		fiyat*=0.9;
		
		return fiyat;
	}

}
