package exercises;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        /*
        Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
kontrol edin ve sonucu yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen asallıgını merak ettıgınız pozitif bir tamsayi giriniz: ");
        int sayi = scan.nextInt();
        int flag = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag++;

            }
        }
        if ( flag>0 ||sayi==1){
            System.out.println("girilen sayi asal degildir.");
        }

       else if (flag==0 || sayi==2){
            System.out.println("Girilen sayi asaldir");
        }

    }
}
