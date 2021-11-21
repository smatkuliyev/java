package day19_whileLoop_DoWhileLoop;

public class C05_DoWhileLoop {
	
	public static void main(String[] args) {
		// Soru 2 ) ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.
		System.out.println("*****	For Loop	*****\n");
		for (char i = 'm'; i > 'c'; i--) { 		// char (harf) vs int (ascii)
			System.out.print(i + " ");
		}

		System.out.println("\n\n*****	While Loop	*****\n");
		
		char krk = 'm';
		while (krk > 'c') {
			System.out.print(krk + " ");
			krk--;
		}

		System.out.println("\n\n*****	Do While Loop	*****\n");
		
		char ch = 'm';
		do {
			System.out.print(ch + " ");
			ch--;
		} while (ch > 'c');
	}

}
