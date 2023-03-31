package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class C22_arrayOlusturVsMethodlarProjesi {
    /*
    Array
A. OLUŞTUR
B. GÖRÜNTÜLE
C. ARA
D. SIRALA
E.ÇIKIŞ

TÜM SEÇENEKLER MENU İLE YAPILACAK
METHODLAR STATİC OLACAK
ARRAYİN BİR PARAMETRESİ OLACAK

     */
    public static void main(String[] args) {
        menu();
    }
    static int sayac;
    static int arananEleman;
    static int arrayUzunlugu = 0;
    static int[] arr = new int[arrayUzunlugu];
    static Scanner scan = new Scanner(System.in);
    private static void menu() {
        System.out.println("Lutfen yapmak istediginiz islemi seciniz:\n" +
                "1.ARRAY OLUŞTUR\n" +
                "2.GÖRÜNTÜLE\n" +
                "3.ARA\n" +
                "4.SIRALA\n" +
                "5.ÇIKIŞ\n ");
        int islem = scan.nextInt();
        switch (islem) {
            case 1:
                arrayOlustur();
                break;
            case 2:
                arrayGoruntule();
                break;
            case 3:
                araydeElemanAra(arr, arananEleman);
                break;
            case 4:
                arraySirala(arr);
                break;
            case 5:
                System.exit(0);
        }
    }
    private static void arraySirala(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        menu();
    }
    private static void araydeElemanAra(int[] arr, int arananEleman) {
        System.out.println("Lutfen array de aranan elemani giriniz : ");
        arananEleman = scan.nextInt();
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == arananEleman)
            { sayac++;
            }
        }
        System.out.println("Aranan eleman  " +sayac +" adet bulunmaktadır");
        menu();
    }
    private static void arrayGoruntule() {
        System.out.println(Arrays.toString(arr));
        menu();
    }
    private static void arrayOlustur() {
        System.out.println("lutfen olusturacaginiz array in uzunlugunu giriniz: ");
        arrayUzunlugu = scan.nextInt();
        arr = new int[arrayUzunlugu];
        System.out.print("lutfen array'in elemanlarini sirasi ile giriniz: ");
        for (int i = 0; i < arrayUzunlugu; i++) {
            int arrayEleman = scan.nextInt();
            arr[i] = arrayEleman;
        }
        System.out.println("Array'iniz olusturuldu.Array'inizi görüntülemek iicn lutfen 2 yi seciniz: ");
        menu();
    }
}


