package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C28 { /*
 * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
 * not kisa metodlar kullamayiniz
 * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
 */
    public static void main(String[] args) {

     ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(99);
        sayilar.add(88);
        sayilar.add(12);
        sayilar.add(53);
        sayilar.add(23);
        sayilar.add(32);
        sayilar.add(42);
        System.out.println(sayilar);
    enBuyukElemanBulma(sayilar);
}
    public static void enBuyukElemanBulma(ArrayList<Integer> sayilar) {
        Collections.sort(sayilar); // en buyuk degerler istenildigii icin list siralama yapildi
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gormek istediginiz en buyuk sayi adadini giriniz");
        int n = scan.nextInt(); // kullanicadan n degeri alindi
        ArrayList<Integer> bosList = new ArrayList<>(); // bulunan degerleri atamak icin yeni bir list olusturuldu
        while (n != 0) { // while loop da sartimzii belirlerken iki taraftan birinin sabit olamsi gerekmekte
            // n degerini loop icinde surekli azalttigimiz icin n sifira gelene kdar loop calisir 0 oldugunda durur
            bosList.add(sayilar.get(sayilar.size() - n)); // kullanicadan aligimiz n degrini lsitenin son elementinden bslayarak cikarma islemiyle
            // list in o index deki elemanini bos listeye ekledik
            n--; // n her seferinde azalmasi gerektigi icin bir azalttik
        }
        System.out.println(bosList);
    }













    }
