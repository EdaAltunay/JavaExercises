package exercises;

import java.util.ArrayList;

public class C02_soru2_net {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        System.out.println(ardisikTopla(arr));
    }

    private static ArrayList<Integer> ardisikTopla(int[] arr) {

        ArrayList<Integer> toplananSayilarList = new ArrayList<>(); // bos konteynir olusturduk

        int count = 0; // for kac kere calisma sarti o kadar arr elemani getirir

        int toplananSayiAdedi = 1; // arr den baslangictan 1 eleman getirip toplama getir

        // while aciyoruz cunku burda bir durum var.

        while (arr.length - toplananSayiAdedi >= count) { // sayilar bitene kadar action
            int toplam = 0;
            for (int i = 0; i <= count; i++) {
                // count demesi her defasinda toplanan sayi artacak
                // dongu sayisi kadar eleman getir
                toplam += arr[toplananSayiAdedi - 1 + i];  //
            }
            count++;
            toplananSayiAdedi += count; // her while dongude toplanacak arr eleman sayisi artiriliyor
            toplananSayilarList.add(toplam); // her while donguden else edilen toplam liste eleman olarak ekleniyor
        }
        return toplananSayilarList;
    }
}