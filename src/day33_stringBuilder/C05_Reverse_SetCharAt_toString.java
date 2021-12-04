package day33_stringBuilder;

public class C05_Reverse_SetCharAt_toString {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java ne kadar kolay");
		System.out.println(sb);
		
	//	sb.setCharAt(1, "D");
		
	//	String str  = sb.toString();
		
		sb.reverse();
		
		System.out.println(sb); 			// yalok radak en avaJ
		
		
	}

}
