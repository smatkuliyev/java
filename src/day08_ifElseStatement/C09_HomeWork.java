package day08_ifElseStatement;

import java.util.Scanner;

public class C09_HomeWork {

	public static void main(String[] args) {
		/* Soru 5) 	Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
					isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
					gecerli degilse “Gecerli gun ismi giriniz” yazdirin												*/
		
		Scanner scan = new Scanner(System.in);       
        System.out.println("Lutfen bir gun giriniz : ");
        String gun = scan.next().toLowerCase();
        
        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") 
        		|| gun.equals("cuma") ||gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println(gun.substring(0,1).toUpperCase() + gun.substring(1,3));
		} else {
			System.out.println("Gecerli gun ismi giriniz");
		}
        
        
        
        scan.close();
	}

}
