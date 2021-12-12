package day39_overriddingKurallari_polimorphism;

public class C01 {
	
	public static void staticMethod() {
		System.out.println("Parent class static method");
	}
	
	@SuppressWarnings("unused")
	private void privateMethod() {
		System.out.println("Parent class private method");
	}
	
	
	// final demek bu son hali bir daha degistirilemez demektir, dolaysiyla final olarak tanimlanan method override edilemez
	public final void finalMethod() {
		System.out.println("Parent class final method");
	}
	
	// child class ve parent class ayni package'de oldugundan method'larin access modifier'lari public,protected,default olsaydý sorun olmazdi
	
	
}
