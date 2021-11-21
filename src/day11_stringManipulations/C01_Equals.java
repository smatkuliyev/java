package day11_stringManipulations;

public class C01_Equals {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10 + 0;
		
		System.out.println(a==b);  //true
		
		char ch1 = 'K';
		char ch2 = 'K'+ 0;
		
		System.out.println(ch1 == ch2); //true
		
		String str1 = "Ali";
		String str2 = "Can";
		String str3 = "Ali Can";				// Ali Can
		String str4 = str1 + " " + str2; 		// Ali Can
		
		System.out.println(str3 == str4);		// false	degerlere ve referanslarina bakar,  genelde false 	
		System.out.println(str3.equals(str4));	// true		sadece degerlere bakar (Case sensetive)
		

	}

}
