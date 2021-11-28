package day27_constructor_constructorCall;

public class Car1 {

	int yil=2000;
    String renk;
    String model;
    int km;
    boolean satilikMi;
    static int fiyat = 10;
    
    public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
		// atama yapacagimiz tum ozellikleri parametre olarak yolladik
	}


	public Car1() {
		// TODO Auto-generated constructor stub
	}


	public Car1(int i ) { 		// bu satirdaki km=(i) ile class leveldeki int km farkli scope'lardadir
		km = i;						// 
	}


	public Car1(int i, int j) {
		//	 yil    km
		
		yil= i;
		km = j;
	}


	public void hiz(int hiz) {
        System.out.println("araba saatte " + hiz + " km yapar");
    }
    
    public void yakit(String yakit) {
        System.out.println("Araba yakit olarak " + yakit + " kullanir");
    }

}
