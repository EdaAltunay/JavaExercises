package exercises;

public class C02 {
    public static void main(String[] args) {
        /*
        name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik"
		 yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmetn
		         Print ==> mehahmetmet
         */


       String name1="Ömer";
       String name2="Salih";
       int name1karaktersayısı=name1.length();
       String str1=name1.substring(0,name1karaktersayısı/2);
       String str2=name1.substring((name1karaktersayısı/2),name1karaktersayısı);
        if (name1karaktersayısı%2==0){
            System.out.println(str1+name2+str2);
        }else {
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }



    }
}
