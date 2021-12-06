package day34_accessDeneme;

import day34_accessModifier_encapsulation.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {
		
		C01 obj = new C01();
		
	//	System.out.println(obj.sayiPrivate);		// sadece ayni class ulasabilir
	//	System.out.println(obj.sayiDefault);		// sadece ayni package ulasabilir
	//	System.out.println(obj.sayiProtected);		// sadece ayni package'teki class ve child class ulasabilir
		System.out.println(obj.sayiPublic);
		
		
	}

}
