package exercises;

public class C11 {

    /*
   arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
   Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
    */
    public static void main(String[] args) {


        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        System.out.println(toplam(arr1, arr2));

    }

    public static int toplam(int[][]... arrs) {
        int toplam = 0;
        for (int[][] arr : arrs) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    toplam += arr[i][j];
                }
            }
        }
        return toplam;
    }
}

