package day27_constructor_constructorCall;

public class C02_ParametreliConstructor {

	public static void main(String[] args) {
		// Java'nin olusturdugu default constructor ile obje olusturabiliyoruz
		// ama her obje icin yeniden deger atamasi  yapmak uzun oluyor
		// istersek parametreli constructorlar olusturup 
		// daha obje olustururken istedigim ozellikleri atayabiliriz
		
		Car1 car1 = new Car1(50000, "Vectra" , "Beyaz", 2015, true);
							// (int km, String model, String renk, int yil, boolean satilikMi);
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satilikMi);
		
		Car1 car2 = new Car1(3500);
						// int km
		
		System.out.println(car2.km); 	// 3500
		
		Car1 car3 = new Car1();
		System.out.println(car3.km); 	// 0
		
		Car1 car4 = new Car1(1000);
		System.out.println(car4.km);
		
		// yil ve km i girebilecek parametreli constructor
		
		Car1 car5 = new Car1(2020, 5000);
						// 	 yil    km
		
		System.out.println(car5.yil + " " + car5.km + " " + car5.model); 	// 2020 5000 null
		
	}

}
