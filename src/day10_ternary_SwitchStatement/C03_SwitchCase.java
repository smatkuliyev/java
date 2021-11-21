package day10_ternary_SwitchStatement;

public class C03_SwitchCase {

	public static void main(String[] args) {
		// gun numarasina gore haftaici veya hafta sonu yazdiralim
		
		int gunNo = 4;
		
		switch (gunNo) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Hafta ici");
			break;
		case 6:
		case 7:
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Lutfen gecerli bir gun numarasi yazin");
			break;
		}

	}

}
