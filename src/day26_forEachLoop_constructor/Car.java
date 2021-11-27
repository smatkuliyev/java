package day26_forEachLoop_constructor;

public class Car {
	// Java biz bir class olusturdugumuzda , o class'dan obje uretecegimizi bilir
	// ve her class'a default bir constructor yerlestirir
	// Java'nin class'a koydugu bu default constructor gorulmez
	// ama obje uretmek uzere kod yazdigimizda otomatik olarak devreye girer
	
	// Bir constructor olusturmak cok kolaydir
	// method'a benzer ama method'dan farklidir
	// 1- Constructor ismi class ismi ile ayni olmalidir.
	// Class isimleri buyuk harf ile basladigi icin Constructor ismi de buyuk harf ile baslar
	// ( method'dan 1.farki budur, method'lar kucuk harfle baslar)
	// 2- Constructor'larin return type'i olmaz
	// (method'dan 2.farki budur, method'larin mutlaka return type'i olmalidir)
	
	Car() {
		
	}
	// Java'nin her class'da olusturdugu constructor budur
	
	
	int yil = 2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	
	// Bugun itibariyle class'larda main method olma mecburiyeti kaldirilmistir.
	// ancak bildigimiz gibi main method olmayan bir class direk calistirilamaz
	// main method'u olmayan class'lar baska class'lardan obje olusturularak kullanilmak uzere
	// ihtiyac duyulan varilable ve method'lari sakladigimiz depo gibidir
	
}
