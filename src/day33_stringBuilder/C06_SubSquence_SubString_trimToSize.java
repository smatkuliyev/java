package day33_stringBuilder;

public class C06_SubSquence_SubString_trimToSize {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java ne kadar kolay");
		
		System.out.println(sb.substring(14)); 			// kolay
		
		System.out.println(sb.subSequence(14, 19));		// kolay
		
		// ikisi de ayni sonucu dondurur, ancak substring() String class'dan geldigi icin substring() kullandigimda arkasindan string method'lari kullanabilirim
		// ancak , Subsquence kullandigimdan bu mumkun olmaz
		
		// trimToSize()     length ile capacity yi esitler
		
	}

}
