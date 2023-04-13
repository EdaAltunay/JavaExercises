package exercises;

import java.util.Scanner;

public class C31_VKI {/* TASK :
 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
   INFO :
BMI = kilo(kg) /(boy*boy)(m)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double kilo=0;
        double boy=0;
        double BMI=0;


        System.out.println("lütfen boyunuzu(m) ve kilonuzu giriniz(kg)");

        boy=scan.nextDouble();
        kilo=scan.nextDouble();
        BMI=kilo/(boy*boy);
        System.out.println(BMI);

        if (BMI<=20){
            System.out.println("oldukca zayıfsınız");

        }else if (BMI>20 && BMI<=25) {
            System.out.println("normal sınırdasınız");

        } else if (BMI>25 && BMI<=30) {
            System.out.println("sısman kategorisindesiniz");

        } else if (BMI>30) {
            System.out.println("obez durumundasiniz");

        }else {
            System.out.println("yanlis giris yaptınız");
        }

    }
}
