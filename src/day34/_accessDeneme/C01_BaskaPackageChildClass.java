package day34._accessDeneme;

import day34_accessModifier_encapsulation.C01;

public class C01_BaskaPackageChildClass extends C01 {

	public static void main(String[] args) {
		
		C01 obj = new C01();
		
	//	System.out.println(obj.sayiPrivate);
	//	System.out.println(obj.sayiDefault);
	//	System.out.println(obj.sayiProtected);		//main method static, digeri static degil,
		System.out.println(obj.sayiPublic);
		
		obj.staticOlmayanMethod();
		
	}
	
	public void staticOlmayanMethod() {
		C01 obj = new C01();
		
	//	System.out.println(obj.sayiPrivate);
	//	System.out.println(obj.sayiDefault);
		System.out.println(sayiProtected);			// Parent class'da var oldugu icin java problem yapmaz
		System.out.println(obj.sayiPublic);
		
	}
}
