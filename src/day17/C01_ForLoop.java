package day17;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		/* Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
		 - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
		 - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
		 - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("100’den kucuk bir tamsayi giriniz");
		int num = scan.nextInt();
		
		for (int j = 1; j <= num; j++) {
			
			if (j%3==0 && j%5==0) {
				System.out.print("Java Guzeldir" + " ");
			} else if (j%3==0) {
				System.out.print("Java" + " ");			
			} else if (j%5==0) {
				System.out.print("Guzeldir" + " ");			
			} else {
				System.out.print(j + " ");
			}
		}

		scan.close();
	}

}
