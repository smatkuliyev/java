package day04_incrementDecrement;

public class C03_DataCasting_AutoWidening {

	public static void main(String[] args) {
		
		byte sayi1 = 44;
		
		short sayi2 = sayi1;
		
		System.out.println("sayi2 : " + sayi2); // 44
		
		int sayi3 = 55;
		
		double sayi4 = sayi3;
		
		System.out.println("sayi4 : " + sayi4); // 55.0

	}

}
