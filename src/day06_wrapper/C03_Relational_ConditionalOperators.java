package day06_wrapper;

public class C03_Relational_ConditionalOperators {

	public static void main(String[] args) {
		
	/*			// Relational operators
		
		boolean sonuc1 = 5 + 2 == 7;  // e�it mi?
		boolean sonuc2 = 5 * 2 == 15; // e�it mi?

		System.out.println(sonuc1);  // true
		System.out.println(sonuc2);  // false

		boolean sonuc3 = 5 + 2 != 7 ;  // e�it de�il mi?
		boolean sonuc4 = 5 * 2 != 15 ; // e�it de�il mi?

		System.out.println(sonuc3);  // false
		System.out.println(sonuc4);  // true

				// Conditional operators

		boolean a= (5+2 == 7) && (4+3 !=5) ;
		System.out.println(a);      				    //true
		System.out.println((5*2 != 15) && (5>7));   	// false   
		
		boolean b= (5+2 == 7) || (4+3 !=5) ;
		System.out.println(b);							//true
		System.out.println((5*2 == 15) || (5>7));		//false                              */
		
	//	System.out.println(5+3==8 || 6+5==10 || 7-2==3); 	//true
	//	System.out.println(5+3==8 && 6+5==10 && 7-2==3); 	//false
		
		
		int c = 30;
		int d = 20;
		int e = 10;
		
		boolean sonuc = e>d || d>c || e+d>=c;
		System.out.println(sonuc); 						//true
		
// && yerine &  de kullan�labilir ancak arada bir n�ans var, & t�m i�lemleri teker teker kontrol eder, && ilk false bulsa gerisini kontrol etmez
		
	//	System.out.println(5+3==8 && 6+5==10 && 7-2==3);	// false
	//	System.out.println(5+3==8 & 6+5==10 & 7-2==3);	   	//  false
		
		int yas = 50;
		int boy = 180;
		char cinsiyet = 'M';
		System.out.println(yas<30 && boy>170 && cinsiyet =='M');		//false

	}

}
