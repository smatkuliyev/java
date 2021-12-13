package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {
		// verilen bir int array icin kullanicidan sayi isteyiniz ve girilen sayiyi index olarak kabul edip o index'teki elementi yazdirin
		
		int arr[] = {2,3,5,6,2,7,9,1}; 
		// ArrayIndexOutOfBoundsException
		// InputMismatchException
		
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Lutfen elementi yazdirmak icin index giriniz : ");
			int index = scan.nextInt();
			
			scan.close();
			System.out.println("Girdiginiz index'teki element : " + arr[index]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Girdiginiz index array'de yok");
		} catch (InputMismatchException e) {
			System.out.println("Girdiginiz index positif tam sayi olmali");
		}
		
		
		
		
		
		
		
	}

}
