package day26_forEachLoop_constructor;

public class C02_HW_S4 {

	public static void main(String[] args) {
		// Bir String olusturunuz, bu String’deki character’leri for each loop kullanarak yazdiriniz. ipucu: split()
		
		String str = "Ahmet ise gitti";
		
		String arr[] = str.split("");
		
		for (String each : arr) {
			System.out.print(each + " ");
		}
				
	}

}
