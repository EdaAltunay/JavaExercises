package exceptions_teamExercises;

public class C06_NumberFormatException {

    public static void main(String[] args) {

        String str = "12";
        System.out.println(Integer.parseInt(str));//12
        String str2 = "12a";
        System.out.println(Integer.parseInt(str2));  // NumberFormatException

    }
}
