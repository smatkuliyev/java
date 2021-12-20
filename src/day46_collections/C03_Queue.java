package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		// Gelen sona gelir, bastan siler
		// FIFO
		
		Queue<String> kuyruk = new LinkedList<>();
		
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Ridvan");
		
		System.out.println(kuyruk); 		// [Lutfullah, Mustafa, Ridvan]
		
		kuyruk.remove();
		System.out.println(kuyruk); 		// [Mustafa, Ridvan]
		
		kuyruk.remove();
		kuyruk.add(null);
		kuyruk.add(null);
		kuyruk.add(null);
		System.out.println(kuyruk); 		// [Ridvan, null, null, null]
		
		
	}

}
