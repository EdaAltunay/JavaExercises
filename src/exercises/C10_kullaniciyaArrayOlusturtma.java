package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class C10_kullaniciyaArrayOlusturtma {
    public static void main(String[] args) {
         /*
             Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
            donduren bir method olusturun.
         */
        System.out.println(arrayElementEkleme());
    }
    public static ArrayList arrayElementEkleme() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen array boyutunu gitiniz ");
        int boyut= scan.nextInt();
        int element=0;
        ArrayList elementler = new ArrayList<>();
        int baslabgic= 0;
        while (baslabgic<boyut){
            System.out.println("lutfen array elementleri giriniz :");
            element = scan.nextInt();
            elementler.add(element);
            baslabgic++;
        }
        return elementler;
    }
    }

