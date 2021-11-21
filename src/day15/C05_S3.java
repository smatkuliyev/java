package day15;

import java.util.Scanner;

public class C05_S3 {

	public static void main(String[] args) {
		// Soru 3) 	Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
		//			- @ isareti icermiyorsa gecersiz email yazdirin
		//			- @gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
		//			- @gmail.com ile bitmiyorsa "Yazimda bir sorun var, maili kontrol ediniz"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gmail adresinizi giriniz : ");
		String email = scan.next();
		
		if (!email.contains("@")) {
			System.out.println("Gecersiz email");
		}else if (!email.contains("@gmail.com")) {
			System.out.println("Lutfen gmail adresinizi girin");
		} else if (!email.endsWith("@gmail.com")) {
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		} else {
			System.out.println("Islem basari ile gerceklesti");
		}
		
		scan.close();
	}

}
