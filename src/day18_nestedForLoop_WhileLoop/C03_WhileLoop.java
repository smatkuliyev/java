package day18_nestedForLoop_WhileLoop;

public class C03_WhileLoop {

	public static void main(String[] args) {
		// 20 den 30a kadar olan sayilari while loop ile yazdirin
		
		for (int i = 20; i <= 30; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int i = 20;
		while (i<=30) {
			System.out.print(i + " ");
			i++;
		}

		// for loop ile cozebildigimiz sorularda while loop kullanmak kodumuzu biraz uzatir
		
	}

}
