package day01_02_variables;

public class C03_Variables {

	public static void main(String[] args) {
		
		int number1 = 10;
		int number2 = 20;
		
		String number3 = "10";
		String number4 = "20";
		
		System.out.println(number1 + number2); // 30
		System.out.println(number3+ number4); // 1020
		
		String letter1 = "A";
		char letter2 = 'A';
		
		System.out.println(number1+number2+letter1); // 30A
		System.out.println(number1+number2+letter2); // 95
		
		// char ekstra ozelligi ile matematiksel islemlerde numerik deger alır.
		
		System.out.println(letter1+number1+number2); // A1020
		System.out.println(letter1+(number1+number2)); // A30
		System.out.println(number2+letter1+number1); // 20A10
	}

}
