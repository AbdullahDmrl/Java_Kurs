package Gun18;

import java.util.Arrays;

public class _02_JavaArray {
    public static void main(String[] args) {

       int sayi; // daha once bir degiskeni boyle tanimliyorduk
        int[] dizil=new int[5]; // 0,1,2,3,4  indexli 5 adet sayilik yer actik




        System.out.println("Dizil.lenght="+dizil.length);




        for (int i=0; i<dizil.length; i++)
        {
            System.out.println("Dizi nin"+i+".Elamani="+dizil[i]);



        }

        System.out.println("dizil[4]="+dizil[4]);
    }
}
