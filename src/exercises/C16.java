package exercises;

public class C16 {
    public static void main(String[] args) {


        int numberOfBananas = 165;
        int survivalDays = 0;
        boolean monkeyAlive = true;

        do {
            System.out.println(" maymunlar gunde 4 muz yer ");
            numberOfBananas -= 4; // toplam muz sayisindan her seferinde 4 muz eksilir
            survivalDays++;  // yasadigi gun sayisi 1 artirilir
            if (numberOfBananas < 4) { //  4 den az muz kalirsa
                monkeyAlive = false;
                System.out.println(" bugun " + survivalDays + " . gun muz kalmadi , maymun sizlere omur");

            } else {
                System.out.println(" bugun " + survivalDays + " . gun maymun hala yasiyor ");
            }

        } while (monkeyAlive);
        System.out.println(" toplam maymunun yasadigi gun sayisi  : " + (survivalDays)); // yasam gunu 0 dan basladigi icin
    }
}