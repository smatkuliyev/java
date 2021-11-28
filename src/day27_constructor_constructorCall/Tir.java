package day27_constructor_constructorCall;

public class Tir {

		int yil=2000;
	    String renk;
	    String model;
	    int km;
	    boolean satilikMi;
	
		
		public Tir(int i, String string, String string2, int j, boolean b) {
		// degerleri eslestirmek icin atamalari yapmam lazim
		// (int km, String model, String renk, int yil, boolean satilikMi);
			yil = j;
			renk = string;
			model = string2;
			km = i;
			satilikMi = b;					
	}

		public Tir(int km, String model, String renk) {
			// i, string, string2 isim olarak guzel degil, kod'umuzu sonradan incelerken anlasilir degil
			// daha anlasilir olmasi icin variable isimleri anlamli yapalim
			// (int km, String model, String renk
			
			this.km = km;
			this.model = model;
			this.renk=renk;
		}  

}
