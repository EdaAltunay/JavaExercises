package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_array_$ve£ {
    /*
     * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
     * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

     */
    public static void main(String[] args) {

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4";
        String[] arr = new String[11];
        int dolar1 = 0;
        int pound1 = 0;
        List<String> dolar = new ArrayList<>();
        List<String> pound = new ArrayList<>();

        arr = str.split(" ");   //stringden array olusturduk.
        System.out.println(Arrays.toString(arr));

        // COZUM 1
        for (int i = 0; i < 11; i++) {
            if (arr[i].charAt(0) == '$') {
                dolar.add(arr[i]);
            } else {
                pound.add(arr[i]);
            }
        }
        System.out.println("dolar : " + dolar);  // dolar list'imiz.
        System.out.println("pound : " + pound);  // pound list'imiz.

        for (int i = 0; i < dolar.size(); i++) {
            dolar.set(i, dolar.get(i).substring(1));
            dolar1 += Integer.parseInt(dolar.get(i));
        }
        System.out.println(dolar);
        System.out.println("Dolar Toplam : " + dolar1);

        for (int i = 0; i < pound.size(); i++) {
            pound.set(i, pound.get(i).substring(1));
            pound1 += Integer.parseInt(pound.get(i));
        }
        System.out.println(pound);
        System.out.println("Pound Toplam : " + pound1);


        // COZUM 2

       /* for (int i = 0; i < arr.length ; i++) {
            if  (arr[i].contains("$")) {
                dolar1 += Integer.parseInt(arr[i].replace("$", ""));
            } else {
                pound1 += Integer.parseInt(arr[i].replace("£", ""));
            }
        }
         System.out.println("Dolar toplam : "+dolar1);
         System.out.println("Pound toplam : "+pound1);
        */
    }
}