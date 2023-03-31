package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C24_Ebob {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Soru:Kullanıcıdan alınan iki sayının EBOB'unu bulan bir method hazirlayin. Do while kullanalim


        ebobBul();
    }

    private static void ebobBul() {
        System.out.println("lütfen iki sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int ebob = 0;
        int i=1;// EBOB bulurken tüm sayıların  ilk ortak böleni 1 olduğu için i'ye 1 atadık.
        List<Integer> list=new ArrayList<>();// girilen sayılaraın ortak bölenlerini liiste yapmak için list'den bir obje oluştu
        do{
            if (sayi1 % i == 0 && sayi2 % i == 0) {// iki sayının tüm ortak bölenlerini bulmak için oluşturuldu
                list.add(i);// eğer her ikiside aynı sayıya bölünüyorsa listeye ekle

            }
            i++;

        }while(i<sayi1);
        ebob= list.get(list.size()-1);
        System.out.println("Girilen sayilarin EBOB'u :"+ebob);

    }

}

