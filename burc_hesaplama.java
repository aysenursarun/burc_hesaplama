package burc_hesaplama;

import java.util.Scanner;

public class burc_hesaplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int gün, ay;

		System.out.print("Doğduğunuz ayın kaçıncı günü doğduğunuzu girin: ");
		gün = scan.nextInt();

		System.out.print("Kaçınca ayda doğduğunuzu girin: ");
		ay = scan.nextInt();

		if (ay == 12) {
			if (gün <= 21) {
				System.out.println("Yay burcusunuz.");
			} else {
				System.out.println("Oğlak burcusunuz.");
			}
		}

		if (ay == 1) {
			if (gün <= 21) {
				System.out.println("Oğlak burcusunuz.");
			} else {
				System.out.println("Kova burcusunuz.");
			}
		}

		if (ay == 2) {
			if (gün <= 20) {
				System.out.println("Kova burcusunuz.");
			} else {
				System.out.println("Balık burcusunuz.");
			}
		}

		if (ay == 3) {
			if (gün <= 20) {
				System.out.println("Balık burcusunuz.");
			} else {
				System.out.println("Koç burcusunuz.");
			}
		}

		if (ay == 4) {
			if (gün <= 21) {
				System.out.println("Koç burcusunuz.");
			} else {
				System.out.println("Boğa burcusunuz.");
			}
		}

		if (ay == 5) {
			if (gün <= 21) {
				System.out.println("Boğa burcusunuz.");
			} else {
				System.out.println("İkizler burcusunuz.");
			}
		}

		if (ay == 6) {
			if (gün <= 22) {
				System.out.println("İkizler burcusunuz.");
			} else {
				System.out.println("Yengeç burcusunuz.");
			}
		}

		if (ay == 7) {
			if (gün <= 23) {
				System.out.println("Yengeç burcusunuz.");
			} else {
				System.out.println("Aslan burcusunuz.");
			}
		}

		if (ay == 8) {
			if (gün <= 23) {
				System.out.println("Aslan burcusunuz.");
			} else {
				System.out.println("Başak burcusunuz.");
			}
		}

		if (ay == 9) {
			if (gün <= 22) {
				System.out.println("Başak burcusunuz.");
			} else {
				System.out.println("Terazi burcusunuz.");
			}
		}

		if (ay == 10) {
			if (gün <= 22) {
				System.out.println("Terazi burcusunuz.");
			} else {
				System.out.println("Akrep burcusunuz.");
			}
		}

		if (ay == 11) {
			if (gün <= 21) {
				System.out.println("Akrep burcusunuz.");
			} else {
				System.out.println("Yay burcusunuz.");
			}
		}

	}

}
