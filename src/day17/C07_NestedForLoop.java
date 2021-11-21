package day17;

public class C07_NestedForLoop {

	public static void main(String[] args) {
		// 1'den 4'e kadar sayilari yan yana aralarinda bir bosluk birakarak yazdirin
		
		
		for (int s = 1; s <= 3; s++) {
			
			for (int i = 1; i <= 5; i++) {
				System.out.print(s*i + " ");
			}
			System.out.println();
		}

	}

}
