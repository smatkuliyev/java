package day13;

public class C06_1_Soru {

	public static void main(String[] args) {
		// Soru 1 : String methodlarini kullanarak " Java ogrenmek123 Cok guzel@ " String’ini "Java ogrenmek cok guzel." sekline getirin
		
		
				String str = " Java ogrenmek123 Cok guzel@ ";
				System.out.println(str);
				str = str.trim();
				str = str.replaceAll("\\d", "");
				str = str.replace('C', 'c');
				str = str.replace('@', '.');
				System.out.println(str);
	}

}
