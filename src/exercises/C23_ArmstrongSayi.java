package exercises;

public class C23_ArmstrongSayi {
    /*
       Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
           (0, 1, 153, 370, 371, 407, 1634)
           153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
           370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
           */
    public static void main(String[] args) {


        int sayi = 1634;
        int kontrolsayisi = sayi;
        int birlerBasamagi = 0;
        int toplam = 0;
        int basamakSayisi = 0;


        while (sayi != 0) {
            birlerBasamagi = sayi % 10;
            sayi = sayi / 10;
            basamakSayisi++;
        }

        birlerBasamagi = 0;
        sayi = kontrolsayisi;

        while (sayi != 0) {

            birlerBasamagi = sayi % 10;
            System.out.println("birler basamagi: " + birlerBasamagi);

            int kuvvet = 1;
            for (int i = 1; i <= basamakSayisi; i++) {

                kuvvet*=birlerBasamagi;
            }
            System.out.println("for dıs" + kuvvet);

            toplam += kuvvet;
            System.out.println("toplam " + toplam);

            sayi = sayi / 10;
        }

        sayi = kontrolsayisi;
        if (toplam == kontrolsayisi) {
            System.out.println("Verilen sayi  Armstrong sayidir.");
        } else {
            System.out.println("Verilen sayi  Armstrong sayi degildir.");
        }

    }


}

