package day45_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {
		
		List<Integer> ll = new LinkedList<>();
		
		ll.add(5);
		ll.add(7);
		System.out.println(ll); 
		
		ll.add(9); 				// Data sectigimiz icin sadece list interface'indeki method'lari kullanabiliriz
								// LinkedList class'inda override ettigimiz icin interface olmasina ragmen List method'larini 
								// List interface olmasina ragmen List method'larini kullanabildik
		
		Queue<Integer> ll2 = new LinkedList<>();
		
		ll2.clear(); 			// Date turu Queue secilince Queue interface'inden gelen method'lari kullanabildik
		
		
		Deque<Integer> ll3 = new LinkedList<>();
		ll3.add(5);
		ll3.add(7);
		
		
		
		
	}

}
