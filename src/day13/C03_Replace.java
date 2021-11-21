package day13;

public class C03_Replace {

	public static void main(String[] args) {
		
		String str = "Java ogrenmek cok zevkli";
		
		System.out.println(str.replaceAll(" ", ""));					// Javaogrenmekcokzevkli
		
		System.out.println(str.replaceAll("ogrenmek", "kod yazmak")); 	//Java kod yazmak cok zevkli
		
		System.out.println(str.replaceAll("e", "u")); 					//Java ogrunmuk cok zuvkli

	}

}
