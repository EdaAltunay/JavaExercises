package exercises;

import java.util.Scanner;

public class C26_OtobusKarti {
    /*
    Kullanıcıdan Kart türü, aktarma ve bakiye bilgisini alarak eğer yeterli bakiye
     bulunuyorsa kalan bakiye bilgisini göstereceğiz.
     Yeterli bakiye bulunmaması halinde gerekli uyarıyı yapacağız.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kartTuru;
        int binisTuru = 0;
        double bakiye = 100;
        double aktarmaTam = 4.5;
        double aktarmaOgr = 2.75;
        double tam = 9.5;
        double ogr = 4.5;


        System.out.println("kart turunu giriniz (1)-tam (2)-ogrenci");
        kartTuru = scan.nextInt();
        if (kartTuru == 1) {
            System.out.println("binis turu (1)-ilk binis (2)-aktarma ");
            binisTuru = scan.nextInt();
            if (binisTuru == 1) {

                if (bakiye >= tam) {
                    bakiye -= tam;

                    System.out.println("kalan bakiyeniz : " + bakiye);


                } else {
                    System.out.println("yetersiz bakine");
                }

            } else if (binisTuru == 2) {

                if (bakiye >= aktarmaTam) {
                    bakiye -= aktarmaTam;

                    System.out.println("kalan bakiyeniz : " + bakiye);


                } else {
                    System.out.println("yetersiz bakine");
                }
            } else {
                System.out.println("yanlis giris yaptınız");
            }
        } else if (kartTuru == 2) {
            System.out.println("binis turu (1)-ilk binis (2)-aktarma ");
            binisTuru = scan.nextInt();

            if (binisTuru == 1) {
                if (bakiye >= ogr) {
                    bakiye -= ogr;
                    System.out.println("kalan bakiyeniz : " + bakiye);
                } else {
                    System.out.println("yetersiz bakiye");
                }


            } else if (binisTuru == 2) {
                if (bakiye >= aktarmaOgr) {
                    bakiye -= aktarmaOgr;
                    System.out.println("kalan bakiyeniz : " + bakiye);
                } else {
                    System.out.println("yetersiz bakiye");
                }

            }else {
                System.out.println("yanlis giriş yaptiniz");
            }

        } else {
            System.out.println("yanlis giris yaptınız");
        }


    }}






















