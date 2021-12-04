package day33_stringBuilder;

public class C04_IndexOf_Insert_Replace {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java ogrendik");
		System.out.println(sb.indexOf("v"));  	// 2
		
		sb.insert(4, "yi cok iyi");
		System.out.println(sb); 				// Javayi cok iyi ogrendik
		
		
		String str2 = "cok iyiyim";
	//	sb.insert(7, "cok iyiyim", 0, 4);	
		sb.insert(7, str2, 0, 4);
		System.out.println(sb); 				// Javayi cok cok iyi ogrendik
		
		sb.replace(7, 10, "Sulo");
		System.out.println(sb); 				// Javayi Sulo cok iyi ogrendik
		
	}

}
