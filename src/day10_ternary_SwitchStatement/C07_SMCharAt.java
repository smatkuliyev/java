package day10_ternary_SwitchStatement;

public class C07_SMCharAt {

	public static void main(String[] args) {
		
		String kurs = "Techproeducation";
		
		System.out.println(kurs.charAt(0));
		
		System.out.println(kurs.charAt(15));
		
		System.out.println(kurs.charAt(16)); // hata verir, 16 harf olduðu için, index en fazla 15 olabilir 
	}

}
