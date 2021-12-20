package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {
		// FIFO VS LIFO
		
		Deque<String> ciftBasli = new LinkedList<>();
		
		ciftBasli.add("Yildiz");
		ciftBasli.add("Ali");
		System.out.println(ciftBasli); 				// [Yildiz, Ali]
		ciftBasli.addLast("Emine");
		System.out.println(ciftBasli); 				// [Yildiz, Ali, Emine]
		
		System.out.println(ciftBasli.pop()); 		// Yildiz
		System.out.println(ciftBasli); 				// [Ali, Emine]
		
		ciftBasli.push("Seyfulla");
		System.out.println(ciftBasli); 				// [Seyfulla, Ali, Emine]
		
		ciftBasli.add(null);
		System.out.println(ciftBasli); 				// [Seyfulla, Ali, Emine]
		
	}

}
