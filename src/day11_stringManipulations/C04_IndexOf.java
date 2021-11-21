package day11_stringManipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		
		String str = "Calisirsaniz, Java ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s'));		// 4
		System.out.println(str.indexOf("J"));		// 14
		
		System.out.println(str.indexOf("ava"));		//15 ,	charSequence bir butun olarak algilar ve baslangic index'ini bize verir
		
		int index = str.indexOf("r");				// indexOf method'u bize her zaman integer deger doner
		System.out.println(index);					// 6
		
		System.out.println(str.indexOf("q"));		// -1 sonucu donerse o degerin olmadigini bildirir.
		
		System.out.println(str.indexOf('A'));		// -1
		
		System.out.println(str.indexOf('a', 10)); 	// 15 , 10'onuncu index'ten sonra gelen ilk a'nin index'ini verir
	}

}
