package Gun24;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_ArrayListSoru {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek elemanlarını ayrı diziye bir metodda atayarak
        // main de yazdırınız.


        Scanner scan=new Scanner(System.in);

        int[] intArray=new int[6];

        for (int i = 0; i <intArray.length ; i++) {
            System.out.print("Sayi giriniz=");
            intArray[i]=scan.nextInt(); }

        tekSayilar(intArray);
        System.out.println(tekSayilar(intArray)); // return oldugu icin buyeterli
        // void olsa idi asgida return yapmam lazindi
    }


    public static ArrayList<Integer>tekSayilar(int[]dizi){
        ArrayList<Integer> liste=new ArrayList<>();

        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]%2==1)
                liste.add(dizi[i]); }
        return liste; }  // burada veri gondren aktif yaptigimiz icin sadece print yeterli

}
