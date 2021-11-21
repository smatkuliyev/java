package day19_whileLoop_DoWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {

		int i = 0;
		 while (i < 5) {
			System.out.print(i + " ");		// 0 1 2 3 4 
			i++;
		}
		 
		 // while loop once kontrol eder sonra kodu calistirir
		 // loop icinde artis yapilsa da bir sonraki kontrole kadar kod calismaya devam eder
		 // bu da bazi durumlarda hatali sonuclara ulasmamiza sebep olabilir
		 
		 System.out.println();
		 
		 // do-while loop ise once islemi yapar ve sonra sarti kontrol eder
		 // ozellikle kullanicidan deger almalarda do while loop tercih edilir
		 int j = 0;
		 do {
			System.out.print(j + " ");
			j++;
		} while (j < 5);
		 
		 
	}

}
