package Gun37.DigerErisimler.ProtectedErisim.Bir;

public class HastaneAnkara {
    public static void main(String[] args) {

        Doktor dr=new Doktor();  // ayni pakette oldugu icin protected bolume erisiliyor
        dr.ad ="Necdet";

        Doktor dr2=new Doktor("Furkan"); // public kisma her yerden ulasiliyor
    }



}
