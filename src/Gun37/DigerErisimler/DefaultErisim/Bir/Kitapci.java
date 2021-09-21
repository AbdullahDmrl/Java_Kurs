package Gun37.DigerErisimler.DefaultErisim.Bir;

public class Kitapci {

    public static void main(String[] args) {


        Kitap eskiKitap=new Kitap();   // Default olan
        eskiKitap.name="yeni Java Kitabı";

        Kitap yeniKitap=new Kitap("Java Kitabı"); //puplic olan
    }



}
