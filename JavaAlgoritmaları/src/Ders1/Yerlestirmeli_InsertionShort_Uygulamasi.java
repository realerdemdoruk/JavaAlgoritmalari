package Ders1;

import java.util.Random;
import java.util.Scanner;

public class Yerlestirmeli_InsertionShort_Uygulamasi {

	private static int elemanSayisi;
	private static int dizi[];
	private static Random r;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		diziOlustur(); // Dizi oluşturuldu
		diziGoruntule(dizi); // Sırasız dizi görüntüleniyor
		yerlestirmeliSiralama(dizi);
		System.out.println("\n");
		diziGoruntule(dizi);
	}

	private static void yerlestirmeliSiralama(int rakam[]) {

		for (int i = 1; i < rakam.length; i++) {

			int tasinan = rakam[i];
			int j = i;

			while (j > 0 && tasinan < rakam[j - 1]) {

				rakam[j] = rakam[j - 1];
				j--;
			}

			rakam[j] = tasinan;
			diziGoruntule(rakam);
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
