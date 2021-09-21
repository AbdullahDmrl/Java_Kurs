package Gun22;

public class _02_javaMethod {



    public static void main(String[] args) {

        merhabaYaz();
        merhabaisme("Ismet"); // parametre gonderme
        merhabaisme("Ahmet");

        merhabaYaz();
        merhabaisme("Aycan");


    }

    public static void merhabaYaz()
    {
        System.out.println("merhaba"+" ");
    }

    public static void merhabaisme(String isim)
    {
        System.out.println("merhaba"+" "+isim.toUpperCase());

        // for while do while her sey yazabiliriz
    }


}
