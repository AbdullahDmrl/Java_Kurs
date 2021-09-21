package Gun12;

import java.util.Scanner;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // Kullanıcıdan alt ve üst değeri  tek bir satırda arasında virgül olarak (önce min virgül
        // sonra max değeri) alarak sayı üretiniz ve ekrana yazdırınız.
        // 34 56 şeklinde tek bir satırda girecek min ve max ı   5,75 gibi

        Scanner oku=new Scanner(System.in);
        System.out.print("Alt ve ust deger giriniz="); 
        String minMax=oku.nextLine()+","+oku.nextLine();
        System.out.println(minMax);
       
        String min=minMax.substring(0,minMax.indexOf(","));
        String max=minMax.substring(minMax.indexOf(",")+1);
        
        int min1=Integer.parseInt(min);
        int max1=Integer.parseInt(max);
        
        int urtSay=(int) (Math.random() * ((max1 - min1) + 1)) + min1;
        System.out.println("urtSay = " + urtSay);
        
        



    }
}
