package day12;

public class C05_Contains {

	public static void main(String[] args) {
		
		String str = "Calisirsaniz, Java ogrenmek cok kolay";	//sadece String icin kullanilabilir
		
		System.out.println(str.contains(" "));				// true
		System.out.println(str.contains("z, J"));			// true
		System.out.println(str.contains("Java"));			// true
		System.out.println(str.contains("Hasan"));			// false
	}

}
