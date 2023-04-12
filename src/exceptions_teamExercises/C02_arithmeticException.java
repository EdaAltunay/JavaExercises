package exceptions_teamExercises;

public class
C02_arithmeticException {
    public static void main(String[] args) {
        // Verilen iki tamsayiyi birbirine bolup
        // sonucun tamsayi kismini yazdirin

        int sayi1=20;
        int sayi2=0;

        try {
            System.out.println(sayi1/sayi2);
            System.out.println("bbb");
        } catch (ArithmeticException e) {
            System.out.println(" bölen sıfır olmaz");

        }


    }
}
