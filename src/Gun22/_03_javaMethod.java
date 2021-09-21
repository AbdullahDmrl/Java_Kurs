package Gun22;

public class _03_javaMethod {


    public static void main(String[] args) {

        tekMicftMI(3);
        tekMicftMI(6);

        toplam(3,4);
        toplam(10,15);

    }

    public static void  tekMicftMI(int sayi)
    { if (sayi%2==1)
      System.out.println("tek");
           else
            System.out.println("cift"); }

    public static void toplam(int s1,int s2) {

        System.out.println("toplam = " + (s1+s2));
    }



}
