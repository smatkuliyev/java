package day03_scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 is : " + num1 + " and num2 is : " + num2);
	//	System.out.println("num1 is : " + num2 + " and num2 is : " + num1);
		
		int bos;
		bos = num2;
		num2 = num1;
		num1 = bos;
		
		System.out.println("num1 is : " + num1 + " and num2 is : " + num2);
	}

}
