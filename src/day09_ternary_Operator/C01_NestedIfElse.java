package day09_ternary_Operator;

import java.util.Scanner;

public class C01_NestedIfElse {

	public static void main(String[] args) {
        /* Soru
        11 Nested If kullanarak asagidaki soruyu cozen kodu yaziniz
        Kullanicidan bir sifre girmesini isteyin 
        Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin Ilk harf A ise
        “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin
        Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin Ilk harf z ise
        “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin                               */
		
		Scanner scan = new Scanner(System.in);   
		System.out.println("Sifrenizi girin : ");		
		char sifre = scan.next().charAt(0);
		
		if (sifre >= 'A' && sifre <= 'Z') {                    //buyk harfleri sececek
			
            if (sifre == 'A') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }
            
        } else if(sifre >= 97 && sifre <= 122 ) {           // kucuk harfleri sececek
            
            if (sifre == 'z') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }
            
        } else {											// geriye kalan tum karakterleri sececek
        	
            System.out.println("Gecerli sifre olmasi icin harf ile baslayin ");
        }
		
		 scan.close();
	}

}
