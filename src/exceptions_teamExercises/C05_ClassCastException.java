package exceptions_teamExercises;

public class C05_ClassCastException {
    public static void main(String[] args) {
        String str = "Java Candir";

        Object obj = str;

        Integer a = (Integer) obj; // ClassCastException

///////////////////////////////////////////////////////////
        short sayi1 = 23;
        int sayi2 = sayi1;

        Short sayi3 = 24;
        // Integer sayi4=sayi3;  Integer ve Short arasinda parent-child iliskisi olmadigindan
        //                       birbirine atama yapamazsiniz


        // Aralarinda parent-child iliskisi olan class'lardan olusan objeler icin
        // auto-widening veya explicit-narrowing mumkundur

        Object obj1 = sayi3;
        System.out.println("Short'dan obje'ye cast edince : " + obj1);

        Integer sayi5 = (Integer) obj;

        System.out.println("Short datayi obje uzerinden Integer'a cevirince : " + sayi5);
        // ClassCastException

    }


}
