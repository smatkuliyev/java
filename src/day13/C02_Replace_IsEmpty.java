package day13;

public class C02_Replace_IsEmpty {

	public static void main(String[] args) {
		
		String sonuc = "10,000";
		
	//	System.out.println(sonuc);
		
		sonuc = sonuc.replaceAll(",", "");
		
	//	System.out.println(sonuc);
		
		if (Integer.valueOf(sonuc) > 1000) {
			System.out.println("1000 den buyuk");
		} else {
			System.out.println("1000 den kucuk");
		}
				

	}

}
