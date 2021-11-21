package day09_ternary_Operator;

public class C04_Ternary {

	public static void main(String[] args) {

		int y = 1;
		int z = 1;
		int a = y < 10 ? y++ : z++;
		System.out.println(y + "," + z + "," + a);
		
		int y1 = 112;
		System.out.println(y1>5 ? "inek" : "koyun"); 
		
		System.out.println(y1<91 ? 9 : 11);
	}

}
