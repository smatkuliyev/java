package day13;

public class C06_2_Soru {

	public static void main(String[] args) {
		// Soru 2 : String seklinde verlen asagidaki fiyatlarin toplamini bulunuz,  ipucu Double.parseDouble() methodunu kullanabilirsiniz	
		  
				String str1 = "$13.99";
				String str2 = "$10.55";
				str1 = str1.replace("$", "");
				str2 = str2.replace("$", "");
				
				double d1 = Double.parseDouble(str1);
				double d2 = Double.parseDouble(str2);
				
				double sum = d1+ d2;
				System.out.println("Toplami : " + sum);
	}

}
