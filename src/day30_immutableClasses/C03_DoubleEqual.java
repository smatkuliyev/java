package day30_immutableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {
		// Java'da String 2 turlu olusturulabilir
		// 1 - non-primitive oldugu icin new kewword ile
		// java once esitligin sagina baktigindan new kelime oldugu icin once obje olusturur sonra degeri atar
		// yani bu olusturma seklinde her zaman yeni bir obje olusur
		
		// 2- bugune kadar ogrendimiz gibi olusturursak, String str2 = "Mustafa";
		// Java bu durumda esitligin saginda olan String'in STRING HAVUZ'unda olup olmadigini kontrol eder
		// ve havuzda varsa yeni obje olusturmaz, oncekinin referansina yeninin referansini da ekler
		
		String str1 = "Mustafa";
		String str2 = "Mustafa";
		
		String str3 = new String("Mustafa");
		String str4 = new String("Mustafa");
		
		System.out.println(str1 == str3); 			// false
		System.out.println(str1.equals(str3)); 		// true
		
		System.out.println(str4 == str3); 			// false
		System.out.println(str4.equals(str3)); 		// true
		
		System.out.println(str1 == str2); 			// true      why?
		
		
	}

}
