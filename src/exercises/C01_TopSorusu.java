package exercises;

import java.util.Scanner;

public class C01_TopSorusu {
    public static void main(String[] args) {
        /*
        Bir top belirli bir yükseklikten atilmaktadir.
        atildiktan sonra, atıldıgı yüksekligin 3/4 u kadar yerden yukari ziplamaktadir.
        Top ziplama yüksekligi 1 metrenin altina dustugunde durmaktadir.
        Bu ana kadar aldigi toplam yolu ve vurma sayisini bulan do while kod blogu creat ediniz.
         */


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen topun birakildigi yuksekligi metre cinsinden giriniz: ");
        double yukseklik = scan.nextDouble();
        double topunAldigiToplamYol =0;
        int ziplamaSayisi = 0;


        do {
            topunAldigiToplamYol+=yukseklik;
            yukseklik=yukseklik*0.75;
            if (yukseklik>=1){
                topunAldigiToplamYol+=yukseklik;
                ziplamaSayisi++;
            }

        } while (yukseklik >= 1);

        System.out.println("Topun aldigi toplam yol: "+topunAldigiToplamYol+
                "\nTopun ziplama sayisi: "+ziplamaSayisi);



    }
}
