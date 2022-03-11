package com.mycompany.sarkiciprojesi;

import java.util.Scanner;

public class Test {

    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    public static void islemleriBastir() {
        System.out.println("\t 0-Islemleri Goruntule\n"
                + "\t 1-Sarkicilari Goruntule\n"
                + "\t 2-Sarkici Ekle\n"
                + "\t 3-Sarkici Guncelle\n"
                + "\t 4-Sarkici Sil\n"
                + "\t 5-Sarkici Ara\n"
                + "\t 6-Uygulamadan Cik");
    }

    public static void goruntule() {
        sarkicilar.sarkicilariBastir();
    }

    public static void sarkiciEkle() {
        System.out.println("Eklemek istediginiz sarkicinin ismi: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciEkle(isim);
    }

    public static void sarkiciGuncelle() {
        System.out.println("Guncellemek istediginiz poziston(1,2,3):");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Yeni sarkici girin: ");
        String yeniSarkici = scanner.nextLine();

        sarkicilar.sarkiciGuncelle(yeniSarkici, pozisyon - 1);
    }

    public static void sil() {
        System.out.println("Silmek istediginiz pozisyon(1,2,3,...):");
        int posizyon = scanner.nextInt();

        sarkicilar.sarkiciSil(posizyon - 1);
    }

    /*public static void ara() {
        System.out.println("Aramak istediginiz sarkici:");
        String isim = scanner.nextLine();

        sarkicilar.sarkiciAra(isim);
    }*/
    public static void main(String[] args) {
        System.out.println("\t Sarkici Uygulamasina Hosgeldiniz...");

        islemleriBastir();

        boolean cikis = false;
        int islem;

        while (!cikis) {
            System.out.println("Bir islem seciniz:");
            islem = scanner.nextInt();
            scanner.nextLine();

            switch (islem) {
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    goruntule();
                    break;
                case 2:
                    sarkiciEkle();
                    break;
                case 3:
                    sarkiciGuncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    //ara();
                    System.out.println("Aramak istediginiz sarkici:");
                    String isim = scanner.nextLine();

                    sarkicilar.sarkiciAra(isim);
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan Cikiliyor...");
                    break;
                default:
                    System.out.println("Gecerli islem giriniz...");
                    break;
            }
        }

    }
}
