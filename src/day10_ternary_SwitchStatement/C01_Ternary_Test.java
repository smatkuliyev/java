package day10_ternary_SwitchStatement;

public class C01_Ternary_Test {

	public static void main(String[] args) {
		
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli
		// olabilir, calisan erkekse 65 yasindan buyukse emekli olabilir
		
		// test datalarina göre de çalýþýr, degerleri degistirip calistirabilir
		
		char cinsiyet = 'E';
		int yas = 71;
		
		String sonuc =  cinsiyet == 'K' ? (yas>60 ? "Emekli olabilirsin" : "Emekli olamazsin") : (yas>65 ? "Emekli olabilirsin" : "Emekli olamazsin") ;
		System.out.println(sonuc);
	}

}
