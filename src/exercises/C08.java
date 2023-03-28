package exercises;

import java.util.Arrays;

public class C08 {
    public static void main(String[] args) {

    /*
        Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        eski array’e yeni degeri atayin.
         */
        int[] eskiArr = {1, 3, 5, 7, 9};
        int istenenEleman = 12;
        System.out.println(Arrays.toString(arryeELemanEkle(eskiArr, istenenEleman)));
    }

    private static int[] arryeELemanEkle(int[] eskiArr, int istenenEleman) {
        int[] yeniArr = new int[eskiArr.length + 1];
        for (int i = 0; i < eskiArr.length; i++) {
            yeniArr[i] += eskiArr[i];
        }
        yeniArr[yeniArr.length - 1] = istenenEleman;
        return yeniArr;
    }
}