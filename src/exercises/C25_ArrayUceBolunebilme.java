package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class C25_ArrayUceBolunebilme {
    public static void main(String[] args) {


    /*
        Kullanicidan aldigimiz 8 elemanli arrayin icinde
        kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 8 adet sayi giriniz");
        int[] arr = new int[8];// 8 elemanlı boş array oluşturuldu
        int girilenSayi = 0;
        for (int i = 0; i < arr.length; i++) { // kullanıcıdan girilen herbir int sayi array içine atandı
            girilenSayi = scan.nextInt();
            arr[i] = girilenSayi;
        }
        int sayac = 0;
        System.out.println(Arrays.toString(arr));
        for (int each : arr //array'in herbir elemanını getirdi
        ) {
            if (each % 3 == 0 && (each != 0)) {//3'e bölünebilindiğini ve 0'a eşit olmadıgını kontrol ettik
                sayac++;// 3' e bölünebiliyorsa sayac artar
            }
        }
        System.out.println("3'e bölünen eleman sayisi :" + sayac);


    }









}
