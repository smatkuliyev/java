package day13;

public class C05_ReplaceAll_replaceFirst {

	public static void main(String[] args) {
		
		String cumle = "Java   cok             zevkli.";
		
		cumle= cumle.replaceAll("\\s+", " ");					// Java cok zevkli.
		System.out.println(cumle);
							
		System.out.println(cumle.replaceAll("[A-Z]", ""));		// ava cok zevkli.
		
		System.out.println(cumle.replaceAll("[a-z]", ""));		// J  .

		System.out.println(cumle.replaceAll("\\S", "*"));		// **** *** *******
		
		System.out.println(cumle.replaceAll("\\W", ""));		// Javacokzevkli
		
		System.out.println(cumle.replaceAll("\\w", ""));		//   .
		
		String tr = "Java'da rakamlar 1234567890";
		
		System.out.println(tr.replaceFirst("a", "*"));	 		// J*va'da rakamlar 1234567890

	}

}
