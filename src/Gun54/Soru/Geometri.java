package Gun54.Soru;

public class Geometri {
    public static void main(String[] args) {
     Kare kare=new Kare();
     System.out.println("Kare Alan = " +  kare.Alan(4));
     System.out.println("Kare cevre = " +    kare.Cevre(4));

     Cember cember=new Cember();
     System.out.println("Cember Alan = " + cember.Alan(4));
     System.out.println("Cember cevre = " + cember.Cevre(4));

     Dikdortgen dikdortgen=new Dikdortgen();
     System.out.println("Dikdortgen alan= " + dikdortgen.Alan(4,8));
     System.out.println("Dikdortgen cevre= " + dikdortgen.Cevre(4,8));


    }


}
