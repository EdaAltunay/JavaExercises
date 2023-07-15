package exceptions_teamExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_InputMismatchException {
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar sayi girmesini isteyip
        // girilen sayilari toplayin
        // kullanicinin islemi bitirmek icin Q'ya basmasini isteyin
        // Q'ya basildiginda toplam kac sayi girdigini
        // ve bu sayilarin toplaminin kac oldugunu yazdirin.


        Scanner scan = new Scanner(System.in);
        int girilensayi = 0;
        int toplam = 0;
        int sayac = 0;

        while (true) {
            System.out.println("lutfen toplanmak uzere sayılar gırınız. bitirmek icin Q ya basınız.");

            try {
                girilensayi = scan.nextInt();
                toplam += girilensayi;
                sayac++;
            } catch (InputMismatchException e) {
                String str = scan.next();
                if (str.equalsIgnoreCase("Q")) {
                    break;
                }
                System.out.println("sayi dısında giris yapamazsınız!!! ");
            }
        }

        System.out.println("girilen " + sayac + " adet sayının toplamı = " + toplam);


    }
}
