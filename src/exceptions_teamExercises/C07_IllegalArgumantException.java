package exceptions_teamExercises;

import java.util.Scanner;

public class C07_IllegalArgumantException {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");

        int yas= scan.nextInt();

        if (yas<0){
            System.out.println("Hatalı Parametre girişi yapıldı!");
        }else{
            System.out.println("Başarılı bir şekilde kayıt yapıldı.");
        }







    }}
