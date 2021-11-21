package day16_forLoops;

public class C01_ForLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {				//for loop baslangic ve bitis sarti bir sayinin degerine bagli olan durumlarda tercih edilir.
			System.out.print(i + " ");
		//	System.out.println(i + " ");
		}
		
		
	/*	for (int i = 0; i <= 10; i--) {				// sart saglanmadigi icin sonsuz loop olur, bu bir kodlama hatasi
			System.out.print(i + " ");				// bu duruma sonsuz loop deriz ve bunun gerceklesmesini istemeyiz
			System.out.println(i + " ");
		}																*/
		
		for (int i = 0; i > 10; i++) {				// eger ilk deger icin bitis sarti true olmazsa daha ilk adimda loop broken olur.
			System.out.print(i + " ");				// loop calisir ama (body calismaz) hic bir islem calismaz.
		}
		
		
	}

}
