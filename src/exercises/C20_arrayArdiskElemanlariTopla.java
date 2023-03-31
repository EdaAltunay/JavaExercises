package exercises;

import java.util.ArrayList;
import java.util.List;

public class C20_arrayArdiskElemanlariTopla {
    /*
     2.  Sorumuz
      [3, 5, 1, 2, 7, 9, 2, 3, 5, 7] verilen arrayin ardışık toplamını hesaplayan metodu yazınız
      input--->[3, 5, 1, 2, 7, 9, 2, 3, 5, 7]
      output ---->[3,  5+1,  2+7+9,  2+3+5+7]
      [3,     6,         18,            17]
     */

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};


        arrayArdisikElemanlariToplamiArrayi(arr);

    }

    private static void arrayArdisikElemanlariToplamiArrayi(int[] arr) {
        int k = 0;
        int toplam=0;

        List<Integer> arrisikSayilarToplami = new ArrayList<>();

      while (arr.length-k>=0 ){
          for (int i = 0; i <= k; i++, k++) {

              for (int j = k+1 ; j <= i +k; j++) {

                  toplam += arr[i + j - 1];
              }
          }
      }System.out.println(arrisikSayilarToplami);



    }


}


