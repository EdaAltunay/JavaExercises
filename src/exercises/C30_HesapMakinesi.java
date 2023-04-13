package exercises;

import java.util.Scanner;

public class C30_HesapMakinesi {
    public static void main(String[] args) {
        /*
           TASK :
           Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
           dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("(1- Toplama, 2- Cikarma, 3- Carpma, 4- Bolme) \nLutfen yapmak istediginiz islem numarasini giriniz : ");
        int secim = scan.nextInt();
        System.out.println("Lutfen islem yapmak icin iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2= scan.nextDouble();
        switch (secim){
            case 1:
                System.out.println("Girilen saylarin toplami : "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Girilen saylarin farki : "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Girilen saylarin carpimi : "+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Girilen saylarin bolumu : "+(sayi1/sayi2));
                break;
            default:
    }
}}
