package day28_constructorCall_staticKeyword;

public class C02 {
	
	int x = 5;
	static int y = 10;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 3 tame obje olusturalim ve degisimleri gozlemleyelim
		
		C02 obje1 = new C02();
		System.out.println("obje1 icin x : " + obje1.x + ", obje1 icin y : " + y);	// 5 10
		obje1.x++;
		y++; 		// obje1.y++;
		System.out.println("obje1 icin x : " + obje1.x + ", obje1 icin y : " + y);	// 6 11
		
		//ayni class icinde iken static variablee'lara ulasmak icin obje ye ihtiyac yok
		// ancak static variable'a static yoldan ulas diyor, ayni class'ta oldugu icin class ismini  yazmaya da gerek yok
		
		System.out.println();
		
		C02 obje2 = new C02();
		System.out.println("obje2 icin x : " + obje2.x + ", obje2 icin y : " + obje2.y);	// 5 11
		obje2.x++;
		obje2.y++;
		System.out.println("obje2 icin x : " + obje2.x + ", obje2 icin y : " + obje2.y);	// 6 12 
		
		System.out.println();
		
		System.out.println("obje1 icin x : " + obje1.x + ", obje1 icin y : " + obje1.y);	// 6 12
		
		System.out.println();
		
		C02 obje3 = new C02();
		obje3.x = 20;
		obje3.y = 40;
		
		System.out.println("obje3 icin x : " + obje3.x + ", obje3 icin y : " + obje3.y);	// 20 40
		
		System.out.println();
		
		System.out.println("obje2 icin x : " + obje2.x + ", obje2 icin y : " + obje2.y);	// 6 40
		System.out.println("obje1 icin x : " + obje1.x + ", obje1 icin y : " + obje1.y);	// 6 40
	
	}

}
