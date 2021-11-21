package day11_stringManipulations;

public class C03_Length {

	public static void main(String[] args) {
		
		String str1 = "Ali Kahyaoglu";
		System.out.println(str1.length());						// 13
		
		// str1'in son harfini yazdirin
		
		System.out.println(str1.charAt(str1.length() - 1));		// u
		
		String str2 = "";
		System.out.println(str2.length());						// 0
		
		String str3 = null;										// su an bilerek olusturdum ve bilerek deger atamadýk ama sonra kullanacagim
	//	System.out.println(str3.length());						// hata
		
		System.out.println(str3);								// null		
		
	//	String str4 ;	
	//	System.out.println(str4);								// hata veriyor onun icin str3'de null kullaniyoruz. String olusturup deger atamazsak hata verir.
		
	}

}
