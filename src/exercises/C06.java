package exercises;

public class C06 {
    public static void main(String[] args) {



            //Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
            //kullanildigini yazdiran bir method olusturun.
            int[] arr = {1, 2, 3, 4, 5, 3, 4, 5, 63, 5};
            int arananEleman = 3;
            System.out.println(elemanKontrolEt(arr, arananEleman));
        }

        public static String elemanKontrolEt ( int[] arr, int arananEleman){
            int sayac=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arananEleman) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                System.out.println("Aranan elaman Array'de yok");
                System.exit(0);
            }
            String sonuc = "Aranan eleman Array'de " + sayac + " tane vardır.";
            return sonuc;
        }

}












