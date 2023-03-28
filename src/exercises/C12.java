package exercises;

import java.util.Arrays;

public class C12 {
/*
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
        */

    public static void main(String[] args) {
        int [][]arr={{10,20,30},{4},{6,7,20}};
        arrayIcElemanlarToplamiArrayi(arr);
    }

    private static void arrayIcElemanlarToplamiArrayi(int[][] arr) {
    int [] yeniArr=new int [arr.length];
    int toplam=0;


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                toplam+=arr[i][j];
                yeniArr[i]=toplam;
            }
            toplam=0;
        }

        System.out.println(Arrays.toString(yeniArr));


    }


}
