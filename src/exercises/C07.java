package exercises;

import java.util.Arrays;

public class C07 {
    public static void main(String[] args) {
        /*
        Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
       Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
 */
        int[]arr={4,5,6,7};

        System.out.println(Arrays.toString(arrayElemeanlarınıSagaKaydırma(arr)));
    }
    public static int[] arrayElemeanlarınıSagaKaydırma(int[] arr){
        int[]yeniArray=new int[arr.length];

        int sondakiEleman=arr[arr.length-1];
        for (int i = 0; i <yeniArray.length-1 ; i++) {  //
            yeniArray[arr.length-1-i]=arr[arr.length-2-i];
        }
        yeniArray[0]=sondakiEleman;
        return yeniArray;
    }}




