package day05_mathOperations;

public class C01_MathOperations {

	public static void main(String[] args) {
		
		System.out.println(4 * (2 + 5) / 2);  // 14
		
		System.out.println(4 * (2 + 5) / 3);  // 9
		
		double sonuc = 4 * (2 + 5) / 3;
		
		System.out.println(sonuc);  // 9.0
		
		sonuc = (double)(4 * (2 + 5) / 3);
		
		System.out.println(sonuc);  // 9.0
		
		sonuc = (double)4 * (2 + 5) / 3;
		
		System.out.println(sonuc);  // 9.333334...;
		
		int sayi1 = 5;
		int sayi2 = 2;
		double sayi3 = 2;
		
		System.out.println(sayi1 / sayi2);
		System.out.println(sayi1 / sayi3);
		
		
	}

}
