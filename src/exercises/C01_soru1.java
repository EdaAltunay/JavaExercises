package exercises;

public class C01_soru1 {
    /*
       1.Sorumuz
       Mountanin Array: Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol ediniz.
       Mountain Array --> [0,2,5,3,1]
       Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerden sonra sürekli azalan değer alıyorsa "Mountain Array" dir.
       Mountain array değildir --->[5,2,7,1,4]
     */


    public static void main(String[] args) {
        int[] arr = {0, 2, 5,7, 3, 1};

        mountainArray(arr);
    }

    static int enBuyukElemanIndex = 0;

    private static void mountainArray(int[] arr) {

        int enBuyukEleman = arr[0];


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > enBuyukEleman) {
                enBuyukEleman = arr[i];
                enBuyukElemanIndex = i;

            }

        }
        int sayac1 = 0;
        int sayac2 = 0;
        int sayac3 = 0;

        for (int i = 1; i <=enBuyukElemanIndex; i++) {

            if (arr[i - 1] < arr[i]) {
                sayac1++;
            }
        }




        for (int i = arr.length-1 ; i >enBuyukElemanIndex ; i--) {

            if (arr[i] < arr[i-1]) {

                sayac2++;
            }

        }


        sayac3 = sayac1 + sayac2;

        if (sayac3 == arr.length - 1) {
            System.out.println("Verilen array mountain array'dir.");
        } else {
            System.out.println("Verilen array mountain array degildir.");
        }


    }


}
