package Gun49.Ornrk1;

public class SirketMain {
    public static void main(String[] args) {
        Yonetici mudur=new Yonetici();
        // Personelin her fieldını kullanabiliyor
        // erişim izni olunca
        mudur.maas = 3000;
        mudur.departman = "Destek birimi";


        System.out.println(mudur.getMaas());
        mudur.zamYap(20);

        Personel guvenlikGorevlisi=new Personel();
        guvenlikGorevlisi.maas=1500;
        System.out.println(guvenlikGorevlisi.getMaas());






    }





}
