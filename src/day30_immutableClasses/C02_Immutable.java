package day30_immutableClasses;

public class C02_Immutable {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		String str = "Ali";
		
		for (int i = 0; i < 100; i++) {
			str+=" ";
		}
		// bu kod calistiginda java kac obje olusturur?
		// bu kod calistiginda 1+100=101 obje olusturmus olur.
		// str'in son degeri "Ali       (100 tane bosluk)       "

	}

}
