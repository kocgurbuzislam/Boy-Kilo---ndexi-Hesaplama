import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("Boyunuzu Giriniz");
			float boy = scanner.nextFloat();

			System.out.println("Kilonuzu Giriniz.");
			float kilo = scanner.nextFloat();

			double vki = kilo / Math.pow(boy / 100, 2);

			if (vki <= 18.5) {
				System.out.println("Düþük Kilolu");

			} else if (vki <= 24.99) {
				System.out.println("Kilonuz Normal");
			} else if (vki <= 29.99) {
				System.out.println("Fazla kilolu");

			} else if (vki <= 39.99) {
				System.out.println("Obez!");
			} else {
				System.out.println("Aþýrý obez");
			}
			System.out.println("----------------------------");
		}
	}

}
