package day27_constructor_constructorCall;

import day26_forEachLoop_constructor.Car;

public class C01_CarRunner {

	public static void main(String[] args) {
		// Dunku Car class'in bir obje olusturmak istedigimizde
		// Java Car class'ini icinde bulundugumuz class'a import etmek isteriz
		
		Car car = new Car();
		System.out.println(car.yil );
		// ancak baska package'da oldugu icin icinde oldugumuz class'dan
		// Car class'indaki variable'lara ulasabilmek icin var'larin access modifier ini -public- yapmaliyiz

		
		Car1 car1 = new Car1();
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satilikMi); 	// 0 null null 2000 false
		
		car1.km = 75;
		car1.model = "Corolla";
		car1.renk = "Kirmizi";
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satilikMi); 	// 75 Corolla Kirmizi 2000 false
		
		Car1 car2 = new Car1();
		System.out.println(car2.km + " " + car2.model + " " + car2.renk + " " + car2.yil + " " + car2.satilikMi); 	// 0 null null 2000 false
		
		Car1 car3 = new Car1();
		car3.km = 40;
		car3.satilikMi = true;
		System.out.println(car3.km + " " + car3.model + " " + car3.renk + " " + car3.yil + " " + car3.satilikMi); 	// 40 null null 2000 true
		
		
	}
}
