package exceptions_teamExercises;

import java.util.Random;

public class C09_MultipleException {
    public static void main(String[] args) {
        /*
        multiple exceptions da parent child iliskisi yoksa catch de yazacagımız exc. ların sırası onemli degildir.
         */


        String str = "Java";
        int[] arr = {3, 4, 6};
        String str2 = null;
        String str3 = "12a";
        // 0 dan 10 a kadar rastgele bir sayi uretip
        // str ve arr deki o index i yazdırıp
        // str ile str2 yi birlestirin.
        // ve str3 ile 15 sayisini toplayın.
        Random rnd = new Random();
        int rastgeleSayi = rnd.nextInt(5);
        System.out.println(rastgeleSayi);
        try {
            System.out.println(arr[rastgeleSayi]);  // ArrayIndexOutofBoundsExcepions.
            System.out.println(str.substring(rastgeleSayi, rastgeleSayi + 1));  //  StringIndexOutofBoundsExcepions.
            System.out.println(str.concat(str2));           // NullPointerExceptions
            System.out.println(Integer.parseInt(str3) + 15);   // NumberFormatExceptions
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index string sınırları dısında");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index string sınırları dısında");
        }catch (NullPointerException e) {
            System.out.println("Null string index degeri olmaz.");
        }catch (NumberFormatException e) {
            System.out.println("Bu degerler toplanamaz.");
        }}}
