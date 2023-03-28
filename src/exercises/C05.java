package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {


    /* TASK :
 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
 java code create ediniz.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen array uzunluğunu giriniz");
        int uzunluk = scan.nextInt();
        int[] arr = new int[uzunluk];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Lutfen arrayin " + i + ". indeksini giriniz");
            int eleman = scan.nextInt();
            arr[i] = eleman;
        }
        System.out.println("Girilen Array : " + Arrays.toString(arr));
    /* int enBuyuk=arr[0];
     int enKucuk=arr[0];
     for (int i = 0; i < arr.length; i++) {
         if (arr[i]>enBuyuk){
             enBuyuk=arr[i];
         }
         if (arr[i]<enKucuk) {
             enKucuk=arr[i];
         }
     }
     System.out.println("En kucuk eleman : " + enKucuk);
     System.out.println("En buyuk eleman : " + enBuyuk);
     */
        int enBuyuk = arr[0];
        int enKucuk = arr[0];
        Arrays.sort(arr);
        System.out.println("Sıralı Array : " + Arrays.toString(arr));
        enKucuk = arr[0];
        enBuyuk = arr[arr.length - 1];
        int fark = enBuyuk - enKucuk;
        System.out.println("Fark : " + fark);

    }
}
