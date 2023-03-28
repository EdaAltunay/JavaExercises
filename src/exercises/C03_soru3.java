package exercises;

import java.util.ArrayList;
import java.util.List;

public class C03_soru3 {
    /*
    3.   Sorumuz
       Girilen desimal değeri binary değere çeviren metodu oluşturunuz
       Örnek --->  12 = 1  1  0  0

     */
    public static void main(String[] args) {
        binaryCevirma(12);

    }

    private static void binaryCevirma(int sayi) {

        List<Integer> tersBinary = new ArrayList<>();
        while (sayi >= 1) {
            tersBinary.add(sayi % 2);
            sayi /= 2;
        }

        List<Integer> binary=new ArrayList<>();
        for (int i = tersBinary.size()-1; i >=0 ; i--) {
            binary.add(tersBinary.get(i));


        }

        System.out.println(binary);
    }


}

