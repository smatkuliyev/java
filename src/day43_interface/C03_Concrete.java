package day43_interface;

public class C03_Concrete implements C02_Interface {

	public static void main(String[] args) {
		
		C03_Concrete concreteObj = new C03_Concrete();
		
		
		// interface'de default keyword kullanarak olusturdugumuz body'si olan method'lara 
		//child concrete class'lardan obje vasitasiyla ulasabilirim
		concreteObj.kaporta();
		
		
		// interface'de static keyword kullanarak olusturdugumuz body'si olan method'lara 
		//child concrete class'lardan interface ismiyle vasitasiyla ulasabilirim
		C02_Interface.sanzuman();
		
		
	}
	
	
	
	/// Bir interface'de static veya defauld keyword kullanarak body'si olan bir method olusturursak 
	// Bu interface'e implements eden concrete child class'lar bu method'lari implement etmek zorunda degildir.
	@Override
	public void motor() {
		// TODO Auto-generated method stub
		
	}

}
