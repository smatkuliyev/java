package day42_abstractClasses;

public class AbsUstabasi extends AbsIsci{
	
	// concrete bir child class parent'i olan abstract class'lardaki tum abstract method'lari implement etmelidir.
	// ama parent'i olan abstract class'lardaki concrete method'lari implement etmek zorunda degildir.

	public static void main(String[] args) {
		
		AbsUstabasi ust1 = new AbsUstabasi();
		
		ust1.statu();
		ust1.mass();
		ust1.mesai();
		
	}

	@Override
	public void mesai() {
		System.out.println("Ustabasi ariza durumunda ariza cozulunceye kadar calisir... imza:Ustabasi");
		
	}

	@Override
	public void mass() {
		System.out.println("Ustabaslari aylik 10.000 tl maal alir... imza:Ustabasi");
		
	}

	@Override
	public void statu() {
		System.out.println("Bu classdaki tum personel ustabasidir... imza:Ustabasi");
		
	}

}
