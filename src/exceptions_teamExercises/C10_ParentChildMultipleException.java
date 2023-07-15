package exceptions_teamExercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C10_ParentChildMultipleException {
    public static void main(String[] args) {
        // genelde IOException larda gozukur. dosya okuma yazma islemlerinde.
        // baslarken methoddaki throws u sil ve try-catch icine al..



        String dosyaYolu = "src/exceptions_teamExercises/dosya";


        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            fis = new FileInputStream(dosyaYolu);
            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }
        }

        catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){

        }


    }}



