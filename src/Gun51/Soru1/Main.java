package Gun51.Soru1;

public class Main {
    public static void main(String[] args) {
        Cember cember=new Cember(3);
       // System.out.println("cember.getCevre() = " + cember.getCevre());
       // System.out.println("cember.getAlan() = " + cember.getAlan());
        // alani almak istersek try catch kullanmamiz gerek

        Dikdortgen dikdortgen=new Dikdortgen(6,4);
       // System.out.println("dikdortgen.getCevre() = " + dikdortgen.getCevre());
       // System.out.println("dikdortgen.getAlan() = " + dikdortgen.getAlan());

        Kare kare=new Kare(5);
     //  System.out.println(kare.getAlan());
      System.out.println(kare.getCevre());

        System.out.println(kare);
        System.out.println(dikdortgen);
        System.out.println(cember);


    }
}
