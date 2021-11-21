package day19_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Lutfen bolenlerini bulmak icin pozitif bir tam sayi giriniz : ");
		int sayi = scan.nextInt();
		int sayac = 0;
		int bolen = 1;
	//	int toplam = 0;
		
		while (bolen <= sayi) {
			if (sayi%bolen == 0) {
				System.out.print(bolen + " ");
				sayac++;
	//			toplam+=bolen;
			}
			bolen++;
		}
		System.out.println("");
	//	System.out.println("bolenlerin toplami : " + toplam);
		System.out.println(sayi + " sayisinin " + sayac + " adet tam boleni vardir.");
		
/*		for (int i =1; i <= sayi; i++) {
			
			if (sayi%i==0) {
				toplam+=i;
			}			
		}
		System.out.println(toplam);				*/
		
		scan.close();
	}

}
