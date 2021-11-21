package day16_forLoops;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un veya 5”in kati olan sayilari yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("100’den kucuk bir tamsayi giriniz");
		int num = scan.nextInt();
		
		for (int j = 1; j <= num; j++) {			
			if (j%3==0 || j%5==0) {
				System.out.print(j + " ");
			}
		}

/*		System.out.println();
		for (int j = 1; j <= num; j++) {			
			if (j%3==0) {
				System.out.print(j + " ");			
			} 
		}
		System.out.println();
		for (int j = 1; j <= num; j++) {			
			if (j%5==0) {
				System.out.print(j + " ");			
			} 
		}
*/
		
		scan.close();
	}

}
