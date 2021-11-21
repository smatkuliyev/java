package day06_wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
		int sayi1 = 10;
		Integer sayi2 = 20;
		System.out.println(sayi1+sayi2);
		// sayi1. yazdýðýmýzda hiç bir method çýkmaz, çünkü primitive'dir
		// sayi2. yazdýðýmýzda method çýkar çünki non-primitive'dir.
		
		String tel1 = "5541914";
		String tel2 = "5548584";
		
		System.out.println(tel1 + tel2);  // 55419145548584
		
		// bu sayýlarý toplamak isterseriz
		
		System.out.println(Integer.valueOf(tel1) + Integer.valueOf(tel2)); // 11090498
		
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		String CaddeNo = "0203";
		String sokakNo = "1564";
		
		System.out.println(Integer.valueOf(CaddeNo) + Integer.valueOf(sokakNo)); // 1767
		
	}

}
