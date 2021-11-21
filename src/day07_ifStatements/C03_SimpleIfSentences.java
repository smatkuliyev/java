package day07_ifStatements;

import java.util.Scanner;

public class C03_SimpleIfSentences {

	public static void main(String[] args) {
	/*	Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
			Ornek:
				gun=Pazar output = “Hafta sonu”
				gun=Sali output = “Hafta ici”
			*** String icin equals method’unu kullanin
	*/
		Scanner scan = new Scanner(System.in);
		System.out.print("Bugun hangi gun ? : ");
		String gun = scan.next().toLowerCase();
		
		if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma") ) {
			System.out.println("Haftaici");
		}
		if (gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("Haftasonu");
		}
		
		// Non-primitive olduðu için == kullanýlamaz, bunun yerine .equals() kullanýlýr
		scan.close();
	}

}
