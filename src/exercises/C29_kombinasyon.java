package exercises;

public class C29_kombinasyon {
    /* TASK :
       Verilen iki sayının kombinasyonunu bulan kodu yazınız.
       Hatırlatma C(n,r) = n! / (r!(n-r)!)

       Ekran Çıktısı
       Birinci sayıyı giriniz: 15
       Ikinci sayıyı giriniz: 4
       Kombinasyon: 1365

       Birinci sayıyı giriniz: 5
       Ikinci sayıyı giriniz: 3
       Kombinasyon: 10

     */
    public static void main(String[] args) {

        double sayi1 = 15;
        double sayi2 = 4;

        kombinasyonBul(sayi1, sayi2);

    }

    private static void kombinasyonBul(double n, double r) {
         /*
      soruda kombinasyonu bulabılmemız icin 3 farklı faktorıyel varıable na ıhtıyacımız oldugu ıcın 3 farklı faktoryel variable olusturduk.
      ve kombinasyon sonucunu atayabılecegımız kombinasyon variable ını olusturduk.
      carpma isleni kullanacagımzı ıcın deger oalrak =1 dedik.
          */

        double kombinasyon = 1;
        double faktoriyelN = 1;
        double faktoriyelR = 1;
        double faktoriyelNeksiR = 1;


        for (int i = 1; i <= n; i++) {
            faktoriyelN = faktoriyelN * i; // 1*2*3*4*....* n=n!

        }

        for (int i = 1; i <= r; i++) {
            faktoriyelR = faktoriyelR * i;  //  1*2*3*4*....* r=r!

        }

        for (int i = 1; i <= (n - r); i++) {
            faktoriyelNeksiR = faktoriyelNeksiR * i;  // 1*2*3*4*....* n-r=(n-r)!

        }
        System.out.println(faktoriyelNeksiR);
        kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelNeksiR);
        System.out.println(kombinasyon);


    }


}
