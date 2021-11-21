package day04_incrementDecrement;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		
		int sayi1 = 300;
		
		short sayi2 = (short) sayi1;
		
		System.out.println("sayi2 : " + sayi2); // 300;
		
		byte sayi3 = (byte) sayi2;
		
		System.out.println("sayi3 : " + sayi3); // 44;
		
		double sayi4 = 87.3;
		
		int sayi5 = (int) sayi4;
		
		System.out.println("sayi5 : " + sayi5);  // 87;
		
		int sayi6 = 27;
		int sayi7 = 4;
		
		System.out.println(sayi6 / sayi7);       // 6;
		
		double sayi8 = 4;
		
		System.out.println(sayi6 / sayi8);       // 6.75;
		
		double sayi9 = 17;
		
		System.out.println(sayi9 / sayi7);       // 4.25;
		
		
		
	}

}
