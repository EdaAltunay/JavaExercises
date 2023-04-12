package exceptions_teamExercises;

public class C04_NullPointerException {
    public static void main(String[] args) {
        String str = null;


        try {
            String str2=str.substring(1,2);  //NullPointerException
        } catch (NullPointerException e) {
            System.out.println(" null olarak atanmıs String variable ile String methodu kullanılamaz.");
        }


    }
}
