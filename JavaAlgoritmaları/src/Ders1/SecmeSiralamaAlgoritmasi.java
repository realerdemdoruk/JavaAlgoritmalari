package Ders1;

import java.util.Scanner;
import java.util.Random;

public class SecmeSiralamaAlgoritmasi {

	private static int elemanSayisi;
	private static int dizi[];
	private static Random r;

	public static void main(String[] args) {

		diziOlustur();
		// diziGoruntule(dizi); // Dizimiz sırasız halde.
		secmeSiralamaAlgoritma(dizi); // Dizi elemanları sıralancak.
		diziGoruntule(dizi); // Sıralanmış dizi görüntüleniyor.
	}

	private static void secmeSiralamaAlgoritma(int rakamDizi[]) {

		for (int i = 0; i < rakamDizi.length; i++) {

			for (int j = i + 1; j < rakamDizi.length; j++) {

				if (rakamDizi[j] < rakamDizi[i]) {

					int b = rakamDizi[i];
					rakamDizi[i] = rakamDizi[j];
					rakamDizi[j] = b;
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