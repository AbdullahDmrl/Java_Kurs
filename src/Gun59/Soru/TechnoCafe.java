package Gun59.Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        ArrayList<IFood> siparisler=new ArrayList<>();

        Scanner oku=new Scanner(System.in);
        int secim=0;
        do { TechnoKitchen.menu();
            System.out.print("Seciminizi giriniz :");
            secim= oku.nextInt();
            TechnoKitchen.siparisAl(siparisler, secim);
        }while (secim!=0 && secim<5);

        TechnoKitchen.siparisHazirla(siparisler);


    }




}
