package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan toplanmak uzere sayi isteyin, kullanici sifira basincaya kadar sayilari alip toplamaya devam edin, 
		// kullanici sifira bastiginda,
		// o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin
		
		
		// kullanicidan 5 sayi alin derse
		
		for (int i = 1; i <= 5; i++) {
			//kullanicadan bir deger alip, toplama eklerim
		}
		
		Scanner scan = new Scanner(System.in);

		int sayi = 10; // 0 in disinda ne yazarsak olur
		int toplam = 0;
		int sayac = 0;
		
		while (sayi!=0) {
		System.out.println("Lutfen toplama eklemek icin bir tamsayi giriniz : \nbitirmek icin 0'a basin");	
		sayi = scan.nextInt();
		toplam+=sayi;
		sayac++;
		}
		// kullanici 0 a bastiginda loop islevini son kez yapip, sonra basa donecek ve loop bitecek
		System.out.println("Girilen sayi adedi : " + (sayac-1));		//0'i sayaca eklemesini istemedigimiz icin, onu bitirmek icin verdik
		System.out.println("Girilen sayilarin toplami : " + toplam);
		
		scan.close();
	}

}
