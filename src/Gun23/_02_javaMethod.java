package Gun23;

import java.util.Scanner;

public class _02_javaMethod {
    public static void main(String[] args) {

        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Iki sayi giriniz=");
        int say1= oku.nextInt();
        int say2= oku.nextInt();

        int enb=enBuyukBul(say1,say2);
        System.out.println("enb = " + enb);


    }

    public static int enBuyukBul(int s1,int s2)
    {
        int enb=0;
 //       if (s1>s2)
  //          enb=s1;
  //      else
  //          enb=s2;
   //     return enb
        if (s1>s2)
            return s1;
        else 
            return s2;

        

    }


}
