package exercises;

public class C09_arrayEnKisaenUzunEleman {
    public static void main(String[] args) {
         /*
         Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
         olusturun.
          */
        String[] str = {"ali", "veli", "a"};
        enUzunEnKisa(str);
    }
    private static void enUzunEnKisa(String[] strArr) {
        String enUzun = strArr[0];
        String enKisa = strArr[0];

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > enUzun.length()) {
                enUzun = strArr[i];
            }
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() < enKisa.length()) {
                enKisa = strArr[i];
            }
        }
        System.out.println("En Uzun Eleman : " + enUzun + " \nEn kisa eleman : " + enKisa);
    }
}
