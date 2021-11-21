package day20_scope;

public class InstanceVar2 {
	
	String adres="Ankara";
	String dogumYeri;
	double notOrtalamasi;
	double yasOrt= 12.3;
	char cinsiyet = 'E';
	char karakter;
	boolean orgenciMi = true;
	boolean izinliMi;

	public static void main(String[] args) {
		// instance var a main method dan direk ulasilabilir mi? HAYÝR
		// nasil ulasabilri ? OBJE olusturarak
		
		InstanceVar2 ali = new InstanceVar2();
		
		System.out.println(ali.adres); 				// Ankara
		System.out.println(ali.dogumYeri);			// null
		System.out.println(ali.notOrtalamasi);		// 0.00
		System.out.println(ali.yasOrt);				// 12.3
		System.out.println(ali.cinsiyet);			// E
		System.out.println(ali.karakter);			// space
		System.out.println(ali.orgenciMi);			// true
		System.out.println(ali.izinliMi);			// false

	}
	
	public static void staticMethod() {
		// instance var a static method dan direk ulasilabilir mi? HAYÝR
		// nasil ulasabilri ? OBJE olusturarak
		
	}
	
	public void staticOlmayanMehtod() {
		// instance var a static Olmayan method dan direk ulasilabilir mi? EVET
		
	}
	
}
