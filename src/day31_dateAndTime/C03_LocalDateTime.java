package day31_dateAndTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat = LocalDateTime.now();
		
		System.out.println(tarihSaat); 					// 2021-12-02T23:39:54.163883500
		
		tarihSaat.toString().startsWith("2021");
		
		System.out.println(tarihSaat.toString().startsWith("2021")); // true
	}

}
