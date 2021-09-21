package Gun13;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Kullanıcının girdiği gün sayısına karşılık gelen gün adını yazınız.
        // 1.gün Pazartesi olsun

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir gun numarasi giriniz=");
        int gunNo= oku.nextInt();

//      if (gunNo==1)
//            System.out.println("Pazartesi");
//        else
//            if (gunNo==2)
//                System.out.println("Salı");
//        ....

        switch (gunNo) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default: // yukarıdakilerin dışındaysa
                System.out.println("hatalı değer");
            }
    }
}
