package exercises;

public class C09 {
    public static void main(String[] args) {
         /*
         Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
         olusturun.
          */
        String[] str = {"ali", "veli", "a"};
        enUzunEnKisa(str);
    }
    private static void enUzunEnKisa(String[] str) {
        String enUzun = str[0];
        String enKisa = str[0];
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > enUzun.length()) {
                enUzun = str[i];
            }
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < enKisa.length()) {
                enKisa = str[i];
            }
        }
        System.out.println("En Uzun Eleman : " + enUzun + " \nEn kisa eleman : " + enKisa);
    }
}
