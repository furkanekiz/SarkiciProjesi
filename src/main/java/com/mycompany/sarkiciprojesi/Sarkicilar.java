package com.mycompany.sarkiciprojesi;

import java.util.ArrayList;

public class Sarkicilar {

    private ArrayList<String> sarkiciListesi = new ArrayList<String>();

    public void sarkicilariBastir() {
        System.out.println("Sarkici Listesinde " + sarkiciListesi.size() + " kadar sarkici var");

        for (int i = 0; i < sarkiciListesi.size(); i++) {
            System.out.println((i + 1) + ".Sarkici: " + sarkiciListesi.get(i));
        }
    }

    public void sarkiciEkle(String isim) {
        sarkiciListesi.add(isim);
        System.out.println("Sarkici Listesi Guncellendi...");
    }

    public void sarkiciGuncelle(String yeniSarkici, int posizyon) {
        sarkiciListesi.set(posizyon, yeniSarkici);
        System.out.println("Sarkici Listesi Guncellendi...");
    }

    public void sarkiciSil(int pozisyon) {
        String isim = sarkiciListesi.get(pozisyon);
        sarkiciListesi.remove(pozisyon);

        System.out.println(isim + " isimli sarkici listeden cikarildi...");
    }

    public void sarkiciAra(String sarkiciAdi) {
        int pozisyon = sarkiciListesi.indexOf(sarkiciAdi);

        if (pozisyon >= 0) {
            System.out.println(sarkiciAdi + " isimli sarkici " + (pozisyon + 1) + ". pozisyonda");
        } else {
            System.out.println("Sarkici Bulanamadi...");
        }
    }
}
