package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException {
		// Java'da bir dosyaya ulasmak FileInputStream class'indan yardim aliriz
		
		FileInputStream fis = new FileInputStream("src\\day40\\yazi.txt");
		
		// Java bu kodda olasi bir problem on goruyor
		// ve bu problema karsi ne yapmasi gerektigini soruyor
		// (yani alti cizilen her kod CTE degildir)
		
		// Bunun icin iki durum sozkonusu
		// 1- try catch kullanarak bu problemi HANDLE edip java'nin yoluna devam etmesini saglayabiliriz
		// 2- Eger dosya okunamiyorsa kod calismasin istiyorsaniz olayin farkinda oldugumuzu ve sorumlulugun bizde oldugunu Java'ya soylemeliyiz
		
		System.out.println("Gorev tamamlandi");
	}

}
