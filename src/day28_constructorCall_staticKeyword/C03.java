package day28_constructorCall_staticKeyword;

public class C03 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Java run time programdir
		// run tusuna bastigimizda java calimaya baslar ve islemleri yapar
		// javanin isi bittiginde (calisma tusu kirmizidan griye dondugunde) her sey basa doner
		
		//static variable'lar ve method'lar bulunduklari class ile ilintilidir(obje ile degil class ile)
		// dolaysiyla baska bir class'da iken C02'deki static variable veya method'a ulasmak istedigimizde
		// C02.staticVariableIsmi ve C02.staticMethodIsmi() yazmamiz yeterli olur
		
		
		C02 obje1 = new C02();
		System.out.println("obje1 icin x : " + obje1.x + ", obje1 icin y : " + C02.y);	// 5 10
		obje1.x++;
		obje1.y++;   	// C02.y++;
		// static variable e static yoldan ulas, niye obje uzerinde ulasmaya calisiyorsun?
		System.out.println("obje1 icin x : " + obje1.x + ", obje1 icin y : " + C02.y);	// 6 11
		
		System.out.println();
		
		C02 obje2 = new C02();
		System.out.println("obje2 icin x : " + obje2.x + ", obje2 icin y : " + C02.y);	// 5 11
		obje2.x++;
		C02.y++;
		System.out.println("obje2 icin x : " + obje2.x + ", obje2 icin y : " + C02.y);	// 6 12 
		
		System.out.println();
		
		System.out.println("obje1 icin x : " + obje1.x + ", obje1 icin y : " + C02.y);	// 6 12
		
		System.out.println();
		
		C02 obje3 = new C02();
		obje3.x = 20;
		C02.y = 40;
		
		System.out.println("obje3 icin x : " + obje3.x + ", obje3 icin y : " + C02.y);	// 20 40
		
		System.out.println();
		
		System.out.println("obje2 icin x : " + obje2.x + ", obje2 icin y : " + C02.y);	// 6 40
		System.out.println("obje1 icin x : " + obje1.x + ", obje1 icin y : " + C02.y);	// 6 40
	
	}

}
