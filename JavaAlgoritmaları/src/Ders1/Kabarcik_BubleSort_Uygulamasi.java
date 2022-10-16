package Ders1;

import java.util.Random;
import java.util.Scanner;

public class Kabarcik_BubleSort_Uygulamasi {

	private static int elemanSayisi;
	private static int dizi[];
	private static Random r;

	public static void main(String[] args) {

		diziOlustur(); // Dizi oluşturuldu
		diziGoruntule(dizi); // Sırasız dizi görüntüleniyor
		kabarcikSiralama(dizi);
		System.out.println("Son Durum");
		diziGoruntule(dizi);

	}

	// Kabarcık sıralama algoritması
	private static void kabarcikSiralama(int rakamDizi[]) {

		for (int i = 0; i < rakamDizi.length; i++) {

			// System.out.println("\nIterasyon:" + (i + 1));

			for (int j = 0; j < rakamDizi.length - 1; j++) {

				if (rakamDizi[j + 1] < rakamDizi[j]) {

					int b = rakamDizi[j];
					rakamDizi[j] = rakamDizi[j + 1];
					rakamDizi[j + 1] = b;
				}
			}

		}

	}

	// Dizi oluşturma metodu
	private static void diziOlustur() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Dizi Eleman Sayisi: ");
		elemanSayisi = sc.nextInt();

		dizi = new int[elemanSayisi];
		r = new Random();

		for (int i = 0; i < dizi.length; i++) {

			dizi[i] = r.nextInt(100);
		}
	}

	// Dizi görüntüleniyor
	private static void diziGoruntule(int sayiDizisi[]) {

		for (int i = 0; i < sayiDizisi.length; i++) {

			System.out.print(sayiDizisi[i] + " ");
		}
	}

}
