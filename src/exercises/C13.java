package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class C13 {
    // Kullanıcıdan 20 tamsayı girişi alın ve şunu yazdırın:
    //pozitif sayıların sayısı
    //negatif sayıların
    //sayısı tek sayıların sayısı
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        int negatifSayiAdet = 0;
        int pozitifSayiAdet = 0;
        int tekSayiAdet = 0;
        System.out.print("lutfen 20 adet sayi giriniz : ");
        for (int i = 0; i < arr.length; i++) {
            int sayi = scan.nextInt();
            arr[i] = sayi;
        }
        System.out.println(Arrays.toString(arr));
        for (int each : arr
        ) {
            if (each > 0) {
                pozitifSayiAdet++;
            } else if (each < 0) {
                negatifSayiAdet++;
            }
            if (!(each % 2 == 0)) {
                tekSayiAdet++;
            }
        }
        System.out.println("Pozitif tam sayi adedi : " + pozitifSayiAdet);
        System.out.println("Negatif tam sayi adedi : " + negatifSayiAdet);
        System.out.println("Tek tam sayi adedi : " + tekSayiAdet);
    }
}