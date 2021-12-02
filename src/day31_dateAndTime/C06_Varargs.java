package day31_dateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {
		// verilen sayilari toplayan bir method olusturmak istiyorum
		
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		int f = 60;
		
		topla(a,b);
		topla(a,b,c);
	    topla(a,b,c,d);
	    topla(a,b,c,d,e);
	    topla(a,b,c,d,e,f);
		
	    // su ana kadar gordugumuz tekniklerle degisken sayida parametreli tek bir method olusturamayiz
	    // variety arguments

	}

	private static void topla(int... d) {
		int topla = 0;
		for (int i : d) {
			topla+=i;
		}
		System.out.println("Varargs calisir  : " + topla);
		
	}

}
