package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C01_Forloop {

	public static void main(String[] args) {
		// Kullanicidan 2 tam sayi isteyin, ilk sayidan baslayarak ikinci sayiya kadar 3er, 3er yazdirin.
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Lutfen 2 tam sayiyi art arda enter e basarak giriniz : "); 		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
	
		if (sayi1 > sayi2) { 				// azalarak gidecek			
			for (int i = sayi1; i >= sayi2; i-=3) {
				System.out.print(i + " ");
			}
			
		} else if(sayi1<sayi2) { 			// artarak gidecek				
			for (int i = sayi1; i <= sayi2; i+=3) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("Girilen sayilar esit");
		}
		scan.close();
	}
}
