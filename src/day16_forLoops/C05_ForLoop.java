package day16_forLoops;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("100’den kucuk bir tamsayi giriniz");
		double sayi = scan.nextDouble();
		int num = (int) sayi;
		
		
		if (num <0) {
			System.out.println("Negatif sayi giremezsiniz");
			
		} else if(sayi != num) {
			System.out.println("Lutfen tam sayi giriniz");
			
		} else if(num > 100) {
			System.out.println("Lutfen 100'den kucuk sayi giriniz");
			
		} else {
			
			for (int j = 1; j <= num; j++) {			
				if (j%3==0) {
					System.out.print(j + " ");
				}
			}
			
		}
	
		scan.close();
		
		//kullanýcý dogru sayi girene kadar tekrar tekrar nasil  sayi girmesini isteyebiliriz ?
	}
}
