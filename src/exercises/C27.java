package exercises;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C27 {


    /*
      Kullanicidan int  list uzunlugunu isteyin
      Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
      Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
      n = 5 icin (listin uzunlugu);
      input { 1 , 2 , 2 , 3 , 4}
      output {2}
       */


    public static void main(String[] args) {

        List<Integer> list = new java.util.ArrayList<>();

        tekrarliElemanListiOlustur(list);
    }

    private static void tekrarliElemanListiOlustur(List<Integer> list) {

        List<Integer> tekrarsizList = new java.util.ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen listin uzunluğunu girin");
        int uzunluk = scan.nextInt();

        while (list.size() != uzunluk) {
            System.out.println("lutfen eklemek istediginiz elemanlari girin");
            int girilen = scan.nextInt();
            list.add(girilen);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {

                    tekrarsizList.add(list.get(j));


                }

            }

        }
        System.out.println(tekrarsizList);


    }


}










