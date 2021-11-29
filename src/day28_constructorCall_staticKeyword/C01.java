package day28_constructorCall_staticKeyword;

public class C01 {
	
	//	Kural 1 : this(parametre); cagrildigi constructor�in ilk satirinda yazilmalidir
	
	//	Kural 2 : Kural 1�den dolayi bir constructor icinde sadece 1 constructor cagrilabilir
	
	int x = 3; 
	int y = 5;
	
	C01() {
	x += 1;
	System.out.println("-x" + x); 
	}
	
	C01(int i) {
	this(); 
	this.y = i; 
//	y = i;
	x += y;
	System.out.println("-x" + x); 
	}
	
	C01(int i, int i2) {
	this(3); 
	this.x -= 4;
//	x -= 4;
	System.out.println("-x" + x); 
	}

	public static void main(String[] args) {
		
		C01 c01 = new C01(4,3);
		// constructor calismaya basladiktan sonra x ve y ile ilgili degismeler
		// (x ve y instance variabale oldugundan) sadece c01 objesini ilgilendirir
		// constructor'in isi bittiginde instance degerler ilk halini alir.
		
		System.out.println(c01.x + " " + c01.y);
		System.out.println();
		
		C01 c02 = new C01();
		System.out.println(c02.x + " " + c02.y);
		System.out.println();
		
		C01 c03 = new C01(7);
		System.out.println(c03.x + " " + c03.y);
	}

}
