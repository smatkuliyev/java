package day40_exceptions;

public class C01_Exception {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 0;
	
		
		try {
			System.out.println("Sayilarin bolumu : " + a/b);
			
		} catch (ArithmeticException e) {
			System.out.println("Sifira bolum yapilamaz");
		//	System.out.println(e.getMessage());             	/ by zero
		//	System.out.println(e.getStackTrace());             [Ljava.lang.StackTraceElement;@4aa8f0b4
			e.printStackTrace(); 							//	java.lang.ArithmeticException: / by zero at day40.C01_Exception.main(C01_Exception.java:12)
		
		System.out.println("gorev tamamlandi");
		
		}
	}
}
