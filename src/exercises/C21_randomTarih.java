package exercises;

import java.time.LocalDate;
import java.util.Random;

public class C21_randomTarih {
    /*
    4.   Sorumuz
      Bir arraye random olarak oluşturulan 10 tarih ekleyin ve bu tarihleri en eskiden en yeniye doğru sıralayınız.
      Yıl değişkeni için 2013 ile 2023 arasında değer üretin
      Ay değişkeni için 1 ile 12 arasında değer üretin
      Gun değişkeni için 1 ile 28 arasında değer üretin
      LocalDate classını kullanarak bu 3 değişkeni bir metod içine gönderin ve random tarih üretiniz.
     */



    public static void main(String[] args) {

        tarihOlusturtma();
    }

    private static void tarihOlusturtma() {
        LocalDate[] tarihler = new LocalDate[10];
        Random rnd = new Random();
        for (int i = 0; i <10; i++) {
            int yil= rnd.nextInt(2013,2024);
            int ay= rnd.nextInt(1,13);
            int gun= rnd.nextInt(1,29);
            tarihler[i]=LocalDate.of(yil,ay,gun);

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(tarihler[i]);

        }

    }


}




