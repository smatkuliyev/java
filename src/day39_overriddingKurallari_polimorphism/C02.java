package day39_overriddingKurallari_polimorphism;

public class C02 extends C01 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
			
		C02 obj1 = new C02();
		obj1.privateMethod();
		obj1.staticMethod();
		
		
		C01 obj2 = new C02();
	//	obj2.privateMethod();		// data turu C01,  private a ulasamaz ki, ondan dolayi override yapamayiz
		// signature ayni olmasina RAGMEN bu 2 method farkli method olarak calisir
		
		
		
		obj2.staticMethod();
		// static method'lar override edilemez
		// signature ayni olmasina RAGMEN bu 2 method farkli method olarak calisir
		
	}
	
	public static void staticMethod() {
		System.out.println("Child class static method");
	}
	
	private void privateMethod() {
		System.out.println("Child class private method");
	}
	
/*	public final void finalMethod() {
		System.out.println("Child class final method");
	}
*/	
}
